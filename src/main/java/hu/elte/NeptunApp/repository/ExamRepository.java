package hu.elte.NeptunApp.repository;


import hu.elte.NeptunApp.entities.Exam;
import org.springframework.data.repository.CrudRepository;

public interface ExamRepository extends CrudRepository<Exam, Integer> {
}