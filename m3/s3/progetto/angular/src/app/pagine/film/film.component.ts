import { Component } from '@angular/core';
import { FilmService } from '../film.service';
import { IFilm } from '../../Modules/i-film';
import { AuthService } from '../../auth/auth.service';
import { IUser } from '../../Modules/i-user';

@Component({
  selector: 'app-film',
  templateUrl: './film.component.html',
  styleUrl: './film.component.scss'
})
export class FilmComponent {

  filmArr:IFilm[] = []
  var!:IUser|null

  constructor(private filmSvc:FilmService,
    private authSVC:AuthService
  ){}


  salva(film:IFilm){
    this.var?.preferiti.push(film)
    return this.var

  }

  ngOnInit(){
    this.filmSvc.getAll().subscribe(res => this.filmArr = res)
    this.authSVC.user$.subscribe(res => this.var = res)
    console.log(this.var);



  }
}
