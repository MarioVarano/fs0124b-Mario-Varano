class Telefono {
    constructor(nome, descrizione, brand, imageUrl, prezzo) {
      this.name = nome;
      this.description = descrizione;
      this.brand = brand;
      this.imageUrl = imageUrl;
      this.price = prezzo;
    }
  }

const params = new URLSearchParams(location.search);

// Estrai il valore dell'ID della card dalla query string
const cardId = params.get("id");
console.log(cardId);
//Assegno ai campi del form quanto scritto nella card dell'oggetto
fetch(`https://striveschool-api.herokuapp.com/api/product/${cardId}`, {
  method: "GET",
  headers: {
    'Content-Type':'application/json',
    "Authorization":"Bearer  eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViMjIzNTJkN2IxMTAwMTkwZTc3Y2EiLCJpYXQiOjE3MDk5MDk3MTgsImV4cCI6MTcxMTExOTMxOH0.wOav_7qqa08lOxeW9_nQI1nrrPvSXAVJ8eZ_iD_oAGg",
  },
})
  .then((res) => res.json())
  .then((telefono) => {
    document.querySelector("#nome").value = telefono.name;
    document.querySelector("#textarea").value = telefono.description;
    document.querySelector("#brand").value = telefono.brand;
    document.querySelector("#prezzo").value = telefono.price;
    document.querySelector("#immagine").value = telefono.imageUrl;
  });

//AL CLICK SUL BOTTONE MODIFICA DEVE FARE LA MODIFICA SULLA PAGINA PRODOTTI
let modifiche = document.querySelector('#salva')
modifiche.addEventListener('click',function(e){
    e.preventDefault()

    let nome = document.querySelector("#nome").value 
    let descrizione = document.querySelector("#textarea").value 
    let brand = document.querySelector("#brand").value 
    let immagine = document.querySelector("#immagine").value
    let prezzo = document.querySelector("#prezzo").value


    let telefonoM = new Telefono(nome,descrizione,brand,immagine,prezzo)

    let conferma = confirm("Sei sicuro di voler modificare il prodotto?")
    if(conferma){
      fetch(`https://striveschool-api.herokuapp.com/api/product/${cardId}`,{
      method:'PUT',
      headers: {
          'Content-Type':'application/json',
          "Authorization": "Bearer  eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViMjIzNTJkN2IxMTAwMTkwZTc3Y2EiLCJpYXQiOjE3MDk5MDk3MTgsImV4cCI6MTcxMTExOTMxOH0.wOav_7qqa08lOxeW9_nQI1nrrPvSXAVJ8eZ_iD_oAGg"
      },
      body:JSON.stringify(telefonoM)
      })
      .then(res => res.json())
      .then(telefono => {
          location.href = "prodotti.html"
      })
    }



})




let elimina = document.querySelector('#delete')

elimina.addEventListener('click',function(e){
    e.preventDefault()
    let conferma = confirm("Sei sicuro di voler eliminare il prodotto?")
    if(conferma){
      fetch(`https://striveschool-api.herokuapp.com/api/product/${cardId}`,{
      method:'DELETE',
      headers: {
          'Content-Type':'application/json',
          "Authorization": "Bearer  eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViMjIzNTJkN2IxMTAwMTkwZTc3Y2EiLCJpYXQiOjE3MDk5MDk3MTgsImV4cCI6MTcxMTExOTMxOH0.wOav_7qqa08lOxeW9_nQI1nrrPvSXAVJ8eZ_iD_oAGg"
      }
      })
      .then(res => res.json())
      .then(telefono => {
          location.href = "prodotti.html"
      })
    }


})

