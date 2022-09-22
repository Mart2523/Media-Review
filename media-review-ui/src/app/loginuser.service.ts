import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "./create-user/user";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class LoginuserService {

private baseUrl = "http://localhost:8080/users/login"
  constructor(private httpClient: HttpClient) { }

  loginUser(user: User):Observable<object>{
    return this.httpClient.post(`${this.baseUrl}`, user)

  }
}
