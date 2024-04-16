// function name(a, b) {
//     const/let = 

// }

// const name = function(a, b) {

// }

// const name = (a, b) => {

// }

let x = 5;
// let y = 500;
// name(x, y);



const arrA = ["a", "b", "x"];
// console.log(arrA);


// objects
const objA = {
    param1: "a",
    param2: "b",
    param3: "x"
}
// console.log(objA);

const carBMW7401998 = {
    doors: 4,
    wheels: 4,
    engine: 2000,
    weight: 1750,
}

const footballPlayerJohn = {
    height: 170,
    weight: 80,
    result: 7.5,
    goal: function() {
        console.log("I made goal")
    },
    number: function() {
        return 5;
    }
}

console.log(footballPlayerJohn.result);
console.log(footballPlayerJohn["height"]);


footballPlayerJohn.goal();


let randomN = Math.random();
let numberFromJohn = footballPlayerJohn.number();

console.log(numberFromJohn);