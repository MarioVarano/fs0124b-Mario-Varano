import { Component } from '@angular/core';
import { FilmService } from '../film.service';
import { IFilm } from '../../Modules/i-film';

@Component({
  selector: 'app-film',
  templateUrl: './film.component.html',
  styleUrl: './film.component.scss'
})
export class FilmComponent {

  filmArr:IFilm[] = []

  constructor(private filmSvc:FilmService){}

  ngOnInit(){
    this.filmSvc.getAll().subscribe(res => this.filmArr = res)
  }
}
