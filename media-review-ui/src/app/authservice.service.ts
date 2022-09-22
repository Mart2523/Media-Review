import { Injectable } from '@angular/core';
import {User} from "./create-user/user";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class AuthserviceService {
  user: User = new User('','','','')
  isLoggedin = false;
  constructor(private http: HttpClient) { }

  checkLogValues(value: User): boolean {
    if (this.user.email === value.email && this.user.password === value.password){
      alert("Login Valid")
      return true;
    }
    else {
      alert("Please enter valid Data")
      return false;
    }
  }
}
