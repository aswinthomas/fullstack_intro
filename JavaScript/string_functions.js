 
const capitalizeString = str => str.toUpperCase();
// export const capitalizeString = .... also works
export { capitalizeString };

export const foo = "bar";
export const bar = "foo";

// fallback default export
export default function subtract(x,y) { return x-y;}