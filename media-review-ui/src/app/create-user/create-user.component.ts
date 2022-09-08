import { Component, OnInit } from '@angular/core';
import {User} from "./user";
import {UserService} from "./user.service";
import {Router} from "@angular/router";


@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrls: ['./create-user.component.css']
})
export class CreateUserComponent implements OnInit {

  user: User = new User("", "", "", "")
  constructor(private userService: UserService, private router: Router) { }

  ngOnInit(): void {
  }

  saveUser() {
    this.userService.addUser(this.user).subscribe(data=> {
      this.getToBookList();
    })

  }

  getToBookList(){
    this.router.navigate(["/books"]).then();
  }

  onSubmit(){

    this.saveUser()

  }
}
