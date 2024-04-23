const arrA = ['task 1', 'task 2'];

const callBackF = (element) => {
    const htmlNode = document.createElement('div');
    htmlNode.innerText = element;
    return htmlNode;
}


const arrB = arrA.map(callBackF);

console.log(arrB);


[ <div>taks 1</div>, <div>task 2</div>]