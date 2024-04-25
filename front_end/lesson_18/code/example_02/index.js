// promises

const promiseExample = new Promise(
    
    (resolve, reject) => {

        // const timeHandler = () => {
        //     const fortuna = Math.random();
        // if(fortuna > 0.5) {
        //     resolve(fortuna);
        // } else {
        //     reject(fortuna);
        // }
        // }

        // setTimeout(timeHandler, 5000);

        const fortuna = Math.random();
        resolve(fortuna);
}

);

const callbackForPromiseFullfild = (d) => {console.log('Размер алмаза ' + d)};

promiseExample
  .then(callbackForPromiseFullfild)

console.log(promiseExample);


// fetch

// fetch('https://jsonplaceholder.typicode.com/todos').then()




const fetchResult = fetch('https://jsonplaceholder.typicode.com/todos');

console.log(fetchResult);

fetchResult
  .then((response) => {return response.json()})
  .then((data) => {console.log(data)})
  .catch((error)=> {console.log(error)})
  .finally(() => {console.log('Наконец то')})
