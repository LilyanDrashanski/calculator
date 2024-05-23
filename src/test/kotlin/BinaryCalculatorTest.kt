package calculator

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BinaryCalculatorTest() {
    @Test
    fun binaryConversionTest() {
        val calculator = BinaryCalculator()

        val result = calculator.calculate("apple").toString()
        Assertions.assertEquals("1100001 1110000 1110000 1101100 1100101", result)
    }
}