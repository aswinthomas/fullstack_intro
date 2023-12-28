import javax.swing.text.StyledEditorKit.BoldAction

// Kotlin does not have 'static'. So we cant put a property in a class and make it static
// You cant put a 'const val' in a class

// Option 1: Set const in a file that is in a package i.e. Top Level
//const val GENERIC_NAME = "Peter"

class Person {
    var name: String? = null
    fun greet(): String {
        return "Hi, my name is $name"
    }
}

val myPerson = Person()
//myPerson.name = GENERIC_NAME


// Option 2: Declare something called 'object' (one instance) and put constants inside that i.e. Named object
// *** NAMED OBJECT ***
object CountryCodes {
    const val UNITED_STATES = "US"
    const val INDIA = "IN"
    const val GERMANY = "DE"

    fun getFullName(code: String): String {
        return when (code) {
            UNITED_STATES -> "United States of America"
            INDIA -> "India"
            GERMANY -> "Germany"
            else -> "Unknown Country"
        }
    }

    // you can nest objects
    object ThreeLetter {
        const val UNITED_STATES = "USA"
        const val INDIA = "IND"
        const val GERMANY = "DEU"
    }
}

CountryCodes.GERMANY
CountryCodes.ThreeLetter.UNITED_STATES
CountryCodes.getFullName(CountryCodes.GERMANY)


// Option 3: Companion object, allowing constant within class namespace
// *** COMPANION OBJECT ***
// This is the way to put const inside a class, very similar to Java static
class Employee(val name: String, val grade: String) {

    fun printDetails() {
        println("Name: $name")
        println("Grade: $grade")
        println("Company: $COMPANY_NAME")
    }

    companion object {
        const val COMPANY_NAME = "iRobot Corp"

        fun isAdmin(employee:Employee): Boolean {
            return employee.grade == "Exec"
        }
    }
}

Employee.COMPANY_NAME

val employeePeter = Employee("Peter", "Junior")
val employeeMax = Employee("Max", "Exec")
employeePeter.printDetails()
employeeMax.printDetails()

Employee.isAdmin(employeeMax)