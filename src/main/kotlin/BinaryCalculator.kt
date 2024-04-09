
class BinaryCalculator : Calculators {
    override fun calculate() {

        println("\nEnter the value you want to be converted to binary")
        val input = readln()


        require(input !=""){"End of program"}

        try {
            val number = input.toInt()
            println(Integer.toBinaryString(number))
        } catch (e: Exception) {

            for (char in input) {

                val asciiValue = char.code

                print("${Integer.toBinaryString(asciiValue)} ")
            }

        }
    }
}