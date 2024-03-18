interface Smartphone{
    credito:number;
    numeroChiamate:number;
}

class User implements Smartphone{
    nome:string;
    cognome:string;
    credito:number;
    numeroChiamate:number;

    constructor(nome:string, cognome:string,credito:number,numeroChiamate:number){
        this.nome = nome;
        this.cognome = cognome;
        this.credito = credito;
        this.numeroChiamate = numeroChiamate;
    }
    //metodi
    ricarica(num:number){
        this.credito += num
    }

    chiamata(minuti:number){
        if(this.credito - (minuti * 0.20) < 0) {
            console.log("Non puoi chiamare")
            return 
        }
        this.credito -= (minuti * 0.20)
        this.numeroChiamate+= 1
    }

    chiama404(){
        return this.credito
    }

    getNumeroChiamata():number{
        return this.numeroChiamate
    }

    azzeraChiamata(){
        this.numeroChiamate = 0
    }
}



let utente = new User('Mario','Varano',15,3)
console.log(utente);
utente.ricarica(5)
utente.chiamata(5)
console.log(utente.chiama404());
console.log(utente.getNumeroChiamata());
utente.azzeraChiamata()

