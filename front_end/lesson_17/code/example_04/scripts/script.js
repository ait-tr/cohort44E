const spanElement = document.querySelector('span');
let counter = 10;

console.log('Перед setInterval');
const startIntervalTime = Date.now();

const timeHandler = () => {
    //console.log('Вывод ' + (Date.now() - startIntervalTime));
    //spanElement.innerText = (Date.now() - startIntervalTime);
    // if ((Date.now() - startIntervalTime) > 10000) {
    //     clearInterval(intervalID);
    // }
    if (counter >= 0) {
        spanElement.innerText = counter;
        counter--;
    } else {
        clearInterval(intervalID);
    }
}

const intervalID = setInterval(timeHandler, 1000);

// clearInterval(intervalID);
console.log('После запуска функции setInterval');

// const startLoopTime = Date.now();
// for(let i = 0; i < 12000000000; i++) {
// }
// const endLoopTime = Date.now();
// console.log(endLoopTime - startLoopTime);
