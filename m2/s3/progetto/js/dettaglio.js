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
    document.querySelector("#nomeProdotto").innerText = telefono.name;
    document.querySelector("#marca").innerText = telefono.brand;
    document.querySelector("#costo").innerText = telefono.price;
    document.querySelector("#immagine").src = telefono.imageUrl;
    document.querySelector("#testo").innerText = telefono.description;
  });