import {Component, OnInit} from '@angular/core';
import {UserService} from "../../services/user-service.service";
import {User} from "../../domain/user";
import {HttpHeaders} from "@angular/common/http";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.scss']
})
export class UserListComponent implements OnInit {

  users: User[];

  constructor(private userService: UserService) {
  }

  public ngOnInit() {
    this.userService.findAll().subscribe(data => {
      this.users = data['_embedded']['users'];
      console.log('users:', data);
    });
  }

  public deleteUser(id: string): void {
    this.userService.deleteById(id).subscribe(() =>
      console.log('User by id = ', id, ' is deleted'));
  }

  /*
    Access-Control-Allow-Origin:  http://127.0.0.1:3000
    Access-Control-Allow-Methods: POST
    Access-Control-Allow-Headers: Content-Type, Authorization
   */
  public deleteAll(): void {
    this.userService.deleteAll().subscribe(() =>
      console.log('All users were deleted'));
  }
}
