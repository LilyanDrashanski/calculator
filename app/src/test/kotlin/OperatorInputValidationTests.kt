package calculator

import calculator.OperatorEnum
import calculator.OperatorInputValidations
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource


class OperatorInputValidationTests {

    private val operatorValidator = OperatorInputValidations()

    companion object {
        @JvmStatic
        fun operatorValidationSuccess(): List<Arguments> {
            return listOf(
                Arguments.of("-", OperatorEnum.SUBTRACT),
                Arguments.of("+", OperatorEnum.ADD),
                Arguments.of("/", OperatorEnum.DIVIDE),
                Arguments.of("%", OperatorEnum.MODULE),
                Arguments.of("*", OperatorEnum.MULTIPLY)
            )
        }

        @JvmStatic
        fun operatorValidationFails(): List<Arguments> {
            return listOf(
                Arguments.of("2"),
                Arguments.of("`"),
                Arguments.of("="),
                Arguments.of("543"),
                Arguments.of("x")
            )
        }

    }

    @ParameterizedTest
    @MethodSource("operatorValidationSuccess")
    fun operatorValidationSuccess(operatorInput: String, expectedResult: OperatorEnum) {

        val result = operatorValidator.input(operatorInput)
        Assertions.assertEquals(expectedResult, result)
    }

    @ParameterizedTest
    @MethodSource("operatorValidationFails")
    fun operatorValidationFail(operatorInput: String) {
        val exception: Exception = Assertions.assertThrows(IllegalArgumentException::class.java) {
            operatorValidator.input(operatorInput)
        }
        Assertions.assertEquals(exception.message, ("Invalid input. Please enter an operator"))
    }


}