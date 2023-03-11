package xyz.christophermedlin.seneca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xyz.christophermedlin.seneca.entities.TodoList;
import xyz.christophermedlin.seneca.entities.User;

@Repository
public interface TodoListRepository extends JpaRepository<TodoList, Long> {
  List<TodoList> findByOwner(User owner);
  List<TodoList> findByName(String name);
}
