import { Component, OnInit } from '@angular/core';
import {BookService} from "./book.service";
import {Book} from "./book";


@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

  books: Book[] = [];
  searchWord: any;

  constructor(private bookService: BookService) { }


  ngOnInit(): void {
    this.bookService.getBooks().subscribe((data)=>{
      this.books = data;
    });



  }

  }


