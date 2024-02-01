/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato.
*/

function area(b,h){
    return b*h
}
console.log(area(2,6))


/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

function crazySum(a,b){
    if(a == b){
        med=(a+b)*3
        return med
    }
    else{
        return a + b
    }
}
console.log(crazySum(3,3));
// console.log(crazySum(3,2))

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

function crazyDiff(a){
    if(a > 19){
        return Math.abs(a-19)*3
    }
    else{
        return Math.abs(a-19)
    }
}
console.log(crazyDiff(20));
//console.log(crazyDiff(5))

/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

function boundary(n){
    if(n >= 20 && n <= 100 || n == 400){
        return true
    }
    else{
        return false
    }
}
console.log(boundary(400));
/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

function epify(str){
    if(str.includes('EPICODE')){
        return str
    }
    else{
        return 'EPICODE' + str
    }
}
//console.log(epify('Mario'));
console.log(epify('EPICODETOP'));

/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/

function check3and7(n){
    if(n>0){
        if(n % 3 == 0){
            return(n + ' è multiplo di 3')
        }
        else if(n % 7 == 0){
            return(n +' è multiplo di 7')
        }
        else{
            return ('Non è multiplo di 3 e 7')
        }
    }
    else{
        return ( n + ' è negativo')
    }
}
console.log(check3and7(14));

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

function reverseString(str){
    return str.split("").reverse().join("")
}
console.log(reverseString('EPICODE'));

/* ESERCIZIO 8
Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/

function upperFirst(stri){

    let parole= stri.split(' ')
    let finale=[]

    for(i=0; i<parole.length; i++){

        let prima = parole[i][0].toUpperCase()
        let resto = parole[i].slice(1)
        fine = prima + resto
        finale.push(fine)

        risultato = finale.join(' ')

    }
    return risultato
    
}

console.log(upperFirst('mario varano crotone'));
/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

function cutString(str){
    a = str.slice(1)
    b = a.slice(0,-1)
    return b
}
console.log(cutString('Mario'))
/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

function giveMeRandom(n){
    arr= []
    for(i=0; i < n; i++){
        rand = Math.floor(Math.random()*10)
        arr.push(rand)

    }
    return arr
}
console.log(giveMeRandom(5));