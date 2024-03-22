import { Injectable } from '@angular/core';
import { iMacchina } from './Modulo/macchina';

@Injectable({
  providedIn: 'root'
})
export class ProgettoService {


  getAllMacchina():Promise<iMacchina[]>{
    return fetch('../assets/db.json')
    .then(res => res.json())
    .then((res:iMacchina[]) => res)
  }


  getMacchineCasuali():Promise<iMacchina[]>{
    return this.getAllMacchina()
    .then(macchine => {
      let macchineCasuali:iMacchina[] = []
      for(let i = 0; i<2; i++){
        let indiceRandom = Math.floor(Math.random()*macchine.length)
        let randomMacchina = macchine[indiceRandom]
        macchineCasuali.push(randomMacchina)
      }
      return macchineCasuali

    })
  }

  getBrand(brand:string):Promise<iMacchina[]>{
    return this.getAllMacchina()
    .then(macchine => {return macchine.filter(macchina => macchina.brand == brand)
    })
  }

}
