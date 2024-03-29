import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pagine/home/home.component';
import { CompletiComponent } from './pagine/completi/completi.component';
import { DaFareComponent } from './pagine/da-fare/da-fare.component';
import { PerUtenteComponent } from './pagine/per-utente/per-utente.component';

const routes: Routes = [
  {
    path:'',
    component:HomeComponent,
    title:'Tutti'
  },
  {
    path:'completi',
    component:CompletiComponent,
    title:'Completati'
  },
  {
    path:'da-fare',
    component:DaFareComponent,
    title:'In sospeso'
  },
  {
    path:'per-utente',
    component:PerUtenteComponent,
    title:'Per utente'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
