const dateNow = new Date('April 25, 2024 16:30:00 GMT+02:00');
console.log(dateNow);

const dateEx = new Date('2023-04-25T12:24:43.564Z');
console.log(dateEx);
dateEx.setFullYear(1989);
console.log(dateEx.getFullYear());
console.log(dateEx < dateNow);

const dateForDiscount = new Date('2024-04-25T14:30:00.000Z');

if (dateNow > dateForDiscount) {
    console.log("Ура, распродажа!!!")
}

console.log(dateNow.getTimezoneOffset());

const dateNow2 = new Date();
console.log(dateNow2);
console.log(dateNow2.getHours());

// dateNow2.setHours

const divElement = document.querySelector('div');
const showTime = () => {
    const dateNow2 = new Date();
    divElement.innerText = `${dateNow2.getHours()}:${dateNow2.getMinutes()}:${dateNow2.getSeconds()}`;
}

setInterval(showTime, 1000);
