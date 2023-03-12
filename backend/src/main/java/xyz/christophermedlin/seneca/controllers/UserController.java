package xyz.christophermedlin.seneca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.christophermedlin.seneca.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  UserService service;

  @PostMapping("")
  public void createUser(@RequestBody LoginSubmission signup) {
    this.service.createUser(signup.getUsername(), signup.getPassword());
  }

  public static class LoginSubmission {
    private String username;
    private String password;

    public LoginSubmission(String username, String password) {
      this.username = username;
      this.password = password;
    }

    public String getUsername() {
      return this.username;
    }

    public String getPassword() {
      return password;
    }
  }
}
