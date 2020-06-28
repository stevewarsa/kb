import { Component, OnInit } from '@angular/core';
import { KbService } from './kb.service';

@Component({
  selector: 'kb-root',
  templateUrl: './app.component.html',
  styles: []
})
export class AppComponent implements OnInit {
  title = 'Tag Listing';
  body = 'Knowledgebase Body';
  tags = [];

  constructor(private kbService: KbService) {}
  ngOnInit() {
    this.kbService.getTags().subscribe(tags => {
      console.log("Here are the tags from the database:");
      console.log(tags);
      this.tags = tags;
    },
error => {
      console.log("Error in getting tags:");
      console.log(error);
    });
  }
}
