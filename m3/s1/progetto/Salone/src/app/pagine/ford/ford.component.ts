import { Component } from '@angular/core';
import { iMacchina } from '../../Modulo/macchina';
import { ProgettoService } from '../../progetto.service';

@Component({
  selector: 'app-ford',
  templateUrl: './ford.component.html',
  styleUrl: './ford.component.scss'
})
export class FordComponent {
  ford:iMacchina[] = []

  constructor(private macchineSvc:ProgettoService){}

  ngOnInit(){
    this.macchineSvc.getBrand('Ford').then(res => {
      this.ford = res

    })
  }

  cambiaColore(available:boolean):string{
    return available ? 'green' : 'red'
  }
}
