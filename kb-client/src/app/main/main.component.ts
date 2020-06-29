import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {KbService} from "../kb.service";
import {Tag} from "../model/tag";
import {Observable} from "rxjs";
import {debounceTime, distinctUntilChanged, map} from "rxjs/operators";

@Component({
    templateUrl: './main.component.html',
    styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {
    tags: Tag[] = [];
    showAddForm = false;
    @ViewChild("title") titleField: ElementRef;

    constructor(private kbService: KbService) {
    }

    ngOnInit(): void {
        this.kbService.getTags().subscribe(tags => {
                this.tags = tags;
            },
            error => {
                console.log("Error in getting tags:");
                console.log(error);
            });
    }

    search = (text$: Observable<string>) =>
        text$.pipe(
            debounceTime(200),
            distinctUntilChanged(),
            map(term => term.length < 1 ? []
                : this.tags.filter(tag => tag.tagNm.indexOf(term) >= 0).slice(0, 10))
        )

    viewAddForm() {
        this.showAddForm = true;
        // Focusing the element won't work unless you put this in a time out
        setTimeout(() => {
            this.titleField.nativeElement.focus();
        }, 100);
    }
}
