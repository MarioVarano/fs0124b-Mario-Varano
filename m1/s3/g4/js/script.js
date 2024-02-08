const estratti = []

const target = document.querySelector('.caselle')
for(let i =1; i<=76; i++){
    const casella = document.createElement('div')
    casella.classList.add('singola')
    casella.innerText = i

target.append(casella)
}

const bottone = document.querySelector('.estrai-random')
bottone.addEventListener('click' ,function(){
    const numeroEstratto = Math.floor(Math.random() * 76 ) + 1 
    if(casella.innerText == Number(numeroEstratto)){
        casella.classList.add('selezionata')
    }


})


