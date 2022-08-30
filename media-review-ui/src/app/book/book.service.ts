import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";



@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl = 'https://localhost:8080/getBooks'

  constructor(
    private http: HttpClient
  ) { }

  getBooks(){
    return this.http.get(this.baseUrl);
  }

}
