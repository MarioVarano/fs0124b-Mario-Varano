//creo classe per creare oggetto
class Telefono {
  constructor(nome, descrizione, brand, imageUrl, prezzo) {
    this.name = nome;
    this.description = descrizione;
    this.brand = brand;
    this.imageUrl = imageUrl;
    this.price = prezzo;
  }
}

//const telefono = new Telefono("valore1", "valore2", "valore3", "valore4", "valore5");

//creare funzione che al click sul bottone salva crea nuovo prodotto

const salva = document.querySelector("#salva");

salva.addEventListener("click", function (e) {
  e.preventDefault();

  let nome = document.querySelector("#nome").value;
  let descrizione = document.querySelector("#textarea").value;
  let brand = document.querySelector("#brand").value;
  let immagine = document.querySelector("#immagine").value;
  let prezzo = document.querySelector("#prezzo").value;

  let telefono = new Telefono(nome,descrizione,brand,immagine,prezzo)

  fetch("https://striveschool-api.herokuapp.com/api/product/", {
    method: "POST",
    headers: {
      "Content-type": "application/json",
      "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViMjIzNTJkN2IxMTAwMTkwZTc3Y2EiLCJpYXQiOjE3MDk5MDk3MTgsImV4cCI6MTcxMTExOTMxOH0.wOav_7qqa08lOxeW9_nQI1nrrPvSXAVJ8eZ_iD_oAGg",
    },
    body: JSON.stringify(telefono),
  })
    .then((res) => res.json())
    .then((res) => {

        location.href = "prodotti.html";
      //do conferma all'utente oppure lo mando via

    });

});