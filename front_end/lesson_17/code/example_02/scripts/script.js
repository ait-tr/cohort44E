console.log("Record 1");
// alert("Смотрим на Аlert");
// const num = prompt('Введите число');

const inputElement = document.querySelector('.input');
const buttonElement = document.querySelector('button');
let num = inputElement.value;
console.log("Мы ввели - " + num);


const printValue = () => {
    console.log("Мы ввели - " + inputElement.value);
}

inputElement.addEventListener('input', printValue);
buttonElement.addEventListener('click', printValue);

console.log('После добавление лисенера');

const startLoopTime = Date.now();
for(let i = 0; i < 12000000000; i++) {
}
const endLoopTime = Date.now();
console.log(endLoopTime - startLoopTime);
