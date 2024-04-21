
class ChooseCalculator {

    fun calculatorType(): CalculatorEnum {

        val calculators = arrayOf("BINARY", "NUMERICAL")

        println("\nEnter type of calculator you want to use")
        println("Options: ${calculators.joinToString(", ")}")

        val input = readln().uppercase()

        require(input != "q") { "End of program" }

        return when (input) {
            "BINARY" -> CalculatorEnum.BINARY
            "NUMERICAL" -> CalculatorEnum.NUMERICAL
            else -> {
                println("Invalid Choice")
                calculatorType()
            }
        }
    }
}