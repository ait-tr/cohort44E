const humanJohh = {
    name: "John",
    surname: "Depp",
    age: 37,
    get newAge() {
        return this.age;
    },
    set newAge(newAgeNumber) {
        if (newAgeNumber - this.age > 1) {
            console.log("Error")
        } else {
            this.age = newAgeNumber
        }
    }
}

const player = {
    play: function() {
        console.log("I am playing")
    }
}

Object.setPrototypeOf(humanJohh, player);
console.log(humanJohh);
humanJohh.play();

humanJohh.newAge = 38;
console.log(humanJohh.newAge);
