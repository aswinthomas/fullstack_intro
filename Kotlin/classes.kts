class KotlinClass {
    var aClassProperty: String? = null

    fun aClassFunction() {
        println("I'm a class function. My property is: $aClassProperty")
    }
}

// no need the 'new' word
val classTest = KotlinClass()
classTest.aClassProperty = "Setting the class property"
classTest.aClassFunction()

// Constructors immediately follows class name, combining property definition and constructor
// Because we demand these values in the constructor, the properties can be non null
// You can use access modifiers like private (public by default)
class ClassWithConstructor(
    var aClassProperty: String,
    var aNullableProperty: String?,
    val aFixedProperty: Int,
    private var aSecretProperty: String
) {
    //override is inline (as opposed to on top)
    override fun toString(): String {
        return "ClassWithConstructor(aClassProperty=$aClassProperty, aNullableProperty=$aNullableProperty, " +
                "aFixedProperty=$aFixedProperty, aSecretProperty=$aSecretProperty)"
    }
}

val constructorTest = ClassWithConstructor(
    "Mark", "This could be null",
    7, "Secret value"
)
println(constructorTest)
constructorTest.aClassProperty = "Peter"
//constructorTest.aClassProperty = null -> cant make this null, not nullable
constructorTest.aFixedProperty
//constructorTest.aFixedProperty = 12 -> cant change, since it was set as val
//constructorTest.aSecretProiperty -> we cant see this since its private

// Data classes
// Similar to regular class but includes a useful 'toString()' method
data class MyDataContainer(val someData: String, val someMore: Boolean, val yetMore: Int) {

}
val dataClassTest = MyDataContainer("Hey", true, 5)
println(dataClassTest)

data class Person(val name: String, val age: Int)

val myPerson = Person("Chris", 25)

// if we need to send the object outside of the current live environment, we need to persist it
// One way is serialization
data class SerializablePerson(val name: String, val age: Int) : Serializable
