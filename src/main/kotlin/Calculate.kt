class Calculate(input: String) : InputClass(input) {
    fun calculateResult(counter: Int) {
        if (counter > 2 && counter % 2 != 0) {
            var result = numbers[0]
            for (i in operatorList.indices) {
                val currentOperator = operatorList[i]
                val a: Int = numbers[i + 1]
                when (currentOperator) {
                    "+" -> result += a
                    "*" -> result *= a
                    "-" -> result -= a
                    "/" -> result /= a
                }
            }
            println("Result: $result")
        }

    }
}
