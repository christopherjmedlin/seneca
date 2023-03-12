package xyz.christophermedlin.seneca.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.christophermedlin.seneca.entities.TodoList;
import xyz.christophermedlin.seneca.entities.User;
import xyz.christophermedlin.seneca.services.TodoListService;
import xyz.christophermedlin.seneca.services.UserService;

@RestController
@RequestMapping("/lists")
public class TodoListController {
  
  @Autowired
  TodoListService listService;

  @Autowired
  UserService userService;

  @PostMapping("")
  public TodoList createList(@RequestBody TodoList list,
                         Principal principal) {
    User currentUser = userService.getUserWithPassword(principal.getName());
    list.setOwner(currentUser);
    listService.createList(list);
    return listService.getList(list.getId());
  }
}
