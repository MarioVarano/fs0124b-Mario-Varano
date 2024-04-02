import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './pagine/bloccata/auth.guard';

const routes: Routes = [
  { path: '', loadChildren: () => import('./pagine/home/home.module').then(m => m.HomeModule) },
  { path: 'login', loadChildren: () => import('./pagine/login/login.module').then(m => m.LoginModule) },
  { path: 'register', loadChildren: () => import('./pagine/register/register.module').then(m => m.RegisterModule) },

{ path: 'bloccata', loadChildren: () => import('./pagine/bloccata/auth.module').then(m => m.AuthModule),
  canActivate : [AuthGuard],
  canActivateChild : [AuthGuard]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
