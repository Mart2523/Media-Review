import {FormControl} from "@angular/forms";

export class Book {
  isbn: string;
  author: string;
  title: string;
  addedBy: string = ""


  genres: string[] = []



  constructor(isbn: string, author: string, title: string) {
    this.isbn = isbn;
    this.author = author;
    this.title = title;

  }
}
