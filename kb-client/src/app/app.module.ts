import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HttpClientModule} from '@angular/common/http';
import {MainComponent} from './main/main.component';
import {NgbModule, NgbTypeaheadModule} from "@ng-bootstrap/ng-bootstrap";
import {FormsModule} from "@angular/forms";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatChipsModule} from "@angular/material/chips";
import {MatIconModule} from "@angular/material/icon";

@NgModule({
    declarations: [
        AppComponent,
        MainComponent
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        NgbModule,
        NgbTypeaheadModule,
        FormsModule,
        BrowserAnimationsModule,
        MatChipsModule,
        MatIconModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
