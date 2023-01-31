package xyz.christophermedlin.seneca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

/**
 * Used for representing who did a task. There is always by default a Person corresponding
 * to the user who created the list.
 */
@Entity
public class Person {
  private int id;
  private String name;

  @ManyToOne()
  private TodoList list;

  @ManyToOne()
  private User user;
}
