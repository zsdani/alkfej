package hu.elte.NeptunApp.controller;

import hu.elte.NeptunApp.entities.Exam;
import hu.elte.NeptunApp.entities.User;
import hu.elte.NeptunApp.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/exams")
public class ExamController {

    @Autowired
    private ExamRepository examRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Exam>> getAll() {
        return ResponseEntity.ok(examRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exam> get(@PathVariable Integer id) {
        Optional<Exam> exam = examRepository.findById(id);
        if (exam.isPresent()) {
            return ResponseEntity.ok(exam.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Exam> post(@RequestBody Exam exam) {
        Exam savedExam = examRepository.save(exam);
        return ResponseEntity.ok(savedExam);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exam> put(@RequestBody Exam exam, @PathVariable Integer id) {
        Optional<Exam> oExam = examRepository.findById(id);
        if (oExam.isPresent()) {
            exam.setId(id);
            return ResponseEntity.ok(examRepository.save(exam));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Exam> oExam = examRepository.findById(id);
        if (oExam.isPresent()) {
            examRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
