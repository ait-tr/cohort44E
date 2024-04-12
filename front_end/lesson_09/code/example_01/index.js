let a;

// console.log(typeof a);
if(!a) {
    console.log("a = 0")
} else {
    console.log("a > 0")
}

// console.log(!false);

const arrA = ['a', 'b', 'c'];
const lengthOfArrA = arrA.length;
console.log(lengthOfArrA);
console.log(arrA[1]);

// добавление и удаление в конец массива
arrA.push('d'); // добавить значение в скобках в конец массива
console.log(arrA);
arrA.pop(); // удалить последний элемент
console.log(arrA);

// добавление и удаление в начало масива
arrA.shift(); // удалить первый элемент массива
console.log(arrA);
arrA.unshift('A'); // добавить аргумент (аргумент - значение в скобках) в начало массива
console.log(arrA);

const arrB = []; // создаем пустой массив
// циклы
for (let i = 0; i <= 10; i++) {
    console.log(i);
}



const arrС = [];
let i = arrB;
//циклы
for(let i=0; i<=10;i++) {
    arrС.unshift(i);
    console.log(i);
}
arrС.pop();
console.log(arrС);

let randA = Math.random();
console.log(randA);
console.log(Math.ceil(7.1));
console.log(Math.floor(8.9));
console.log(Math.round(10.55));

// класное мучение
// создать массив пустой массив, запустить цикл, заполнить массив рандомными числами от 0 до 100,
// 10 элементов в массиве должно быть


// let x = Math.random();
// y = x * 2;
// let consoleLogFunction = console.log(x);

// console.log(consoleLogFunction);

