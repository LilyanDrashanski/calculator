package calculator

class NumericalCalculator(private val number: String, private val operator: OperatorEnum, private val number2: String) {


    fun calculate(): Double {

        val dNumber = NumberInputValidations().input(number)
        val dNumber2 = NumberInputValidations().input(number2)

        return when (operator) {
            OperatorEnum.ADD -> dNumber + dNumber2
            OperatorEnum.MULTIPLY -> dNumber * dNumber2
            OperatorEnum.SUBTRACT -> dNumber - dNumber2
            OperatorEnum.DIVIDE -> dNumber / dNumber2
            OperatorEnum.MODULE -> dNumber % dNumber2
        }
    }
}



