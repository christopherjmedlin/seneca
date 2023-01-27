package xyz.christophermedlin.seneca.entities;

import jakarta.persistence.ManyToOne;

public class TodoListItem {
  private String name;
  private boolean weekly;

  public TodoListItem() {}

  public TodoListItem(String name, boolean weekly) {
    this.name = name;
    this.weekly = weekly;
  }

  public TodoListItem(String name) {
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
