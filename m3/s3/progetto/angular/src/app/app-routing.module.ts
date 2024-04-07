import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GuestGuard } from './auth/guest.guard';
import { AuthGuard } from './auth/auth.guard';

const routes: Routes = [
  { path: '', loadChildren: () => import('./home/home.module').then(m => m.HomeModule),
  canActivate: [GuestGuard],
  canActivateChild: [GuestGuard],
  },

  { path: 'auth', loadChildren: () => import('./auth/auth.module').then(m => m.AuthModule),
  canActivate: [GuestGuard],
  canActivateChild: [GuestGuard],
  },

  { path: 'Film', loadChildren: () => import('./pagine/film/film.module').then(m => m.FilmModule),
  canActivate: [AuthGuard]
  },
  { path: 'Utenti', loadChildren: () => import('./pagine/utenti/utenti.module').then(m => m.UtentiModule),

   },
  { path: 'Preferiti', loadChildren: () => import('./pagine/preferiti/preferiti.module').then(m => m.PreferitiModule) },
  { path: 'Profilo', loadChildren: () => import('./pagine/profilo/profilo.module').then(m => m.ProfiloModule) }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
