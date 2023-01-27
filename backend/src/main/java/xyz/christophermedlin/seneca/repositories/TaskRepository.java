package xyz.christophermedlin.seneca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.christophermedlin.seneca.entities.Task;
import xyz.christophermedlin.seneca.entities.TodoList;

public interface TaskRepository extends JpaRepository<Task, Long> {
  List<Task> findByList(TodoList list);
}
