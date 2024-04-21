class OperatorInput {
    fun input(): String {
        val signs = arrayOf("+", "-", "*", "/","%")
        println("Enter an operator")

        val sign = readln()


        require(sign != "q"){"End of program"}


        return when (sign) {
            in signs -> {
                sign
            }
            else -> {
                println("Invalid input")
                input()
            }
        }
    }
}