import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pagine/home/home.component';
import { CompletiComponent } from './pagine/completi/completi.component';
import { DaFareComponent } from './pagine/da-fare/da-fare.component';
import { PerUtenteComponent } from './pagine/per-utente/per-utente.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CompletiComponent,
    DaFareComponent,
    PerUtenteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
