import { Component } from '@angular/core';
import { IUser } from '../../Modules/i-user';
import { FilmService } from '../film.service';

@Component({
  selector: 'app-utenti',
  templateUrl: './utenti.component.html',
  styleUrl: './utenti.component.scss'
})
export class UtentiComponent {

  utenteArr:IUser[] = []
  constructor(private filmSvc:FilmService){}

  ngOnInit(){
    this.filmSvc.getAllUser().subscribe(res => this.utenteArr = res)
  }



}
