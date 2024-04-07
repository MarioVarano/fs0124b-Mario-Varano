import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';
import { IFilm } from '../Modules/i-film';
import { IUser } from '../Modules/i-user';

@Injectable({
  providedIn: 'root'
})
export class FilmService {

  constructor(private http:HttpClient) { }

  movieUrl:string = environment.movieUrl
  userUrl:string = environment.userUrl


  getAll(){
    return this.http.get<IFilm[]>(this.movieUrl)
  }

  getAllUser(){
    return this.http.get<IUser[]>(this.userUrl)
  }

}
