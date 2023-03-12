package xyz.christophermedlin.seneca.services;

import xyz.christophermedlin.seneca.entities.User;
import xyz.christophermedlin.seneca.views.UserView;

public interface UserService {
  public void createUser(String username, String password);
  public UserView getUser(String username);
  public User getUserWithPassword(String username);
}
