import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { iJson, iOggetto } from './models/oggetto';

@Injectable({
  providedIn: 'root'
})
export class OggettoService {
  preferiti:iOggetto[] = []
  url:string = 'https://dummyjson.com/products'

  constructor(private http:HttpClient){}

  getAll(){
    return this.http.get<iJson>(this.url)
  }

  salvaProdotto(prodotto:iOggetto){
    this.preferiti.push(prodotto)
  }

  getPreferiti(): iOggetto[] {
    return this.preferiti;

  }

}
