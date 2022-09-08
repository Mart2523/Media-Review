import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {User} from "./user";
import {Observable} from "rxjs";



@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl = 'http://localhost:8080'

  constructor(
    private http: HttpClient
  ) { }

  public addUser(user: User): Observable<Object>{
    return this.http.post<User>(`${this.baseUrl}/users/register`, user);
  }

}
