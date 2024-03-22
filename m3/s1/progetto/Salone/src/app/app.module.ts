import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pagine/home/home.component';
import { FiatComponent } from './pagine/fiat/fiat.component';
import { FordComponent } from './pagine/ford/ford.component';
import { AudiComponent } from './pagine/audi/audi.component';
import { NavComponent } from './componenti/nav/nav.component';
import { FooterComponent } from './componenti/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    FiatComponent,
    FordComponent,
    AudiComponent,
    NavComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
