import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';
import { IFilm } from '../Modules/i-film';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FilmService {

  constructor(private http:HttpClient) { }

  movieUrl:string = environment.movieurl


  getAll(){
    return this.http.get<IFilm[]>(this.movieUrl)
  }

}
