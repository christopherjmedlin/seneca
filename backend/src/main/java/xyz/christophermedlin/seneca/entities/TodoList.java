package xyz.christophermedlin.seneca.entities;

import java.sql.Date;

import jakarta.persistence.ManyToOne;

public class TodoList {
  private String name;
  private Date created;

  @ManyToOne()
  private User owner;

  public TodoList () {}

  public TodoList(String name, Date created) {
    this.name = name;
    this.created = created;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }
}
