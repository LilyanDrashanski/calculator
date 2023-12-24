class Calculator() {
    private var sum = numberInput()

    fun calculator(sign: String, number: Double) {

        when (sign) {
            Signs.ADD.sign -> sum += number
            Signs.MULTIPLY.sign -> sum *= number
            Signs.SUBTRACT.sign -> sum -= number
            Signs.DIVIDE.sign -> sum /= number
        }
        println(sum)
    }
}
