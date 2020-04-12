package hu.elte.NeptunApp.repository;


import hu.elte.NeptunApp.entities.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, Integer> {
}