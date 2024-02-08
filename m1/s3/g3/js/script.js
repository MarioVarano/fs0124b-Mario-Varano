console.log('ciao')

const testo = document.querySelector('#testo')
const bottone = document.querySelector('#aggiungi')
const target = document.querySelector('#target')

bottone.addEventListener('click',function(){
    let li = document.createElement('li')
    li.innerText = testo.value 


    let bottone = document.createElement('button')
    bottone.innerText = 'Elimina'
    bottone.addEventListener('click',function(){
        li.remove()
    })

    li.append(bottone)
    target.append(li)

    
})