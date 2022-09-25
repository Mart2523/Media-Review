import { Component, OnInit } from '@angular/core';
import {Book} from "../book/book";
import {BookService} from "../book/book.service";

@Component({
  selector: 'app-view-book',
  templateUrl: './view-book.component.html',
  styleUrls: ['./view-book.component.css']
})
export class ViewBookComponent implements OnInit {

  book!: Book;
  isbn!: Book;

  constructor(private bookService: BookService) { }

  ngOnInit(): void {
    this.bookService.getBook(this.isbn).subscribe((data)=>{
      this.book = data;
    });


  }

}
