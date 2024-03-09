import kotlin.system.exitProcess

class SignInput {
    fun input(): String {
        val signs = arrayOf("+", "-", "*", "/","%")
        println("Enter sign")
        return when (val sign = readln()) {
            "" -> exitProcess(0)
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