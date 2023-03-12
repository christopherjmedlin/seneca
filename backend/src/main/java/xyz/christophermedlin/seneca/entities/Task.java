package xyz.christophermedlin.seneca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Task {
  private @Id @GeneratedValue Long id;
  private String name;
  private boolean weekly;

  @ManyToOne
  private TodoList list;

  public Task() {}

  public Task(String name, boolean weekly) {
    this.name = name;
    this.weekly = weekly;
  }

  public Task(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean getWeekly() {
    return this.weekly;
  }
}
