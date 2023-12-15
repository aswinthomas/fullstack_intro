function ourTrueOrFalse(isItTrue) {
    if (isItTrue) {
        return "Yes, it is true";
    } 
    return "No, it is false"
}

let ret = ourTrueOrFalse(true);
console.log(ret);

function testEqual(val1, val2) {
    // equality operator
    if (val1 == val2) {
        return "Equal";
    }
    return "Not Equal";
}

console.log(testEqual(12,12));
console.log(testEqual(12,7));

function testStrict(val1, val2) {
    if (val1 === val2) {
        return "Equal in value and datatype";
    }
    return "Not equal in value or datatype";
}

console.log(testStrict(7, 7));
console.log(testStrict(7, "7"));

function testStrictNotEqual(val1, val2) {
    if (val1 !== val2) {
        return "Not Equal in value or datatype";
    }
    return "Equal in value or datatype";
}

console.log(testStrictNotEqual(9, "9"));
console.log(testStrictNotEqual(9, 9));

function testLogicalAnd(val) {
    if (val <= 50 && val >= 25) {
        return "Value is between 25 and 50, both inclusive";
    }
    return "Value is below 25 or greater than 50"
}

console.log(testLogicalAnd(40));
console.log(testLogicalAnd(20));

function testElseIf(val) {
    if (val > 10) {
        return "Greater than 10";
    } else if (val < 5) {
        return "Less than 5";
    } else {
        return "Between 5 and 10, both inclusive"
    }
}

console.log(testElseIf(6));

function caseInSwitch(val) {
    let answer = "";
    switch(val) {
        // this is a === comparison
        case 1:
        case 10:
        case 100:
            answer = "alpha";
            break;
        case 2:
            answer = "beta";
            break;
        case 3:
            answer = "gamma";
            break;
        case 4:
            answer = "delta";
            break;
        default:
            answer = "undefined input";
            break;
    }
    return answer;
}

console.log(caseInSwitch(1));
console.log(caseInSwitch(100));
console.log(caseInSwitch("cat"));

// ternary operator
function getVal(a,b) {
    return a === b ? 11 : 12;
}

function checkSign(num) {
    return num>0 ? "positive" : (num<0 ? "negative" : "zero"); 
}