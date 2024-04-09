import kotlin.math.sign
import kotlin.system.exitProcess

class SignInput {
    fun input(): String {
        val signs = arrayOf("+", "-", "*", "/","%")
        println("Enter sign")

        val sign = readln()

        require(sign != ""){"End of program"}


        return when (sign) {
            in signs -> {
                sign
            }
            else -> {
                println("Invalid input")
                input()
            }
        }
    }
}