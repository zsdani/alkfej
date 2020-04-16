package hu.elte.NeptunApp.controller;


import hu.elte.NeptunApp.entities.Subject;
import hu.elte.NeptunApp.entities.User;
import hu.elte.NeptunApp.repository.SubjectRepository;
import hu.elte.NeptunApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<User>> getAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/{id}/subjects")
    public ResponseEntity<Iterable<Subject>> getSubjectByUser(@PathVariable Integer id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get().getSubjects());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("")
    public ResponseEntity<User> post(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }


    @PostMapping("/{id}/subjects")
    public ResponseEntity<User> insertSubject(@PathVariable Integer id, @RequestBody Subject subject) {
        Optional<User> byId = userRepository.findById(id);
        if (byId.isPresent()) {
            User user = byId.get();
            Subject newSubject = subjectRepository.save(subject);
            user.getSubjects().add(newSubject);
            user.setSum_credit(user.getSum_credit() + newSubject.getCredit());
            userRepository.save(user);
            newSubject.setNumberOfUsers(newSubject.getNumberOfUsers() + 1);
            subjectRepository.save(newSubject);
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<User> put(@RequestBody User user, @PathVariable Integer id) {
        Optional<User> oUser = userRepository.findById(id);
        if (oUser.isPresent()) {
            user.setId(id);
            return ResponseEntity.ok(userRepository.save(user));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<User> oUser = userRepository.findById(id);
        if (oUser.isPresent()) {
            for(Subject s : oUser.get().getSubjects()) {
                s.setNumberOfUsers(s.getNumberOfUsers() - 1);
                subjectRepository.save(s);
            }
            userRepository.deleteById(id);
            System.out.println("User deleted");
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}