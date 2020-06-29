import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {Tag} from "./model/tag";

@Injectable({
  providedIn: 'root'
})
export class KbService {

  constructor(private httpService:HttpClient) { }

  public getGreeting() {
    return this.httpService.get<string>('/greetings');
  }

  public getTags() {
    return this.httpService.get<Tag[]>('/getTags');
  }
}
