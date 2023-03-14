import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  private _username: string;
  private _password: string;
  private _isAuthenticated: boolean;

  constructor(private http: HttpClient) {
    this._username = "";
    this._password = "";
    this._isAuthenticated = false;
  }

  login(username: string, password: string) {
    const headers = new HttpHeaders({
      authorization: 'Basic ' + username + ':' + password
    });

    this.http.get('users/me',
      {headers: headers, observe: 'response'}).subscribe(response => {
      if (response.status == 200) {
        this._username = username;
        this._password = password;
        this._isAuthenticated = true;
      }
    })
  }

  logout() {
    this._isAuthenticated = false;
  }

  get username(): string {
    return this.username;
  }

  get password(): string {
    return this.password;
  }

  get isAuthenticated(): boolean {
    return this.isAuthenticated;
  }
}
