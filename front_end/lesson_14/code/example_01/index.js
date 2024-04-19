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


