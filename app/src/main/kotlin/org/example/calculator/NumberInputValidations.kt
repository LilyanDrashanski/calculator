package org.example.calculator

class NumberInputValidations {

    fun input(numberInput: String): Double {

        require(numberInput!=""){"End of program"}
        require(numberInput.toDoubleOrNull() is Double){"Invalid input. Please enter a number"}

        return numberInput.toDouble()

    }
}