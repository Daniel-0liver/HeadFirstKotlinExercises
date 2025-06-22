import java.util.Locale.getDefault

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValid = false
    var userChoice = ""
    while (!isValid) {
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        var userInput = readLine()
        userInput = userInput?.trim()?.replaceFirstChar {
            if (it.isLowerCase())
                it.titlecase(getDefault())
            else it.toString()
        }
        if (userInput.isNullOrEmpty()) {
            continue
        } else if (userInput !in optionsParam) {
            println("$userInput, is not a valid option")
        } else {
            userChoice = userInput
            isValid = true
        }
    }
    return userChoice
}

fun checkResult(userChoice: String, cpuChoice: String) {
    println("Your choice $userChoice")
    println("CPU choice $cpuChoice")
    if (userChoice == cpuChoice) {
        println("DRAW")
        return
    }
    when (userChoice) {
        "Rock" -> if (cpuChoice == "Paper") println("You lose") else println("You won")
        "Paper" -> if (cpuChoice == "Scissors") println("You lose") else println("You won")
        "Scissors" -> if (cpuChoice == "Rock") println("You lose") else println("You won")
    }
}

fun game() {
    val options = arrayOf(
        "Rock", "Paper", "Scissors"
    )

    val getGameChoice = getGameChoice(options)

    var getUserChoice = getUserChoice(options)

    checkResult(getUserChoice, getGameChoice)
}

fun main() {
    while (true) {
        game()
    }
}
