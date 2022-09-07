import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Book} from "./book";
import {Observable} from "rxjs";



@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl = 'http://localhost:8080'

  constructor(
    private http: HttpClient
  ) { }

  public getBooks(): Observable<Book[]>{
    return this.http.get<Book[]>(`${this.baseUrl}/getBooks`);
  }
  public addBook(book: Book): Observable<Book>{
    return this.http.post<Book>(`${this.baseUrl}/addBook`, book);
  }

}
