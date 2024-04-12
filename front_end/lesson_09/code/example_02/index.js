let strA = 'Hello my big world';

console.log(strA);

let strB = strA.toUpperCase();
console.log(strB);


let arrOfWords = strA.split(' ');
console.log(arrOfWords);
console.log(arrOfWords[0]);


console.log(arrOfWords.join(' '));


let strC = 'Hello, my big, world';

let arrWithC = strC.split('');
console.log(arrWithC);


//////
let bigLetter = 'H';
console.log(bigLetter === bigLetter.toUpperCase());