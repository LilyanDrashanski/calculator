import kotlin.system.exitProcess

class InitCalc {

    fun initCalc(): Double {

        var sum = 0.00
        val number = numberInput()
        val sign = signInput()
        val numberTwo = numberInput()


        when (sign) {
            "+" -> sum = number + numberTwo
            "*" -> sum = number * numberTwo
            "/" -> sum = number / numberTwo
            "-" -> sum = number - numberTwo
        }
        println(sum)
        return sum

    }

}