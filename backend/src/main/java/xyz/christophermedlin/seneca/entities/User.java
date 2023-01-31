package xyz.christophermedlin.seneca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;

@Entity
public class User {
  private @Id @GeneratedValue Long id;
  private String username;
  private String password; 

  @OneToMany(mappedBy="owner")
  private Set<TodoList> lists;
  
  public User() {}

  public User(Long id, String username, String password) {
    this.id = id;
    this.username = username;
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<TodoList> getLists() {
    return lists;
  }

  public void setLists(Set<TodoList> lists) {
    this.lists = lists;
  }
}
