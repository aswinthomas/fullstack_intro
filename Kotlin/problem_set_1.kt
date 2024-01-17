package com.aswindev.training.concepts

// Convert dash/underscore delimited words into camel casing
// https://www.codewars.com/kata/517abf86da9663f1d2000003/train/kotlin
fun toCamelCase(str: String): String {
    if (str.isEmpty()) return str
    val delimiters = setOf('-', '_')

    return str.mapIndexed { i, c ->
        when {
            c == '_' || c == '-' -> null
            (i > 0) && (str[i - 1] in delimiters) -> c.uppercase()
            else -> c
        }
    }.filterNotNull().joinToString("")
}

// Convert to roman numeral
// https://www.codewars.com/kata/554b4ac871d6813a03000035/kotlin
fun encode(num: Int): String {
    val romanMap = linkedMapOf(
        1000 to "M", 900 to "CM", 500 to "D", 400 to "CD",
        100 to "C", 90 to "XC", 50 to "L", 40 to "XL",
        10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I"
    )
    var number = num
    var res = ""
    for ((romanNum, romanVal) in romanMap) {
        while (number >= romanNum) {
            number -= romanNum
            res += romanVal
        }
    }
    return res
}

fun main() {
    println(encode(1))
}
