import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListsComponent } from './lists/lists.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path: "login", component: LoginComponent},
  {path: "lists", component: ListsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
