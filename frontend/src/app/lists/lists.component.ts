import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../authentication.service';
import { ListService } from '../list.service';
import { TodoList } from '../todolist';

@Component({
  selector: 'app-lists',
  templateUrl: './lists.component.html',
  styleUrls: ['./lists.component.sass']
})
export class ListsComponent {
  constructor(private listService : ListService) {}

  ngOnInit() {
    this.listService.getLists().subscribe(ls => {
      this.lists = ls;
    });
  }

  lists: TodoList[] = [
    {id: 1, name: "asdf"}
  ]
}
