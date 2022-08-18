import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, FormControl,AbstractControl,ValidationErrors, ValidatorFn, Validators, ControlContainer} from '@angular/forms';


// TODO: make this function actually work.
export function setGenreCategoryValidator(): ValidatorFn{
  return (control: AbstractControl): | {[key: string]: string} | null =>
  control.value === "testing" 
  ? null : {invalidGenre: control.value};
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

form!: FormGroup; // TS 2.7 workaround
formSubmitted = false;

genresArray : string[] = ['action','adventure','fantasy']   // only for now

  constructor(private formBuilder: FormBuilder){}
  ngOnInit(): any {
    this.buildForm();
  //  this.form.controls["genres"].addValidators([setGenreCategoryValidator()])

  }

 buildForm() {
  
      this.form = this.formBuilder.group({
        bookTitle: [null],
        authorName: [null],
        isbn: [null, [Validators.required, Validators.minLength(13), Validators.maxLength(13), Validators.pattern('^[0-9]*$')]],
        genres: [null, [Validators.required, setGenreCategoryValidator()]],
      });
    }

    // got lowercase working via css, but probably should remove in favor of better options.
  onSubmit(event : any){
    event.preventDefault();
    this.formSubmitted = true;
  }

  title = 'media-review-ui';
  isbnFormControl = new FormControl('', [Validators.required, Validators.minLength(13), Validators.maxLength(13)])

  genreFormControl = new FormControl('', [Validators.required,Validators.minLength(3)])
}
