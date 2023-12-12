/* Data Types:
undefined, null, boolean, string, number, object
*/

// declaration
var a;
 
// can be used globally
var myName = "Aswin";
console.log("Name = " + myName);
// used only within the scope of declaration
let myLastName = "Thomas";
let myFullName = myName + " " + myLastName
console.log("My full name = " + myFullName);

var num = 4;
console.log("\nnum = " + num)
num++;
num += 12;
console.log("Incremented num = " + num)
num--;
console.log("Decremented num = " + num)



// a variable that should never change
const pi = 3.14;
console.log("PI = " + pi);
// pi = 3.15 will throw error

var dec = 2.0;
console.log("Decimal = " + dec);
dec = dec * 2.5;
console.log("Decimal after multiplication = " + dec)

var remainder = 11 % 3;
console.log("Remainder of 11/3 = " + remainder);

//escaping characters
var myStr = "I am a \"double quoted\" string inside \"double quotes\"";
console.log('\n'+myStr);
var myHtml = '<a href="http://www.example.com" target="_blank">Link';
myHtml += "</a>"
console.log(myHtml);
let len = myHtml.length;
console.log("Length of HTML is " + len);
console.log("First char of HTML is " + myHtml[0])
console.log("Last char in HTML is " + myHtml[len - 1])

// string is immutable i.e. cannot be altered once created
var helloStr = "Jello World";
console.log('\n' + helloStr);
// helloStr[0] = "H" would return an error
helloStr = "Hello World";
console.log(helloStr);
