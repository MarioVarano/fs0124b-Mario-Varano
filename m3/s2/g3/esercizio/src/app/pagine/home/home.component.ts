import { Component, EventEmitter, Output } from '@angular/core';
import { iOggetto } from '../../models/oggetto';
import { OggettoService } from '../../oggetto.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  preferiti:iOggetto[] = []
  prodotti:iOggetto[] = []


  constructor(private oggettiSvc:OggettoService){}

  salvaProdotto(prodotto:iOggetto){
    this.preferiti.push(prodotto)
    console.log(this.preferiti);


  }

  ngOnInit(){
    this.oggettiSvc.getAll().subscribe((elementi) => {
      this.prodotti = elementi.products
      console.log(this.prodotti)

    })
  }
}
