import kotlin.system.exitProcess

class ChooseCalculator {

    fun calculatorType(): Calculators {

        val calculators = arrayOf("BINARY", "NUMERICAL")

        println("\nEnter type of calculator you want to use")
        println("Options: ${calculators.joinToString(", ")}")

        var input = readln().uppercase()

        require(input != "") { "End of program" }

        return when (input) {
            "BINARY" -> BinaryCalculator()
            "NUMERICAL" -> NumericalCalculator()
            else -> {
                println("Invalid Choice")
                calculatorType()
            }

        }
    }
}