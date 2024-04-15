function sumAB(a, b) {
    const sum = a + b;
    // console.log(sum);
    return sum;
}

const sum1 = sumAB(3, 4);
console.log(sum1);

const test = console.log(777);
console.log(test);


// функция которая ищет максимум в Массиве
function maxInArr(arr) {
    let maxNum = Math.max(...arr);
    return maxNum;
    // предыдущие две строки можно заменить на одну:
    // return Math.max(...arr);
}

const arrC = [1, 5, 25, 10, 20];
console.log(maxInArr(arrC));


// Задание на урок. Создать функцию которая принимает массив, и возвращает новый массив,
// где каждый элемент массива увеличен на второй аргумент



// function declaration

// function arrNa10(arrA, a) {
//     const arrD = [];
//     for (let i = 0; i < arrA.length; i++) {
//         arrD.push(arrA[i]+a);
//         //arrD[i] = arrA[i]*10;
//     }
//     return arrD;
// }



// function expression - переписываем нашу функцию

// const arrNa10 = function(arrA, a) {
//     const arrD = [];
//     for (let i = 0; i < arrA.length; i++) {
//         arrD.push(arrA[i]+a);
//         //arrD[i] = arrA[i]*10;
//     }
//     return arrD;
// }


// стрелочная функции
const arrNa10 = (arrA, a = 10) => {
    const arrD = [];
    for (let i = 0; i < arrA.length; i++) {
        arrD.push(arrA[i] + a);
    }
    return arrD;
}

const arrF = [1, 8, 3, 13];

console.log(arrNa10(arrF, 20));


// стрелочная функция которая ищет макс в массиве переданном как аргумент
const maxInArr1 = (arr) => {
    return maxNum = Math.max(...arr);
}

// сократим
 const maxInArr1Short = arr => Math.max(...arr);

 