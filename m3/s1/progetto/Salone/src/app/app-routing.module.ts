import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pagine/home/home.component';
import { AudiComponent } from './pagine/audi/audi.component';
import { FordComponent } from './pagine/ford/ford.component';
import { FiatComponent } from './pagine/fiat/fiat.component';

const routes: Routes = [
  {
    path:'',
    component: HomeComponent
  },
  {
    path:'Audi',
    component:AudiComponent
  },
  {
    path:'Ford',
    component: FordComponent
  },
  {
    path:'Fiat',
    component:FiatComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
