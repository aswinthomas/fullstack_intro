class Shop {
    // for class properties, we can assign immediately
    var isOpen = false

    // use lateinit to promise to assign it later
    // (if we don't, the app will crash during access)
    lateinit var manager: String

    // lazy initialization to assign it, only when accessed
    // Any code in the lazy blocked is run once accessed i.e. deferred code
    private val inventory: Inventory by lazy {
        Inventory(25, 50, 10, 15)
    }

    fun open(personInCharge: String) {
        manager = personInCharge
        isOpen = true
    }

    fun close() {
        isOpen = false
    }

    // here is where the first access takes place
    fun checkInventory(): Inventory {
        return inventory
    }

    data class Inventory(
        var phones: Int,
        var chargers: Int,
        var headphones: Int,
        var memoryCards: Int
    )
}

val phoneShop = Shop()
phoneShop.isOpen
phoneShop.open("Mark")
println("The shop's open status is ${phoneShop.isOpen}, and the manager for the day is ${phoneShop.manager}")
phoneShop.checkInventory()

class Counter {
    val sumOf1to10 = 55
    // use lazy init from complex code from running if its not needed
    val sumOf1to50: Int by lazy {
        println("Inside start of lazy block")
        var total = 0
        // to loop through a range of numbers
        for (i in 1..50) {
            total += i
        }
        total
    }

    fun calculateSumOf1to50() = sumOf1to50
}

val counter = Counter()
println(counter.sumOf1to10)
println(counter.calculateSumOf1to50())