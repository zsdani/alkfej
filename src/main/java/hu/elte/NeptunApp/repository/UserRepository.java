package hu.elte.NeptunApp.repository;

import hu.elte.NeptunApp.entities.User;
import hu.elte.NeptunApp.entities.enums.Role;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAllByRole(Role role);

    Optional<User> findByUsername(String username);
}
