import { Component, OnInit } from '@angular/core';
import {Book} from "../book/book";
import {BookService} from "../book/book.service";
import {Router} from "@angular/router";


@Component({
  selector: 'app-create-book',
  templateUrl: './create-book.component.html',
  styleUrls: ['./create-book.component.css']
})
export class CreateBookComponent implements OnInit {




 book: Book = new Book("", "", "");
  genreForm: any;

  constructor(private bookService: BookService, private router: Router) { }

  ngOnInit(): void {
  }

  saveBook(){
    this.bookService.addBook(this.book).subscribe( data=>{
      console.log(data);
      this.getToBookList();
    })
  }

  getToBookList(){
    this.router.navigate(["/books"]).then();
  }
  onSubmit(){
    console.log(this.book)
    this.saveBook()

  }

}
