import java.lang.Exception
import kotlin.system.exitProcess

class NumberInput {

    fun input(): Double {
        println("Enter number")

        val numberInput = readln()
        val saveNumber: Double

        require(numberInput !=""){"End of program"}


        return try {
            saveNumber = numberInput.toDouble()
            saveNumber
        } catch (e: Exception) {
            println("Invalid output")
            input()
        }
    }
}