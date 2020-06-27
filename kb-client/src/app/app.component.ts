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
      // if (tags && tags.length > 0) {
      //   this.title = tags[0].tagCd + '(' + tags[0].tagId + ')';
      //   this.body = tags[0].tagNm;
      // }
    });
    // this.kbService.getGreeting().subscribe(greeting => {
    //   this.title = greeting.greetingsTitle;
    //   this.body = greeting.greetingsBody;
    // },
    // error => {
    //   console.log("Here is the error back from server: ");
    //   console.log(error);
    // });
  }
}
