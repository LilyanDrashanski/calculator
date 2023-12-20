enum class Calculator(private val sign: String) {

    ADD("+"),
    MULTIPLY("*"),
    SUBTRACT("-"),
    DIVIDE("/");

    companion object {
        var sum = numberInput()
    }

    fun calculator() {
        val sign = signInput()
        val number = numberInput()

        when (sign) {
            ADD.sign -> sum += number
            MULTIPLY.sign -> sum *= number
            SUBTRACT.sign -> sum -= number
            DIVIDE.sign -> sum /= number
        }
        println(sum)
    }
}
