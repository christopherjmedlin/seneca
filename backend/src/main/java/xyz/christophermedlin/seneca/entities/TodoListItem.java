package xyz.christophermedlin.seneca.entities;

public class TodoListItem {
  private String name;
  private boolean weekly;

  public TodoListItem() {}

  public TodoListItem(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
