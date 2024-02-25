let nav = document.querySelector("header")
let getStarted = document.querySelector(".bottone")
window.addEventListener('scroll', () => {
    if (window.scrollY > 30) {
        console.log(scrollY);
        nav.classList.add('scrolled');
        getStarted.classList.add('verde');

    } else {
        nav.classList.remove('scrolled');
        getStarted.classList.remove('verde')

    }
});