import {FormControl} from "@angular/forms";

export class Book {
  isbn: string;
  author: string;
  title: string;
  genreForm =  new FormControl('');
  genres: string[] = ["Horror", "Romance", "SyFy"];

  constructor(isbn: string, author: string, title: string) {
    this.isbn = isbn;
    this.author = author;
    this.title = title;
  }
}
