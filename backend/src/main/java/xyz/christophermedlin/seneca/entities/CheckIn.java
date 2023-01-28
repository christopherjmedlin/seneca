package xyz.christophermedlin.seneca.entities;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.OneToMany;

public class CheckIn {
  private Date date;

  @OneToMany
  private Set<Done> done;

  public CheckIn(Date date) {
    this.date = date;
  }

  public CheckIn() {}

  public Date getDate() {
    return date;
  }

  public Set<Done> getDone() {
    return done;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
