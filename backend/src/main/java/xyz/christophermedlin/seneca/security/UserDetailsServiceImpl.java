package xyz.christophermedlin.seneca.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import xyz.christophermedlin.seneca.entities.User;
import xyz.christophermedlin.seneca.repositories.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired
  private UserRepository userRepo;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User u = userRepo.findByUsername(username);
    if (u == null) throw new UsernameNotFoundException(username);
    return new UserDetailsImpl(u);
  }
}
