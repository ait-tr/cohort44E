// template string (шаблонная строка)

const nameA = "Artur"
const strA = "Hello " + nameA;
console.log(strA);

const strB = `Hello ${nameA}`;
// записи в правой части выражение в строках 4 и 7 возвращают одно и тоже

console.log(strB);

// Класная работа номер 5
// Написать стрелочную функцию, которая принимает как аргумент имя (строку), и возвращает запись (строку):
// "My name is <имя>"

// вызов функций внтури других функций
const nameB = "Bob";
const strC = (nameB) => {
    return `Hello my name is ${nameB}`
};
// console.log(strC("James Bond"));

const doubleF = (name) => {
    return `${strC(name)} и я алкоголик`;
}
console.log(doubleF("Mario"));
