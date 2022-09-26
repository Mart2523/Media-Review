import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from "@angular/common/http";
import { AppRoutingModule} from "./app-routing.module";
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { BookComponent } from './book/book.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CreateBookComponent } from './create-book/create-book.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatSelectModule} from "@angular/material/select";
import { CreateUserComponent } from './create-user/create-user.component';
import { UserLoginComponent } from './user-login/user-login.component';
import {Ng2SearchPipeModule} from "ng2-search-filter";
import { ViewBookComponent } from './view-book/view-book.component';

@NgModule({
  declarations: [
    AppComponent,
    BookComponent,
    CreateBookComponent,
    CreateUserComponent,
    UserLoginComponent,
    ViewBookComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    MatFormFieldModule,
    MatSelectModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule
  ],
  providers: [],
  exports: [CreateBookComponent, BookComponent, AppRoutingModule],
  bootstrap: [AppComponent]
})
export class AppModule { }
