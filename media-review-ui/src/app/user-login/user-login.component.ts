import { Component, OnInit } from '@angular/core';
import {LoginuserService} from "../loginuser.service";
import {User} from "../create-user/user";
import {Router} from "@angular/router";
import {CookieService} from "ngx-cookie-service";
import {AuthserviceService} from "../authservice.service";

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {
  user:User = new User('','','','')

  constructor(private cookieService:CookieService,private srvLogin: AuthserviceService, private loginuserservice: LoginuserService, private router: Router) { }

  ngOnInit(): void {
  }
  loggedIn = this.loginuserservice.loggedIn
  userLogin(){
    this.loggedIn = true
    this.loginuserservice.loginUser(this.user).subscribe(data=>{
      this.cookieService.set('email', this.user.email)
      alert("Login Successful");
      this.getToBookList()
    }, error => alert("Please enter correct credentials"))


  }

  onsubmit(): void{
    this.cookieService.set('email', this.user.email);
    this.cookieService.set('password', this.user.password);
    if (this.srvLogin.checkLogValues(this.user)){
      this.srvLogin.isLoggedin = true;
      console.log(this.srvLogin.isLoggedin)
    }
  }

  getToBookList(){
    this.router.navigate(["/books"]).then();
  }
}
