package xyz.christophermedlin.seneca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 * Used for representing who did a task. There is always by default a Person corresponding
 * to the user who created the list.
 */
@Entity
public class Person {
  private @Id @GeneratedValue Long id;
  private String name;

  @ManyToOne()
  private TodoList list;

  @ManyToOne()
  private User user;

  public Person(String name, TodoList list, User user) {
    this.name = name;
    this.list = list;
    this.user = user;
  }

  public String getName() {
    return name;
  }
}
