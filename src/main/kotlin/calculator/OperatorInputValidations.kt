package calculator

class OperatorInputValidations {
    fun input(operatorInput: String): OperatorEnum {
        val operatorsList = OperatorEnum.values()

        require(operatorInput != "") { "End of program" }

        val operator = operatorsList.find { it.operator == operatorInput }

        require(operator != null) { "Invalid input. Please enter an operator" }

        return operator

    }
}