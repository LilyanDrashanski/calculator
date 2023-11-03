import kotlin.system.exitProcess

class Calculator {
    private var sum = 0.00

    init {
        sum = InitCalc().initCalc()
    }


    fun calculate(number: Double, sign: String): Double {

        when (sign) {
            "+" -> sum += number
            "*" -> sum *= number
            "/" -> sum /= number
            "-" -> sum -= number
            "=" -> return sum
        }
        return sum
    }

}