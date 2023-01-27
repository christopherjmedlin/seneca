package xyz.christophermedlin.seneca.entities;

import java.util.Date;

import jakarta.persistence.ManyToOne;

public class Done {
  private Date doneOnDate;

  @ManyToOne
  private CheckIn checkIn;

  @ManyToOne
  private TodoListItem task;

  @ManyToOne
  private Person doneByPerson;

  public Done(Date doneOnDate, CheckIn checkIn, TodoListItem task, Person doneByPerson) {
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

  public TodoListItem getTask() {
    return task;
  }

  public void setTask(TodoListItem task) {
    this.task = task;
  }

  public Person getDoneByPerson() {
    return doneByPerson;
  }

  public void setDoneByPerson(Person doneByPerson) {
    this.doneByPerson = doneByPerson;
  }
}
