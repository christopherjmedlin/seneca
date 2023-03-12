package xyz.christophermedlin.seneca.services;

import xyz.christophermedlin.seneca.entities.TodoList;

public interface TodoListService {
  TodoList getList(Long id);
  void createList(TodoList list);
}
