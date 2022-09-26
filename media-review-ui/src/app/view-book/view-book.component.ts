import { Component, OnInit } from '@angular/core';
import {Book} from "../book/book";
import {BookService} from "../book/book.service";



@Component({
  selector: 'app-view-book',
  templateUrl: './view-book.component.html',
  styleUrls: ['./view-book.component.css']
})
export class ViewBookComponent implements OnInit {

  book: Book = new Book("","","");

  constructor(private bookService: BookService) { }


  ngOnInit() {

    let isbn = "";
    this.bookService.getBook(isbn).subscribe(data=>{
      console.log("data received");
      this.book=data;
    },
      error => console.log("exception occurred"))
  }
  // ngOnInit(): void {
  //   this.bookService.getBook("isbn").subscribe((data)=>{
  //     this.book = data;
  //   });


  }
