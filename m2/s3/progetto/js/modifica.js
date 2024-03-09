const params = new URLSearchParams(window.location.search);

// Estrai il valore dell'ID della card dalla query string
const cardId = params.get('id');

console.log(cardId); // Stampa l'ID della card nella console
//in questi campi deve comparire quello che stava scritto nell'oggetto
//DEVO RIUSCIRE A PORTARE I CAMPI CON INFORMAZIONI DELL'OGGETTO DA MODIFICARE
//let nome = document.querySelector("#nome").innerText = telefono.name
//let descrizione = document.querySelector("#textarea").innerText = telefono.descriptio
//let brand = document.querySelector("#brand").innerText = telefono.brand
//let prezzo = document.querySelector("#prezzo").innerText = telefono.price
//let immagine = document.querySelector("#immagine").src = telefono.imageUrl 

//AL CLICK SUL BOTTONE MODIFICA DEVE FARE LA MODIFICA SULLA PAGINA PRODOTTI
//AL CLICK SUL BOTTONE SCOPRI DEVE CAMBIARE PAGINA
//




//fetch(`https://jsonplaceholder.typicode.com/posts/${telefono.userId}`,{
//    method:'PUT',
//    headers: {
//        'Content-Type':'application/json'
//    },
//    body:JSON.stringify(telefono)
//})
//.then(res => res.json())
//.then(res => {
//
//
//
//
//    //operazioni di conferma
//    //eventuale apparizione O MODIFICA del nuovo dato
//
//})