package xyz.christophermedlin.seneca.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Done {
  private @Id @GeneratedValue Long id;
  private Date doneOnDate;

  @ManyToOne
  private CheckIn checkIn;

  @ManyToOne
  private Task task;

  @ManyToOne
  private Person doneByPerson;

  public Done(Date doneOnDate, CheckIn checkIn, Task task, Person doneByPerson) {
    this.doneOnDate = doneOnDate;
    this.checkIn = checkIn;
    this.task = task;
    this.doneByPerson = doneByPerson;
  }

  public Done() {}

  public Date getDoneOnDate() {
    return doneOnDate;
  }

  public void setDoneOnDate(Date doneOnDate) {
    this.doneOnDate = doneOnDate;
  }

  public CheckIn getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(CheckIn checkIn) {
    this.checkIn = checkIn;
  }

  public Task getTask() {
    return task;
  }

  public void setTask(Task task) {
    this.task = task;
  }

  public Person getDoneByPerson() {
    return doneByPerson;
  }

  public void setDoneByPerson(Person doneByPerson) {
    this.doneByPerson = doneByPerson;
  }
}
