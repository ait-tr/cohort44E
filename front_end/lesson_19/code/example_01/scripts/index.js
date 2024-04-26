const urlApi = 'https://jsonplaceholder.typicode.com/todos';
let dataResponse;

// async function getData() {
// }

const getData = async (api) => {
    try {
        const serverResoponse = await fetch(api);
        dataResponse = await serverResoponse.json();
        dataWork(dataResponse);
    }
    catch(err) {
        console.log(err)
    }
}

getData(urlApi)

function dataWork(data) {
    console.log(data);
}