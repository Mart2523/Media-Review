import { Component, OnInit } from '@angular/core';
import {
  FormGroup,
  FormBuilder,
  FormControl,
  AbstractControl,
  ValidationErrors,
  ValidatorFn,
  Validators,
  ControlContainer,
  FormArray
} from '@angular/forms';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

form!: FormGroup; // TS 2.7 workaround
formSubmitted = false;

constructor(private fb: FormBuilder) {
  this.form = this.fb.group({
    checkArray: this.fb.array([]),
  })
}

onCheckboxChange(e:any){
  const checkArray: FormArray = this.form.get('checkArray') as FormArray;
}


  ngOnInit(): void {
  }

}


