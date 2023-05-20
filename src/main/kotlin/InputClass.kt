open class InputClass(val input: String) {

    companion object {
        val operatorList = mutableListOf<String>()
        val numbers = mutableListOf<Int>()
    }

    fun inputIsValid() {
        val validVales = listOf("+", "-", "*", "/", "c", "")
        val inputIsNumber = input.toIntOrNull() != null
        if (input !in validVales && !inputIsNumber) {
            throw IllegalArgumentException("Invalid input")
        }
    }

    fun operatorOrNumber() {
        when (input) {
            "+", "-", "*", "/" -> operatorList.add(input)
            else -> numbers.add(input.toInt())
        }
    }

    fun calculate(counter: Int){
        val calculate = Calculate(input)
        calculate.calculateResult(counter)
    }
}