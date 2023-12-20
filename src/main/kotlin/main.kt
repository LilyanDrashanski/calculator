import java.lang.Exception
import kotlin.system.exitProcess

fun main() {

    println("To exit press Enter")

    while (true) {
        Calculator.ADD.calculator()
    }
}


fun numberInput(): Double {
    println("Enter number")

    val numberInput = readln()
    val saveNumber: Double

    return try {
        saveNumber = numberInput.toDouble()
        saveNumber
    } catch (e: Exception) {
        println("Invalid output")
        numberInput()
    }
}

fun signInput(): String {
    val signs = listOf("+", "-", "*", "/")
    println("Enter sign")
    val sign = readln()

    if (sign == "") exitProcess(0)

    return if (sign in signs) {
        sign
    } else {
        println("Invalid input")
        signInput()
    }
}
