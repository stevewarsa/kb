import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HttpClientModule} from '@angular/common/http';
import {MainComponent} from './main/main.component';
import {NgbModule, NgbTypeaheadModule} from "@ng-bootstrap/ng-bootstrap";

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
        NgbTypeaheadModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
