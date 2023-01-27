package xyz.christophermedlin.seneca.entities;

import jakarta.persistence.ManyToOne;

public class Person {
  private int id;
  private String name;

  @ManyToOne()
  private User user;
}
