import { Component, OnInit } from '@angular/core';
import {LoginuserService} from "../loginuser.service";
import {User} from "../create-user/user";
import {Router} from "@angular/router";

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {
  user:User = new User('','','','')

  constructor(private loginuserservice: LoginuserService, private router: Router) { }

  ngOnInit(): void {
  }

  userLogin(){
    this.loginuserservice.loginUser(this.user).subscribe(data=>{
      alert("Login Successful");
      this.getToBookList()
    }, error => alert("Please enter correct credentials"))


  }

  getToBookList(){
    this.router.navigate(["/books"]).then();
  }
}
