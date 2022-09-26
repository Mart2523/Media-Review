import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookComponent } from './book/book.component';
import {CreateBookComponent} from "./create-book/create-book.component";
import {CreateUserComponent} from "./create-user/create-user.component";
import {UserLoginComponent} from "./user-login/user-login.component";
import {ViewBookComponent} from "./view-book/view-book.component";

const routes: Routes =
  [
    {path: 'books', component: BookComponent},
    {path: 'create-book', component: CreateBookComponent},
    {path: 'create-user', component: CreateUserComponent},
    {path: 'login', component: UserLoginComponent},
    {path: '', redirectTo: 'books', pathMatch: 'full'},
    {path: 'view-book', component: ViewBookComponent},
    {path: 'view-book/:isbn', component: ViewBookComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
