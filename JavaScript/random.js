var randomNumBetween0And1 = Math.random();
console.log(randomNumBetween0And1);

var randomNumBetween0And19 = Math.floor(Math.random() * 20);
console.log(randomNumBetween0And19);

var randomWholeNumBetween0And9 = Math.floor(Math.random() *10)
console.log(randomWholeNumBetween0And9);

function getRandomRange(minVal, maxVal) {
    return minVal + Math.floor(Math.random() * (maxVal - minVal + 1));
}

var minVal = 4;
var maxVal = 16;
console.log(`Random number between ${minVal} and ${maxVal} = ${getRandomRange(minVal,maxVal)}`)