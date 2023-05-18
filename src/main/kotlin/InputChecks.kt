class InputChecks {
    fun checkForEnd(input: String): Boolean {
        return input == ""
    }

    fun checkOperator(input: String): Boolean {
        return input == "+" || input == "-" || input == "*" || input == "/"
    }


    fun addNumberToList(input: String): Int {
        return input.toInt()
    }

    fun validInput(input: String): Boolean {
        return input != "" && input != "c" && input != "+" && input != "-" && input != "/" && input != "*" && input.toIntOrNull() == null

    }
}