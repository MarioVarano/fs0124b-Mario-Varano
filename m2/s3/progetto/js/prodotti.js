  //funzione clone di Michele
  function generaClone(){
    //crea un clone del template e inseriscilo nella row
    let template = document.querySelector("#card")
    let clone = template.content.cloneNode(true)

    return clone;
}



fetch(`https://striveschool-api.herokuapp.com/api/product/`,{
    method:'GET',
    headers:{
        "Authorization": "Bearer  eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViMjIzNTJkN2IxMTAwMTkwZTc3Y2EiLCJpYXQiOjE3MDk5MDk3MTgsImV4cCI6MTcxMTExOTMxOH0.wOav_7qqa08lOxeW9_nQI1nrrPvSXAVJ8eZ_iD_oAGg"
    }
})
.then(res => res.json())
.then(telefoni => telefoni.forEach(telefono => {
    let card = generaClone()
    card.querySelector('#nomeProdotto').innerText = telefono.name
    card.querySelector('#marca').innerText = telefono.brand
    card.querySelector('#testo').innerText = telefono.description
    card.querySelector('#costo').innerText = telefono.price
    card.querySelector('#image').src = telefono.imageUrl
    let id = telefono._id
    card.querySelector('#modifica').addEventListener('click',function(){
        location.href = 'modifica.html?id='+ id
    })
    card.querySelector('#dettagli').addEventListener('click', function(){
        location.href = 'dettagli.html?id=' + id
    })



    document.getElementById('target').appendChild(card);
}))
