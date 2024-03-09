import kotlin.math.round


class Calculator(): Calculators {
    private var sum = NumberInput().input()

    fun calculator(sign: String, number: Double) {

        when (sign) {
            Signs.ADD.sign -> sum += number
            Signs.MULTIPLY.sign -> sum *= number
            Signs.SUBTRACT.sign -> sum -= number
            Signs.DIVIDE.sign -> sum /= number
            Signs.MODULE.sign -> sum %= number
        }
        println(round(sum))
    }

    override fun calculate() {
        TODO("Not yet implemented")
    }
}



