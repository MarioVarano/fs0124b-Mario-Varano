import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './componenti/nav/nav.component';
import { ActiveComponent } from './pagine/active/active.component';
import { InactiveComponent } from './pagine/inactive/inactive.component';
import { HomeComponent } from './pagine/home/home.component';
import { TuttiComponent } from './pagine/tutti/tutti.component';

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    ActiveComponent,
    InactiveComponent,
    HomeComponent,
    TuttiComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
