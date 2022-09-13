import {FormControl} from "@angular/forms";

export class Book {
  isbn: string;
  author: string;
  title: string;
  genreForm =  new FormControl('');
  genreOptions: String[] = ["Horror","SyFy","Romance","Fantasy"];
  genres: string[] = [];

  constructor(isbn: string, author: string, title: string, genres: string[],) {
    this.isbn = isbn;
    this.author = author;
    this.title = title;
    for (let i = 0; i < genres.length; i++){
      this.genres.push(genres[i]);
    }
  }
}
