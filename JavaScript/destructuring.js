var voxel = {x: 3.6, y: 7.4, z: 6.54};

//assigning through destructuring
const {x: a, y: b, z: c} = voxel;

console.log(`a=${a}, b=${b}, c=${c}`);

const AVG_TEMPS = {
    today: 77.5,
    tomorrow: 79
};

function getTempOfTmrw(avgTemperatures) {
    "use strict";
    const {tomorrow: result} = avgTemperatures;
    return result;
}

console.log(getTempOfTmrw(AVG_TEMPS));

const LOCAL_FORECAST = {
    today: { min: 72, max: 83 },
    tomorrow: { min: 73.3, max: 84.6 }
};

function getMaxOfTmrw(forecast) {
    "use strict";
    const { tomorrow: { max: result }} = forecast;
    return result; 
}

console.log(getMaxOfTmrw(LOCAL_FORECAST));

//destructuring from arrays
var [z, x, ,y] = [1, 2, 3, 4, 5, 6];
console.log(z, x, y);
[z, x] = [x, z];
console.log(z, x, y);

const source = [1,2,3,4,5,6,7,8,9,10];
function removeFirstTwo(list) {
    const[, , ...arr] = list;
    return arr;
}
const arr = removeFirstTwo(source);
console.log(arr);

//destructuring to pass as arguments
const stats = {
    max: 56.78,
    std_dev: 4.34,
    median: 34.54,
    mode: 23.87,
    min: -0.75,
    average: 35.85
};

const half1 = (function() {
    return function half(stats) {
        return (stats.max + stats.min)/2.0;
    };
})();
// use destuctured args
const half2 = (function() {
    return function half({max, min}) {
        return (max + min)/2.0;
    };
})();
console.log(half1(stats));
console.log(half2(stats));