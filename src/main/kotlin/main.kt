fun main() {

    println("To exit press Enter")

    when (val calculator = ChooseCalculator().calculatorType()) {

        is BinaryCalculator -> {
            while (true) {
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




