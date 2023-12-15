function checkScope1() {
    "use strict";
    let i = "function scope";
    if (true) {
        let i = "block scope";
        console.log("Scope of i:", i);
    }
    console.log("Scope of i:", i);
    return i;
}

function checkScope2() {
    "use strict";
    if (true) {
        var i = "block scope";
        console.log("Scope of i:", i);
    }
    console.log("Scope of i:", i);
    return i;
}


checkScope1();
console.log();
checkScope2();