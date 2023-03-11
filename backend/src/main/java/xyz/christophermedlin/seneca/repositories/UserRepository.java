package xyz.christophermedlin.seneca.repositories;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.repository.CrudRepository;

import xyz.christophermedlin.seneca.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
  User findByUsername(String username);
}
