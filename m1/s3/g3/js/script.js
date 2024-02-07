const invia = document.querySelector('.aggiungi')
const text = document.querySelector('.testo')
invia.addEventListener('click', () => {
    let nuovo = document.createElement('div')
    nuovo.innerText = text.value
    let target = document.querySelector('.target')
    target.appendChild(nuovo)
    
})