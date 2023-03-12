package xyz.christophermedlin.seneca.repositories;

import org.springframework.data.repository.CrudRepository;

import xyz.christophermedlin.seneca.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
  User findByUsername(String username);
}
