// This is a comment
/* This is a
 multiline comment */
print("Hello World")

// string interpolation
print("The result of 2 + 3 = \(2+3)")

var a = 5
var b = 8
print("The result of \(a) + \(b) = \(a+b)")
//swap
(a, b) = (b, a)
print("The result of \(a) + \(b) = \(a+b)")

let friends: [String] = ["Angela", "Jack", "Philip"]

var numbers = [45, 73, 195, 53]
var result: [Int] = []

for i in 1..<numbers.count {
    result.append(numbers[i] * numbers[i-1])
}
print(result)

let PI = 3.14159

// the following is 1 and 6 inclusive
let randomNumber = Int.random(in: 1...6)
// the following is 1 inclusive and 6 excluded
let randomNumber2 = Int.random(in: 1..<6)

var arr = [1,2,3,4,5]
arr.randomElement()
arr.shuffle()
print(arr)

