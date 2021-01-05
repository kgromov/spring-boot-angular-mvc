import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from "rxjs";
import {User} from "../domain/user";

@Injectable()
export class UserService {
  private readonly httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  };

  private readonly usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/users';
  }

  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.usersUrl);
  }

  public save(user: User) {
    return this.http.post<User>(this.usersUrl, user);
  }

  public deleteAll(): Observable<void> {
    return this.http.delete<void>(this.usersUrl);
  }

  public deleteById(userId: string): Observable<void> {
    return this.http.delete<void>(`http://localhost:8080/users/${userId}`);
  }
}
