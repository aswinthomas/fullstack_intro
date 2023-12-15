const createPerson = (name, age, gender) => {
    return {
        name: name,
        age: age,
        gender: gender
    };
};

console.log(createPerson("Zen", 56, "male"));

//make it simpler

const newPerson = (name, age, gender) => ( {name, age, gender} );
console.log(newPerson("Zen", 56, "male"));

//function within objects
const bicycle = {
    gear: 2,
    //setGear: function(newGear) {
    //simplified
    setGear(newGear) {
        "use strict";
        this.gear = newGear;
    }
};

bicycle.setGear(3);
console.log(bicycle.gear);