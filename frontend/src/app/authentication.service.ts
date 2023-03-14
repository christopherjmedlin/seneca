import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  private username: string;
  private password: string;
  private isAuthenticated: boolean;

  constructor(private http: HttpClient) {
    this.username = "";
    this.password = "";
    this.isAuthenticated = false;
  }

  login(username: string, password: string) {
    const headers = new HttpHeaders({
      authorization: 'Basic ' + username + ':' + password
    });

    this.http.get('users/me',
      {headers: headers, observe: 'response'}).subscribe(response => {
      if (response.status == 200) {
        this.username = username;
        this.password = password;
        this.isAuthenticated = true;
      }
    })
  }

  logout() {
    this.isAuthenticated = false;
  }
}
