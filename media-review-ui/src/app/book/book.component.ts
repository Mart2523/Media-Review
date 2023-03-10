import { Component, OnInit } from '@angular/core';
import {BookService} from "./book.service";
import {Book} from "./book";
import {Router} from "@angular/router";


@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

  books: Book[] = [];
  searchWord: any;

  constructor(private bookService: BookService, private router: Router) { }


  ngOnInit(): void {
    this.bookService.getBooks().subscribe((data)=>{
      this.books = data;
    });


  }

  goToViewBook(isbn: String) {
    this.router.navigate(["/view-book", isbn])

  }

  }


