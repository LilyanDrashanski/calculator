import kotlin.math.round


class NumericalCalculator : Calculators {
    private var sum = NumberInput().input()

    override fun calculate() {
        val sign = SignInput().input()
        val number = NumberInput().input()

        when (sign) {
            Signs.ADD.sign -> sum += number
            Signs.MULTIPLY.sign -> sum *= number
            Signs.SUBTRACT.sign -> sum -= number
            Signs.DIVIDE.sign -> sum /= number
            Signs.MODULE.sign -> sum %= number
        }
        println(round(sum))
    }
}



