import { iArticolo } from './models/articolo';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  articoliArr:iArticolo[]= []
  randomArr:iArticolo[]=[]



  ngOnInit(){
    fetch('../assets/db.json')
    .then(articoli => articoli.json())
    .then((articolo) => {this.articoliArr = articolo.posts
//tutto qui tranne metodi
     this.articoliRandom()


    })
  }

  randomIndice(): number {
    let lungh = this.articoliArr.length
    let indice = Math.floor(Math.random()* lungh)
    return indice
  }

  articoliRandom(){
    for(let i = 0; i<4; i++){
      let casuale = this.randomIndice()
      this.randomArr.push(this.articoliArr[casuale])
    }
    return this.randomArr
  }


}
