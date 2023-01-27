package xyz.christophermedlin.seneca.entities;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class TodoList {
  private String name;
  private Date created;

  @OneToMany(mappedBy = "list")
  private Set<Task> tasks;

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
