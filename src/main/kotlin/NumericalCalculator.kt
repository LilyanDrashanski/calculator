import kotlin.math.round


class NumericalCalculator : Calculators {
    private var sum = NumberInput().input()

    override fun calculate() {
        val sign = SignInput().input()
        val number = NumberInput().input()

        when (sign) {
            SignsEnum.ADD.sign -> sum += number
            SignsEnum.MULTIPLY.sign -> sum *= number
            SignsEnum.SUBTRACT.sign -> sum -= number
            SignsEnum.DIVIDE.sign -> sum /= number
            SignsEnum.MODULE.sign -> sum %= number
        }
        println(round(sum))
    }
}



