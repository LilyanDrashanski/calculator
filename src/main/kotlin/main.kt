import calculator.*

fun main() {

    println("To exit press 'Enter'")

    when (ChooseCalculator().calculatorType()) {

        CalculatorEnum.BINARY -> {
            while (true) {

                println("\nEnter the string you want to be converted to binary")
                val input = readln()
                require(input != "") { "End of program" }

                val binaryValue = BinaryCalculator().calculate(input)
                println(binaryValue)

            }
        }

        CalculatorEnum.NUMERICAL -> {

            println("Enter a number")
            var result = NumberInputValidations().input(readln())

            while (true) {

                println("Enter an operator")
                val operator = OperatorInputValidations().input(readln())

                println("Enter a number")
                val number = NumberInputValidations().input(readln())

                result = NumericalCalculator().calculate(number, operator, result)
                println(result)
            }
        }
    }
}




