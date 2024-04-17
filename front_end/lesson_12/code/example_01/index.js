function objectInString (objectB) {
    const arrOfObject = Object.values(objectB);
    let string1 = "";
    console.log(arrOfObject);
    for (let i = 0; i < arrOfObject.length; i++) {
        string1 = `${string1}${arrOfObject[i]}${(i === arrOfObject.length - 1) ? '' : ', '}`
    }
    return string1;
}
const objectF = {
    a: 'a', 
    '36.6': 36.6, 
    'John Doe': 'John Doe'
}
console.log(objectInString(objectF));