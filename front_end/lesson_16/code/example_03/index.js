class User {
    // #age;
    constructor(uName, uSurname, age) {
        this.name = uName,
        this.surname = uSurname
        this.age = age;
    }
    play = function() {
        console.log("I am playing");
    }

    static whoOlder(objA, objB) {
        return objA.age > objB.age ? objA.name : objB.name
    }
}

const JohnyDepp = new User("Johny", "Depp", 37);
const JohnTravolta = new User("John", "Travolta", 35);

console.log("Cтарше - " + User.whoOlder(JohnyDepp, JohnTravolta));

console.log(JohnTravolta);
JohnyDepp.play();

console.log(JohnTravolta.play === JohnyDepp.play);

class superUser extends User {
    constructor(uName, uSurname) {
        super(uName, uSurname);
        this.admin = true
    }
}

const JohnAdmin = new superUser("John", "Admin", 35);
console.log(JohnAdmin);

console.log(Object.keys(JohnAdmin));
