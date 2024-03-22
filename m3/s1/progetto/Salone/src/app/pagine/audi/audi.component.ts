import { Component } from '@angular/core';
import { iMacchina } from '../../Modulo/macchina';
import { ProgettoService } from '../../progetto.service';

@Component({
  selector: 'app-audi',
  templateUrl: './audi.component.html',
  styleUrl: './audi.component.scss'
})
export class AudiComponent {
  audi:iMacchina[] = []

  constructor(private macchineSvc:ProgettoService){}

  ngOnInit(){
    this.macchineSvc.getBrand('Audi').then(res => {
      this.audi = res

    })
  }

  cambiaColore(available:boolean):string{
    return available ? 'green' : 'red'
  }
}
