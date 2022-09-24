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
import {AuthserviceService} from "./authservice.service";
import {CookieService} from "ngx-cookie-service";
import {User} from "./create-user/user";
import {Router} from "@angular/router";
import {LoginuserService} from "./loginuser.service";
import {UserLoginComponent} from "./user-login/user-login.component";



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

form!: FormGroup; // TS 2.7 workaround
formSubmitted = false;
Obj: User = new User("","","","")

constructor(private loginserv: LoginuserService, private router: Router, private fb: FormBuilder, private srvLogin: AuthserviceService, private cookieService: CookieService) {


  this.form = this.fb.group({
    checkArray: this.fb.array([]),


  })
}

onCheckboxChange(e:any){
  const checkArray: FormArray = this.form.get('checkArray') as FormArray;
}


  ngOnInit(): void {
  }

  loggedIn = this.loginserv.loggedIn

logout():void {
  this.loggedIn = false;
  this.router.navigate(['/login'])
  this.cookieService.deleteAll();



}

}


