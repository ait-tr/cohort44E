
console.log('Перед setTimeout');

const timeHandler = () => {
    console.log('Вывод через 2000 мсек');
}

setTimeout(timeHandler, 0);

console.log('После запуска функции setTimeout');


const startLoopTime = Date.now();
for(let i = 0; i < 12000000000; i++) {
}
const endLoopTime = Date.now();
console.log(endLoopTime - startLoopTime);
