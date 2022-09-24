import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookComponent } from './book/book.component';
import {CreateBookComponent} from "./create-book/create-book.component";
import {CreateUserComponent} from "./create-user/create-user.component";
import {UserLoginComponent} from "./user-login/user-login.component";

const routes: Routes =
  [
    {path: 'books', component: BookComponent},
    {path: 'create-book', component: CreateBookComponent},
    {path: 'create-user', component: CreateUserComponent},
    {path: 'login', component: UserLoginComponent},
    {path: '', redirectTo: 'books', pathMatch: 'full'}

  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
