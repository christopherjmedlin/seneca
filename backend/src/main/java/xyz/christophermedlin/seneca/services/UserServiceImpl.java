package xyz.christophermedlin.seneca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import xyz.christophermedlin.seneca.entities.User;
import xyz.christophermedlin.seneca.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void createUser(String username, String password) {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    User u = new User(username, encoder.encode(password));
    userRepository.save(u);
  }
}
