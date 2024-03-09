import kotlin.system.exitProcess

fun main() {

    println("To exit press Enter")

    when (val calculator = calculatorType()) {

        is BinaryCalculator -> {
            while (true){
                calculator.calculate()
            }
        }

        is NumericalCalculator -> {
            while (true) {
                calculator.calculate()
            }
        }
    }
}


fun calculatorType(): Calculators {

    val calculators = arrayOf("Binary", "Numerical")

    println("\nEnter type of calculator you want to use")
    println("Options: ${calculators.joinToString(", ")}")

    var input = readln()

    if (input == "") exitProcess(0)

    while (input !in calculators) {
        println("Invalid Choice. Please choose from ${calculators.joinToString(", ")}")
        input = readln()

    }


    return when (input) {
        "Binary" -> BinaryCalculator()
        "Numerical" -> NumericalCalculator()
        else -> throw IllegalArgumentException("Unknown calculator type: $input")
    }
}


