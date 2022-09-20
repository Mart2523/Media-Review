// @ts-ignore
import { Component, OnInit } from '@angular/core';
import {Book} from "../book/book";
import {BookService} from "../book/book.service";
import {Router} from "@angular/router";
import {FormArray, FormBuilder, FormControl, FormGroup} from "@angular/forms";


@Component({
  selector: 'app-create-book',
  templateUrl: './create-book.component.html',
  styleUrls: ['./create-book.component.css']
})
export class CreateBookComponent implements OnInit {




  book: Book = new Book("", "", "");
  genreForm: any;
  form: FormGroup;
  genreList: string[] = [
    "Mystery",
    "Thriller",
    "Horror",
    "Historical",
    "Romance",
    "Western",
    "Sci-fi",
    "Fantasy",
    "Dystopian",
    "Realist",
    "Non Fiction"
  ]



  constructor(private bookService: BookService, private router: Router, private fb: FormBuilder) {
    this.form = this.fb.group({
      checkArray: this.fb.array([])})
  }

  ngOnInit(): void {
  }

  onCheckboxChange(e:any){
    const checkArray: FormArray = this.form.get('checkArray') as FormArray;
    if (e.target.checked){
      this.book.genres.push((e.target.value));
    }
    else {
      let i = 0;
      checkArray.controls.forEach((item: any) => {
        if (item.value == e.target.value){
          checkArray.removeAt(i);
          return;
        }
      });
      i++;
    }
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
