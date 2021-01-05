import { Component, OnInit } from '@angular/core';
import {User} from "../../domain/user";
import {ActivatedRoute, Router} from "@angular/router";
import {UserService} from "../../services/user-service.service";

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html'
})
export class UserFormComponent implements OnInit {

  user: User;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserService) {
    this.user = new User();
  }

  ngOnInit(): void {
  }

  onSubmit() {
    this.userService.save(this.user).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/users']);
  }



}