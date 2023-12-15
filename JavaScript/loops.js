var myArray = [];
var i=0;

while(i < 5) {
    myArray.push(i);
    i++;
}

console.log(myArray);

myArray = [];
for(var i=1; i<6; i++) {
    myArray.push(i);
}
console.log(myArray);

myArray = [];
var i = 10;

do {
    myArray.push(i);
} while(i < 5);

console.log(myArray);