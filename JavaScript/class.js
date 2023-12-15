var SpaceShuttle = function(targetPlanet) {
    this.targetPlanet = targetPlanet;
}

var zeus = new SpaceShuttle('Jupiter');

console.log(zeus.targetPlanet);

//instead of the above, use class syntax

class NewSpaceShuttle {
    constructor(targetPlanet) {
        this.targetPlanet = targetPlanet;
    }
}

zeus = new NewSpaceShuttle('Jupiter');

console.log(zeus.targetPlanet);


class Thermostat {
    constructor(temp) {
        this._temp = 5/9 * (temp - 32);
    }
    //getter
    get temperature() {
        return this._temp;
    }
    //setter
    set temperature(newTemp) {
        this._temp = newTemp;
    }
};

const thermos = new Thermostat(76);
//notice no paranthesis like a function
let temp = thermos.temperature;
console.log(temp);
thermos.temperature = 26;
temp = thermos.temperature;
console.log(temp);