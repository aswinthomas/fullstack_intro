object DemonstratingConstants {
    // constants are immutable
    // Unlike 'val', constnts are known at compile time
    // only primitive types are allowed. No custom object
    const val PI = 3.415926

    fun calculateAreaOfCircle(r: Double): Double {
        return PI * r * r
    }

    fun someFunction() {
        // const val SOME_CONSTANT = "Some value" -> wont work since this fun not invoked at start
    }

    // Constants can increase code clarity, reduce errors and makes code easier to maintain
    const val VAT_MULTIPLIER = 1.2
    fun generateTotal(subtotal: Double): Double {
        // return s*1.2 -> 1.2 doesnt mean anything here. No magic numbers.
        return subtotal * VAT_MULTIPLIER
    }

    //use constants for keys
    const val PLAYER_NAME = "name"
    const val PLAYER_HEALTH = "health"
    const val PLAYER_SPECIALITY = "speciality"

    fun createNewPlayer(name: String, speciality: String): Map<String, Any> {
        return mapof(
            PLAYER_NAME to name,
            PLAYER_HEALTH to 100,
            PLAYER_SPECIALITY to speciality
        )
    }

    val player = createNewPlayer("Mark", "Magic")
    val retreivedName = player[PLAYER_NAME]
    val retrievedHealth = player[PLAYER_HEALTH]
    val retrievedSpeciality = player[PLAYER_SPECIALITY]
}