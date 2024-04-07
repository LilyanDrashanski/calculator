import kotlin.system.exitProcess

class ChooseCalculator {

    fun calculatorType(): Calculators {

        val calculators = arrayOf("BINARY", "NUMERICAL")

        println("\nEnter type of calculator you want to use")
        println("Options: ${calculators.joinToString(", ")}")

        var input = readln().uppercase()

        if (input == "") exitProcess(0)

        while (input !in calculators) {
            println("Invalid Choice. Please choose from ${calculators.joinToString(", ")}")
            input = readln()

        }


        return when (input) {
            "BINARY" -> BinaryCalculator()
            "NUMERICAL" -> NumericalCalculator()
            else -> throw IllegalArgumentException("Unknown calculator type: $input")
        }
    }
}