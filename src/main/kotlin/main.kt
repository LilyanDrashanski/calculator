fun main() {

    println("To exit press q")

    when (ChooseCalculator().calculatorType()) {

        CalculatorEnum.BINARY -> {
            while (true) {

                println("\nEnter the string you want to be converted to binary")
                val str = readln()
                require(str != "q") { "End of program" }


                val binaryList = BinaryCalculator().calculate(str)

                val binaryString = binaryList.joinToString(" ")
                println(binaryString.trim())
            }
        }

        CalculatorEnum.NUMERICAL -> {

            var result = NumberInput().input()

            while (true) {

                val operator = OperatorInput().input()
                val number = NumberInput().input()

                result = NumericalCalculator().calculate(number, operator, result)
                println(result)
            }
        }
    }
}




