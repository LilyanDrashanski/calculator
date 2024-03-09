import java.lang.Exception
import kotlin.system.exitProcess

class NumberInput {

    fun input(): Double {
        println("Enter number")

        val numberInput = readln()
        val saveNumber: Double

        if (numberInput == ""){
            exitProcess(0)
        }

        return try {
            saveNumber = numberInput.toDouble()
            saveNumber
        } catch (e: Exception) {
            println("Invalid output")
            input()
        }
    }
}