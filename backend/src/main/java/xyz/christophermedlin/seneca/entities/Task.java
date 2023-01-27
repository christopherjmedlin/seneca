package xyz.christophermedlin.seneca.entities;

import jakarta.persistence.ManyToOne;

public class Task {
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

  private boolean getWeekly() {
    return this.weekly;
  }
}
