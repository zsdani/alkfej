package hu.elte.NeptunApp.controller;


import hu.elte.NeptunApp.entities.Subject;
import hu.elte.NeptunApp.entities.User;
import hu.elte.NeptunApp.repository.SubjectRepository;

import java.lang.Integer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Subject>> getAll() {
        return ResponseEntity.ok(subjectRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subject> get(@PathVariable Integer id) {
        Optional<Subject> subject = subjectRepository.findById(id);
        if (subject.isPresent()) {
            subject.get().setNumberOfUsers(subject.get().getUsers().size());
            return ResponseEntity.ok(subject.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}/users")
    public ResponseEntity<Iterable<User>> getAllUsersBySubject(@PathVariable Integer id) {
        Optional<Subject> byId = subjectRepository.findById(id);
        if (byId.isPresent()) {
            //System.out.println(byId.get().getUsers().size());
            return ResponseEntity.ok(byId.get().getUsers());
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    @PostMapping("")
    public ResponseEntity<Subject> post(@RequestBody Subject subject) {
        Subject savedSubject = subjectRepository.save(subject);
        return ResponseEntity.ok(savedSubject);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Subject> put(@RequestBody Subject subject, @PathVariable Integer id) {
        Optional<Subject> oSubject = subjectRepository.findById(id);
        if (oSubject.isPresent()) {
            subject.setId(id);
            return ResponseEntity.ok(subjectRepository.save(subject));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Subject> oSubject = subjectRepository.findById(id);
        if (oSubject.isPresent()) {
            subjectRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}