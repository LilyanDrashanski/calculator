package calculator

import calculator.NumericalCalculator
import calculator.OperatorEnum
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource


class NumericalCalculatorTest {

    companion object {
        @JvmStatic
        fun operations(): List<Arguments> {
            return listOf(
                Arguments.of(6.00, OperatorEnum.SUBTRACT, 4.00, -2.00),
                Arguments.of(2.00, OperatorEnum.ADD, 2.00, 4.00),
                Arguments.of(2.00, OperatorEnum.DIVIDE, 8.00, 4.00),
                Arguments.of(2.00, OperatorEnum.MODULE, 5.00, 1.00),
                Arguments.of(2.00, OperatorEnum.MULTIPLY, 2.00, 4.00)
            )
        }
    }


    private val calculator = NumericalCalculator()

    @ParameterizedTest
    @MethodSource("operations")
    fun allOperations(number: Double, operator: OperatorEnum, previousResult: Double, expectedResult: Double) {

        val result = calculator.calculate(number, operator, previousResult)
        assertEquals(expectedResult, result)
    }


    @Test
    fun multipleOperationsTest() {

        var result = calculator.calculate(2.00, OperatorEnum.MULTIPLY, 2.00)
        result = calculator.calculate(2.00, OperatorEnum.SUBTRACT, result)
        result = calculator.calculate(2.00, OperatorEnum.DIVIDE, result)
        result = calculator.calculate(2.00, OperatorEnum.ADD, result)
        result = calculator.calculate(2.00, OperatorEnum.MODULE, result)
        assertEquals(1.00, result)
    }

}
