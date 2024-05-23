package org.example.calculator

class NumericalCalculator {


    fun calculate(number: Double, operator: OperatorEnum, previousResult: Double): Double {

        var sum = previousResult

        when (operator) {
            OperatorEnum.ADD -> sum += number
            OperatorEnum.MULTIPLY -> sum *= number
            OperatorEnum.SUBTRACT -> sum -= number
            OperatorEnum.DIVIDE -> sum /= number
            OperatorEnum.MODULE -> sum %= number
        }
        return sum
    }
}



