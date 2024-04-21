class BinaryCalculator() {

    fun calculate(string: String) {

        val numbers: MutableList<Int> = mutableListOf()

        for (char in string) {
            numbers.add(char.code)
        }

        for (number in numbers) {
            print("${Integer.toBinaryString(number)} ")
        }
    }

}