package calculator

class BinaryCalculator {

    fun calculate(string: String): String {

        val numbers: MutableList<Int> = mutableListOf()
        val binary: MutableList<String> = mutableListOf()

        for (char in string) {
            numbers.add(char.code)
        }

        for (number in numbers) {
            binary.add(Integer.toBinaryString(number))
        }

        return binary.joinToString(" ").trim()
    }
}