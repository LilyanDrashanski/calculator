class NumericalCalculator {


    fun calculate(number: Double, operator: String, result: Double): Double {

        var sum = result

        when (operator) {
            SignsEnum.ADD.sign -> sum += number
            SignsEnum.MULTIPLY.sign -> sum *= number
            SignsEnum.SUBTRACT.sign -> sum -= number
            SignsEnum.DIVIDE.sign -> sum /= number
            SignsEnum.MODULE.sign -> sum %= number
        }
        return sum
    }
}



