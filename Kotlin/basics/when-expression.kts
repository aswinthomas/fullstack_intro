fun navigate(nav: String) {
    when (nav) {
        "login" -> {
            println("You have reached the login screen")
            println("Please enter your credentials")
        }

        "registration" -> println("You have reached the registration screen")
        "terms" -> println("You have reached the T&C screen")
        else -> println("Invalid Destination")
    }
}

navigate("login")
navigate("settings")

fun passwordChecker(pass: String) {
    when {
        pass.length < 6 -> println("too short")
        pass == "password" -> println("too predictable")
        pass.contains("aaaa") -> println("too many repeated 'a")
        else -> println("good enough")
    }
}

passwordChecker("hello")
passwordChecker("password")
passwordChecker("paaaaaasword")
passwordChecker("verygoodpass")

// With a 'when expression', it is poddible to assign a var directly
fun getDifficulty(level: Int): String {
    val difficulty: String = when (level) {
        1 -> "Easy"
        2 -> "Medium"
        3 -> "Hard"
        else -> "Invalid Level Input"
    }
    return difficulty
}

// also can do inline as well
fun getDifficultyInline(level: Int) = when (level) {
    1 -> "Easy"
    2 -> "Medium"
    3 -> "Hard"
    else -> "Invalid Level Input"
}


getDifficulty(2)
getDifficulty(55)
getDifficultyInline(3)
getDifficultyInline(-4)