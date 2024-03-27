import { Component, EventEmitter, Input, Output } from '@angular/core';
import { iOggetto } from '../../models/oggetto';
import { OggettoService } from '../../oggetto.service';

@Component({
  selector: 'app-preferiti',
  templateUrl: './preferiti.component.html',
  styleUrl: './preferiti.component.scss'
})

export class PreferitiComponent {
  preferiti:iOggetto[] = []

  constructor(private oggettiSvc:OggettoService){}

  salvaProdotto(prodotto:iOggetto){
    this.preferiti.push(prodotto)
  }

  ngOnInit(){
  this.preferiti =  this.oggettiSvc.getPreferiti()
  console.log(this.preferiti);

  }
}

