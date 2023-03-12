package xyz.christophermedlin.seneca.services;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.christophermedlin.seneca.entities.TodoList;
import xyz.christophermedlin.seneca.repositories.TodoListRepository;

@Service
public class TodoListServiceImpl implements TodoListService {

  @Autowired
  TodoListRepository repository;

  @Override
  public void createList(TodoList list) {
    list.setCreated(new Date(System.currentTimeMillis()));
    this.repository.save(list);
  }

  @Override
  public TodoList getList(Long id) {
    return this.repository.getReferenceById(id);
  }
}
