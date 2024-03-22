import { Component } from '@angular/core';
import { iMacchina } from '../../Modulo/macchina';
import { ProgettoService } from '../../progetto.service';

@Component({
  selector: 'app-Fiat',
  templateUrl: './Fiat.component.html',
  styleUrl: './fiat.component.scss'
})
export class FiatComponent {
  fiat:iMacchina[] = []

  constructor(private macchineSvc:ProgettoService){}

  ngOnInit(){
    this.macchineSvc.getBrand('Fiat').then(res => {
      this.fiat = res

    })
  }

  cambiaColore(available:boolean):string{
    return available ? 'green' : 'red'
  }
}
