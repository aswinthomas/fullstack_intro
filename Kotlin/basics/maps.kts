import java.util.HashMap

// Map - collection of read only Key-value pairs
// HashMap - collection of read/write Key-value pairs
// Keys must be unique
// Types can be nullable, but must be specified e.g. Map<String, Int?>
val emptyHashMap: HashMap<String, String> = hashMapOf()
val emptyMap: Map<String, Int> = mapOf()

// we can also use the traditional way. IN Java there would be 'new'
val anotherHashMap: HashMap<String, Boolean> = HashMap()
//val anotherMap: Map<Double, String> = Map() -> wont work since Map is an interface
// hence always use hashMapOf(), mapOf(), arrayOf()

val pets: HashMap<String, String> = hashMapOf()

pets.put("Fido", "Dog")
pets["Max"] = "Cat" // Recommended

println(pets.get("Max"))
println(pets["Fido"]) // Recommended

//update
pets["Max"] = "Arabian Mau Cat"

//remove
pets.remove("Fido")
pets["Fido"]

data class Student(val name: String, val age: Int, val nationality: String)

val studentData: HashMap<String, Student> = hashMapOf()

studentData["AL141"] = Student("Alex", 22, "Canadian")
studentData["RI855"] = Student("Richard", 21, "Australian")


val bankBalances: HashMap<String, Double> = hashMapOf(
    Pair("GreedyBank", -89.3),
    Pair("NiceBank", 145.76),
    Pair("RegularBank", 57.97)
)

bankBalances["GreedyBank"]

val reportCard: Map<String, String> = mapOf(
    "English" to "A",
    "Math" to "B-",
    "Music" to "A+"
)

reportCard["Math"]

// Type inference
// If you initialize as key value pairs, they can be inferred
val secretAccess = hashMapOf(
    "Basement" to true,
    "Experimental Lab" to false,
    "Staff Room" to true
)

secretAccess["Staff Room"]

// Once key and value are set, you cannot put any other data types in
// secretAccess["Living Room"] = 12

