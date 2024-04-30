package Calculator

class OperatorInput {
    fun input(): OperatorEnum {
        val operatorsList = OperatorEnum.values()
        println("Enter an operator")

        val input = readln()


        require(input != "q") { "End of program" }

        val operator = operatorsList.find { it.operator == input }


        return operator ?: run {
            println("Invalid input")
            input()
        }

    }
}