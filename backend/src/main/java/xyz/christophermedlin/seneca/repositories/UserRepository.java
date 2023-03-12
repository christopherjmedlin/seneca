package xyz.christophermedlin.seneca.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import xyz.christophermedlin.seneca.entities.User;
import xyz.christophermedlin.seneca.views.UserView;

public interface UserRepository extends CrudRepository<User, Long> {
  User findByUsername(String username);

  @Query( "SELECT u.username AS username, u.id AS id " +
          "FROM User u " +
          "WHERE u.username = :username")
  UserView findByUsernameNoPassword(String username);
}
