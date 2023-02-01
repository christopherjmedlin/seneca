package xyz.christophermedlin.seneca.entities;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class TodoList {
  private @Id @GeneratedValue Long id;
  private String name;
  private Date created;

  @OneToMany(mappedBy = "list")
  private Set<Task> tasks;

  @ManyToOne()
  private UserData owner;

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
