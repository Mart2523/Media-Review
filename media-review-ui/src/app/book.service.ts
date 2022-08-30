import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";

const baseUrl = 'https://localhost:8080/getBooks'

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(
    private http: HttpClient
  ) { }

  getBooks(){
    return this.http.get(baseUrl);
  }

}
