class NumberInput {

    fun input(): Double {
        println("Enter a number")

        val numberInput = readln()
        val saveNumber: Double

        require(numberInput !="q"){"End of program"}


        return try {
            saveNumber = numberInput.toDouble()
            saveNumber
        } catch (e: Exception) {
            println("Invalid output")
            input()
        }
    }
}