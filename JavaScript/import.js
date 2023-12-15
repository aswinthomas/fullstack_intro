
import * as stringFunctions from "./string_functions.js"
import { capitalizeString } from "./string_functions.js"

const cap = capitalizeString("hello!");
console.log(cap);

const cap2 = stringFunctions.capitalizeString("hello!");
console.log(cap2);

// import default, so no curly braces
import subtract from "./string_functions.js"
console.log(subtract(7,4));