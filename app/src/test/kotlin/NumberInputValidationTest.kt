package calculator

import calculator.NumberInputValidations
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource


class NumberInputValidationTest {

    private val numberValidator = NumberInputValidations()

    companion object {
        @JvmStatic
        fun numberValidationSuccess(): List<Arguments> {
            return listOf(
                Arguments.of("2", 2.00),
                Arguments.of("2.00", 2.00),
                Arguments.of("-2.00", -2.00),
                Arguments.of("0", 0),
            )
        }


        @JvmStatic
        fun numberValidationFail(): List<Arguments> {
            return listOf(
                Arguments.of("s"),
                Arguments.of("43w"),
                Arguments.of("`"),
                Arguments.of("o"),
            )
        }

    }

    @ParameterizedTest
    @MethodSource("numberValidationSuccess")
    fun numberValidatorTestSuccess(numberInput: String, expectedResult: Double) {
        val result = numberValidator.input(numberInput)
        Assertions.assertEquals(expectedResult, result)
    }

    @ParameterizedTest
    @MethodSource("numberValidationFail")
    fun numberValidatorTestFail(numberInput: String) {
        val exception: Exception = Assertions.assertThrows(IllegalArgumentException::class.java) {
            numberValidator.input(numberInput)
        }
        Assertions.assertEquals(exception.message, ("Invalid input. Please enter a number"))
    }

}