/*
Interfaces: Point where two systems meet and interact.
USER -> Computer through a 'user interface'
*/

interface CoffeeProvider {
    fun serveCoffee()
    fun greet(name: String): String
}

class JoezCoffee : CoffeeProvider {
    override fun greet(name: String): String {
        return "Welcome to Joe's Coffee $name!"
    }

    override fun serveCoffee() {
        createJoezCoffee()
        println("Here is Joe's finest Coffee")
    }

    fun createJoezCoffee() {

    }

}

class Coffee4U: CoffeeProvider {
    override fun greet(name: String): String {
        return "Greetings $name! We have some coffee for you"
    }

    override fun serveCoffee() {
        createCoffee4U()
        println("Enjoy your Coffee4U coffee!")
    }

    fun createCoffee4U() {

    }
}

class BestKoffee: CoffeeProvider {
    override fun greet(name: String): String {
        return "You have made the best choice $name! "
    }

    override fun serveCoffee() {
        createbestKoffee()
        println("Here is some Best Koffee!")
    }

    fun createbestKoffee() {

    }
}

class ManWithBicycle: CoffeeProvider {
    override fun greet(name: String): String {
        return "Hi $name! I can cycle a coffee to you "
    }

    override fun serveCoffee() {
        goGetCoffee()
        println("The coffee is cold now, but here it is...")
    }

    fun goGetCoffee() {

    }
}

// val joeCoffee: JoezCoffee = JoezCoffee() -> may not want to use this, so we dont expose inner creation method
// Inheritance sometimes doesnt work since anyone could make a coffee, a machine, a bicycle man. Hence we use interface
val coffee1: CoffeeProvider = JoezCoffee() // instead use an interface object
coffee1.greet("Mark")
coffee1.serveCoffee()

val shop1: CoffeeProvider = JoezCoffee()
val shop2: CoffeeProvider = Coffee4U()
val shop3: CoffeeProvider = BestKoffee()
val man: CoffeeProvider = ManWithBicycle()


val coffeeProviders: Array<CoffeeProvider> = arrayOf(shop1, shop2, shop3, man)

for (cp in coffeeProviders) {
    println(cp.greet("Vincent"))
    cp.serveCoffee()
}
