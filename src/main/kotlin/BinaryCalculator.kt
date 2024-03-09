import kotlin.system.exitProcess

class BinaryCalculator() : Calculators {

    private fun wordToNumber(): MutableList<Int> {

        println("\nEnter the value you want to be converted to binary")
        val str = readln()

        if (str == "") exitProcess(0)

        val iterator = str.iterator()

        val numbers: MutableList<Int> = mutableListOf()



        while (iterator.hasNext()) {
            val char = iterator.next()
            numbers.add(char.code)
        }

        return numbers
    }

    override fun calculate() {

        val numbers = wordToNumber()

        for (number in numbers) {
            print("${Integer.toBinaryString(number)} ")
        }
    }

}