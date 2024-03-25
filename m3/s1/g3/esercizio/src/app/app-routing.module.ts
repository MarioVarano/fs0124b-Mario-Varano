import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ActiveComponent } from './pagine/active/active.component';
import { InactiveComponent } from './pagine/inactive/inactive.component';
import { HomeComponent } from './pagine/home/home.component';
import { TuttiComponent } from './pagine/tutti/tutti.component';

const routes: Routes = [
  {
    path:'',
    component:HomeComponent
  },
  {
    path:'active',
    component:ActiveComponent
  },
  {
    path:'inactive',
    component:InactiveComponent
  },
  {
    path:'tutti',
    component:TuttiComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
