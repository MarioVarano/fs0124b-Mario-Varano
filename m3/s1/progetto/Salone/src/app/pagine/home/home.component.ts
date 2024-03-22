import { Component } from '@angular/core';
import { iMacchina } from '../../Modulo/macchina';
import { ProgettoService } from '../../progetto.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  macchineCasuali:iMacchina[] = []

  constructor(private macchineSvc:ProgettoService){}

  ngOnInit(){
    this.macchineSvc.getMacchineCasuali().then(res => {
      this.macchineCasuali = res

    })
  }

  cambiaColore(available:boolean):string{
    return available ? 'green' : 'red'
  }
}
