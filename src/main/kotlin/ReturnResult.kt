class ReturnResults {

    fun calculateResults(numbers: List<Int>, operators: List<String>) {
        var result = numbers[0]

        for (i in operators.indices) {
            val operator = operators[i]
            val number = numbers[i + 1]

            when (operator) {
                "+" -> result += number
                "-" -> result -= number
                "*" -> result *= number
                "/" -> result /= number
            }
        }
        println("Result: $result")
    }
}