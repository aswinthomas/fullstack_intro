// functions start with 'fun' then the name of the function
// no return type necessary if void
// by default the function is public
fun makeNoise() {
    println("ARGHH!!")
}
makeNoise()

// add parameters with the name and type
fun greet(name: String) {
    println("Hello $name!")
}
greet("Mark")

fun birthdayCake(name: String, age: Int) {
    println("Happy Birthday $name! Now blow out your $age candles")
}
birthdayCake("Jenny", 25)

// return type specified at the end of definition
// default return type is 'Unit' similar to 'void'
fun multiply(num1: Int, num2: Int): Int {
    return num1 * num2
}

val result = multiply(5,3)
println("5 multiplied by 3 is $result")

// One liner function as an expression with no curly braces and '=' sign
fun square(num: Int): Int = num * num

// One liner function expression, inferring the return type
fun square2(num: Int) = num * num

square(5)
square2(5)