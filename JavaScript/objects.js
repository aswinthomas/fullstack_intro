var ourDog = {
    "name": "Camper",
    "legs": 4,
    "tails": 1,
    "friends": ["everything"],
    16: "dry food",
    17: "wet food"
};

var name = ourDog.name;
// required especially if property has space inside
var altname = ourDog["name"];
var date = 16;
var food = ourDog[date];

console.log(name);
console.log(altname);
console.log(food);


ourDog["name"] = "Happy Camper";
ourDog["bark"] = "bow wow";

console.log(ourDog);

delete ourDog["tails"];
console.log(ourDog);

//check for existing property
console.log(ourDog.hasOwnProperty("legs"));

var myStorage = {
    "car": {
        "inside": {
            "glove_box": "maps",
            "passenger seat": "crumbs"
        },
        "outside": {
            "trunk": "jack"
        }
    }
}

box = myStorage["car"]["inside"]["glove_box"];

console.log(box)
// create hood array if not present
myStorage["car"]["outside"]["hood"] = myStorage["car"]["outside"]["hood"] || [];
myStorage["car"]["outside"]["hood"].push("engine");
console.log(myStorage["car"]["outside"]);


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