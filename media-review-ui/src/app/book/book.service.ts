// @ts-ignore
import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Book} from "./book";
import {Observable} from "rxjs";
import {CookieService} from "ngx-cookie-service";



@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl = 'http://localhost:8080'

  constructor(
    private http: HttpClient, private cookies: CookieService
  ) { }

  public getBooks(): Observable<Book[]>{
    return this.http.get<Book[]>(`${this.baseUrl}/getBooks`);
  }
  public addBook(book: Book): Observable<Object>{
    return this.http.post<Book>(`${this.baseUrl}/addBook`, book);
  }
  public getBook(isbn: Book) : Observable<Book>{
    return this.http.get<Book>(`${this.baseUrl}/getBook/{isbn}`);
  }

}
