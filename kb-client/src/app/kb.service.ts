import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Tag} from "src/app/model/tag";
import {KbEntry} from "src/app/model/kbentry";

@Injectable({
  providedIn: 'root'
})
export class KbService {

  constructor(private httpService:HttpClient) { }

  public getTags() {
    return this.httpService.get<Tag[]>('/getTags');
  }

  public addNewKbEntry(newEntry: KbEntry) {
    return this.httpService.post<KbEntry>('/addNewKbEntry', newEntry);
  }

  public getKbEntries() {
    return this.httpService.get<KbEntry[]>('/getKbEntries');
  }
}
