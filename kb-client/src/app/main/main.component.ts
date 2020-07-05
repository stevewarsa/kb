import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {Observable} from "rxjs";
import {debounceTime, distinctUntilChanged, map} from "rxjs/operators";
import {Tag} from "src/app/model/tag";
import {KbEntry} from "src/app/model/kbentry";
import {KbService} from "src/app/kb.service";

@Component({
    templateUrl: './main.component.html',
    styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {
    tags: Tag[] = [];
    showAddForm = false;
    selectedTag = <Tag>{};
    newKbEntry = <KbEntry>{
        tags: []
    };
    @ViewChild("title") titleField: ElementRef;

    constructor(private kbService: KbService) {}

    ngOnInit(): void {
        this.kbService.getTags().subscribe(tags => {
                this.tags = tags;
            },
            error => {
                console.log("Error in getting tags:");
                console.log(error);
            });
    }

    formatter = (result: Tag) => result.tagNm;

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

    onSelectTypeahead(item: Tag) {
        this.selectedTag = item;
        this.newKbEntry.tags.push(item);
    }

    onAddKbEntry() {
        this.kbService.addNewKbEntry(this.newKbEntry);
    }

    removeTag(tag: Tag) {
        this.newKbEntry.tags = this.newKbEntry.tags.filter(currTag => currTag.tagId !== tag.tagId);
    }
}
