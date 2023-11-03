import java.lang.Exception
import kotlin.system.exitProcess

fun main() {

    println("To exit press Enter")

    while (true) {
        Test.ADD.calculator()
    }
}


fun numberInput(): Double {
    println("Enter number")

    val numberInput = readln()
    val saveNumber: Double

    if (numberInput == "") exitProcess(0)

    return try {
        saveNumber = numberInput.toDouble()
        saveNumber
    } catch (e: Exception) {
        println("Invalid output")
        numberInput()
    }
}

fun signInput(): Test {
    println("Enter sign")
    val sign: String = readln()

    return when (sign) {
        "+" -> Test.ADD
        "-" -> Test.SUBTRACT
        "*" -> Test.MULTIPLY
        "/" -> Test.DIVIDE
        "" -> Test.END
        else -> {
            println("Invalid input")
            signInput()
        }
    }
}
