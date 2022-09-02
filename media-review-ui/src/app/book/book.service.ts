import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Book} from "./book";
import {Observable} from "rxjs";



@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl = 'http://localhost:8080/getBooks'

  constructor(
    private http: HttpClient
  ) { }

  public getBooks(): Observable<Book[]>{
    return this.http.get<Book[]>(this.baseUrl);
  }


}
