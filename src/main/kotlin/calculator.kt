var isNumber = true


fun main() {

    val numbers = mutableListOf<Int>()
    val operator = mutableListOf<String>()
    val inputChecks = InputChecks()
    val calculator = ReturnResults()

    while (true) {
        val input = readln()

        if (inputChecks.checkForEnd(input)) {
            break
        }

        checkForInvalidInput(input, inputChecks)

        checkForErase(input)

        checkNumberOrOperator(input, inputChecks, operator, numbers)

        if (numbers.size >= 2 && isNumber) {
            calculator.calculateResults(numbers, operator)
        }


    }
}


fun checkForInvalidInput(input: String, inputChecks: InputChecks) {
    if (inputChecks.validInput(input)) {
        throw IllegalArgumentException("Invalid input")
    }
}

fun checkForErase(input: String) {
    if (input == "c") {
        println("\n\n\n\n\n\n\n\n")
        main()
    }
}


fun checkNumberOrOperator(
    input: String,
    inputChecks: InputChecks,
    operator: MutableList<String>,
    numbers: MutableList<Int>
) {
    if (inputChecks.checkOperator(input)) {
        operator.add(input)
        isNumber = false
    } else {
        numbers.add(inputChecks.addNumberToList(input))
        isNumber = true
    }
}
