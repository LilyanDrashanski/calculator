fun main() {

    println("To exit press q")

    when (ChooseCalculator().calculatorType()) {

         CalculatorEnum.BINARY -> {
            while (true) {

                println("\nEnter the string you want to be converted to binary")
                val str = readln()

                BinaryCalculator().calculate(str)
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




