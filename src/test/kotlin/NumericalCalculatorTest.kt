package calculator

import NumericalCalculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class NumericalCalculatorTest {
    @Test
    fun additionTest() {
        val calculator = NumericalCalculator()

        val result = calculator.calculate(2.00, "+", 2.00)
        assertEquals(4.00, result)
    }

    @Test
    fun subtractionTest() {
        val calculator = NumericalCalculator()

        val result = calculator.calculate(6.00, "-", 4.00)
        assertEquals(-2.00, result)
    }

    @Test
    fun divisionTest() {
        val calculator = NumericalCalculator()

        val result = calculator.calculate(2.00, "/", 8.00)
        assertEquals(4.00, result)
    }


    @Test
    fun multiplicationTest() {
        val calculator = NumericalCalculator()

        val result = calculator.calculate(2.00, "*", 2.00)
        assertEquals(4.00, result)
    }

    @Test
    fun multipleOperationsTest() {
        val calculator = NumericalCalculator()

        var result = calculator.calculate(2.00, "*", 2.00)
        result = calculator.calculate(2.00, "-", result)
        result = calculator.calculate(2.00, "/", result)
        result = calculator.calculate(2.00, "+", result)
        result = calculator.calculate(2.00, "%", result)


        assertEquals(1.00, result)
    }

    @Test
    fun moduleTest() {
        val calculator = NumericalCalculator()

        val result = calculator.calculate(2.00, "%", 5.00)

        assertEquals(1.00, result)
    }

}