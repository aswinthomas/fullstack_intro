var myArray = ["John", 23];
console.log(myArray);
console.log(`myArray[0] is ${myArray[0]}`);

var array2 = [["the universe", 42],
              ["everything", 101010]];
console.log(array2);

//modify arrays
array2[1][1] = 2024;
console.log(array2);

//push appends to end of array
array2.push(["garden", 30303030])
console.log("After push:")
console.log(array2);
//unshift adds element to beginning of array
array2.unshift(["Happy", 89670]);
console.log("After unshift:");
console.log(array2);

//remove last element and return
let element = array2.pop();
console.log("After pop:")
console.log(array2);
// shift removes first element
array2.shift();
console.log("After shift:")
console.log(array2);