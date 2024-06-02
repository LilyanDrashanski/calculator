package calculator

class BinaryCalculator(val value: String) {

    fun calculate(): String {

        val numbers: MutableList<Int> = mutableListOf()
        val binary: MutableList<String> = mutableListOf()

        for (char in value) {
            numbers.add(char.code)
        }

        for (number in numbers) {
            binary.add(Integer.toBinaryString(number))
        }

        return binary.joinToString(" ").trim()
    }
}