var myGlobal = 10

function wordBlanks(myNoun, myAdjective, myVerb, myAdverb) {
    var result = "";
    // since no var keyword is provided, it becomes global automatically
    oopsGlobal = 5;
    result = `The ${myAdjective} ${myNoun} ${myVerb} to the store ${myAdverb}`; 
    return result;
}

console.log(wordBlanks("dog", "big", "ran", "quickly"));
console.log(wordBlanks("bike", "slow", "flew", "slowly"));

function fun2() {
    var output = "";
    if (typeof myGlobal != "undefined") {
        output += "myGlobal: " + myGlobal;
    }
    if (typeof oopsGlobal != "undefined") {
        output += " oopsGlobal: " + oopsGlobal;
    }
    console.log(output);
}

fun2();

//function with default param
function talk() {
    // to catch coding mistakes
    "use strict";
}

//reduce
// function with default value
const sum = (x, y, z=1) => {
    const args = [x, y, z];
    return args.reduce((a,b) => a + b, 0);
}
console.log(`Sum is ${sum(1, 2, 3)}`);

//rest operator
const sum2 = (...args) => {
    return args.reduce((a,b) => a + b, 0);
}
console.log(`Sum is ${sum(1, 2, 3)}`);

//spread operator
const arr1 = ['jan', 'feb', 'mar', 'apr', 'may'];
let arr2;
(function() {
    arr2 = arr1;
    arr1[0] = 'potato';
})();
console.log(arr2);
arr1[0] = 'jan';
(function() {
    // spreads out the contents into the array, making a copy
    arr2 = [...arr1];
    arr1[0] = 'potato';
})();
console.log(arr2);

// anonymous function without a name
var magic = function() {
    return new Date();
};
//instead of writing function... create an arrow function
var magic = () => {
    return new Date();
};
// it can be further reduced to:
var magic = () => new Date();

//arrow function with parameters
var myConcat = (arr1, arr2) => arr1.concat(arr2);
console.log(`Concatenated output: ${myConcat([1,2], [3,4,5])}`);

// higher order arrow, where function can be param
const realNumberArray = [4, 5.6, -9.8, 3.4, 42, -6];
//get squares of only positive numbers
const squareList = (arr) => {
    //map takes a function as an argument
    const squaredIntegers = arr.filter(num => Number.isInteger(num) && num > 0)
                               .map(x => x * x);
    return squaredIntegers;
}
console.log(squareList(realNumberArray));