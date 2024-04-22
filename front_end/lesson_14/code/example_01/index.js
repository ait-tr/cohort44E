// forEach
// const ff = (a) => {
//     console.log(`Я равен ${a}`);
// }

const arrF = [1, 2, 3, 5, 4, 10, 6];
const arrA = [];
const ff = (element) => {
    arrA.push(element + 3);
}

arrF.forEach(ff);
console.log(arrF);
console.log(arrA);


// map !!!
const callBackForMap = (element) => {
    return element + 4;
}

const arrAMap = arrF.map(callBackForMap);
console.log(arrAMap);


// filter
const callBackForFiler = (element) => {
    if (element > 4) {
        return true
    } else {
        return false
    }
}

const arrAFilter = arrF.filter(callBackForFiler);
console.log(arrAFilter);


// slice
const arrASliceResult = arrF.slice(2, 5);
console.log(arrASliceResult);
console.log(arrF);


// sort
const callBackForSort = (a, b) => {
    if (a < b) {
        return -1;
    } else {
        return 1;
    }
}

const arrFcopy = [...arrF];
arrFcopy.sort(callBackForSort);


console.log('------- №1 ------');
// 1. Надо добавить каждому игроку ключ(свойство) 'goals' и туда записать случайное целое число от 0 до 20. При этом должен быть сформирован новый массив.


const players = [
    {name: "Alex", height: 190, weight: 85, sport: "rugby"},
    {name: "Boris", height: 180, weight: 75, sport: "football"},
    {name: "Vladimir", height: 175, weight: 70, sport: "hockey"},
    {name: "George", height: 185, weight: 80, sport: "rugby"},
    {name: "Dmitry", height: 170, weight: 65, sport: "hockey"},
    {name: "Eugene", height: 195, weight: 90, sport: "football"},
    {name: "Zachary", height: 188, weight: 82, sport: "rugby"},
    {name: "Ivan", height: 182, weight: 77, sport: "football"},
    {name: "Kirill", height: 178, weight: 73, sport: "hockey"},
    {name: "Leonid", height: 192, weight: 87, sport: "rugby"},
    {name: "Michael", height: 176, weight: 71, sport: "hockey"},
    {name: "Nicholas", height: 198, weight: 93, sport: "football"},
    {name: "Oleg", height: 186, weight: 79, sport: "rugby"},
    {name: "Paul", height: 174, weight: 69, sport: "hockey"},
    {name: "Roman", height: 184, weight: 78, sport: "football"}
    ];
const playerscopy = [...players];

const fff = (objectA) => {
    console.log(objectA);
    return objectA + (objectA.goals = Math.round(Math.random() * (20 - 1) + 1));
}
const playersNew = playerscopy.map(fff);
console.log(playersNew);