/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/

let var1=3
let var2=6

if(var1 > var2){
  console.log(var1)
}else {
  console.log(var2)
}

/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/

let var3= 7

if(var3 != 5){
  console.log("not equal")
}

/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: usa l'operatore modulo)
*/

let var4= 10

if(var4 % 5 == 0 ){
  console.log("divisibile per 5")
}

/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/

let var5=5
let var6=3

if(var5 + var6 ==8){
  console.log("la somma è 8")
}
else if(var7 - var6 ==8){
  console.log("la loro sottrazione è 8")
}
else if(var5 || var8 ==8){
  console.log("uno di loro è 8")
}
/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/

let tsc = 30

if(tsc >= 50){
  console.log(tsc)
}
else{
  console.log(tsc + 10)
}

/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/
let tscf = 30
let sconto= tscf - (tscf * 20 / 100)

if(sconto >= 50){
console.log(sconto)
}
else{
console.log(sconto + 10)
}


/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/

let num1 = 15
let num2= 2
let num3 = 36
ordine = new Array()

if(num1 < num2 &&  num3){
  ordine.push(num1)
  if(num2< num3){
  ordine.push(num2, num3)
  }
  else{
    ordine.push(num3, num2)
  }
  console.log(ordine)
}
else if(num2 < num3){
  ordine.push(num2)
  if(num1 < num3){
    ordine.push(num1,num3)
  }
  else{
    ordine.push(num1, num3)

  }
}
else{
  ordine.push(num3)
  if(num1<num2){
    ordine.oush(num1,num2)
  }
  else{
    ordine.push(num2,num1)
  }
}
console.log(ordine)


/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/

let forsenum= 5
console.log(typeof(forsenum))

/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

let pari_dispari = 3

if(pari_dispari % 2 == 0){
  console.log("è pari")
}
else{
  console.log("è dispari")
}

/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  */
  let val = 666
  if (val < 10 && val > 5) {
      console.log("Meno di 10");
    } else if (val < 5) {
      console.log("Meno di 5");
    } else {
      console.log("Uguale a 10 o maggiore");
    }



/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".
*/

const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],

}
me.city= "Toronto"
console.log(me)

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 12
Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/

//delete me.lastName 


/* ESERCIZIO 13
Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/
//delete me.skills.pop()

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/

let vuoto = []
vuoto.push(1,2,3,4,5,6,7,8,9,10)

console.log(vuoto)

/* ESERCIZIO 15
Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/

//vuoto[9] = 100

