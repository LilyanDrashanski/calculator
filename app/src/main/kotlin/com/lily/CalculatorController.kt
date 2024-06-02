package com.lily

import calculator.BinaryCalculator
import calculator.NumericalCalculator
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/calculator")
class CalculatorController {

    @PostMapping("/binary")
    fun binaryCalculator(@RequestBody calculator: BinaryCalculator): String {
        return calculator.calculate()
    }

    @PostMapping("/numerical")
    fun numericalCalculator(@RequestBody calculator: NumericalCalculator): Double {
        val result = calculator.calculate()
        return result
    }
}