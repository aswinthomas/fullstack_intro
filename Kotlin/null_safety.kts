import java.util.Locale

/*
NON NULL VARIABLES
By default, variables cannot be null, so when declared we must assign it.
 */
var nonNullVariable: String = "Hello"
// var unassignedNonNUllVariable: String --> wont work

nonNullVariable.uppercase()

/*
NULLABLE VARIABLE
To declare that a variable can be null, we add a '?' after the type
 */
var nullableVariable: String? = null

//var nullableVariable: String? -> wont work. Must explicitly assign to something

nullableVariable = "Assigned to a new String"

// we can assign it back to null if needed
nullableVariable = null

//nullableVariable.uppercase() -> wont work since its a nullable variable

/*
NULL SAFETY
We have to take extra steps when dealing with nullable variables
 */
var anotherNullableVariable: String? = "Assigned to String, but it can still be null"

// *** Safe Call ***
// To call any property or method on a nullable variable, we can do a 'safe call'
// We put a '?' after the variable
anotherNullableVariable?.uppercase()

// If the variable is null, it will return null on all methods
anotherNullableVariable = null
anotherNullableVariable?.uppercase()
//If you want to chain another method, must use the '?'
anotherNullableVariable?.lowercase()?.replaceFirstChar {
    if (it.isLowerCase()) it.titlecase(
        Locale.getDefault()
    ) else it.toString()
}

// *** Non-null Assertion **
// If we are certain that a variable will not be null, we can do a non null assertion
// We put a '!!' after the variable.
// If we are wrong and it ends up being null, it will throw a NullPointerException like in Java
anotherNullableVariable = "Now it's not null"
if (anotherNullableVariable != null) {
    anotherNullableVariable = anotherNullableVariable!!.uppercase()
}
anotherNullableVariable