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