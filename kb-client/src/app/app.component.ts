import { Component, OnInit } from '@angular/core';
import { KbService } from './kb.service';

@Component({
  selector: 'kb-root',
  templateUrl: './app.component.html',
  styles: []
})
export class AppComponent implements OnInit {
  title = 'Knowledgebase Title';
  body = 'Knowledgebase Body';

  constructor(private kbService: KbService) {}
  ngOnInit() {
    this.kbService.getGreeting().subscribe(greeting => {
      this.title = greeting.greetingsTitle;
      this.body = greeting.greetingsBody;
    },
    error => {
      console.log("Here is the error back from server: ");
      console.log(error);
    });
  }
}
