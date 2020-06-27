import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class KbService {

  constructor(private httpService:HttpClient) { }

  public getGreeting(): Observable<any> {
    return this.httpService.get<any>('/greetings');
  }

  public getTags() {
    return this.httpService.get<any>('/getTags');
  }
}
