enum class Test {

    ADD {
        override fun calculate(t: Double, u: Double) {
            sum = (t + u)
        }
    },
    MULTIPLY {
        override fun calculate(t: Double, u: Double) {
            sum = t * u
        }
    },
    SUBTRACT {
        override fun calculate(t: Double, u: Double) {
            sum = t - u
        }
    },
    DIVIDE {
        override fun calculate(t: Double, u: Double) {
            sum = (t / u)
        }
    },
    END {
        override fun calculate(t: Double, u: Double) {
            TODO("Not yet implemented")
        }
    };

    abstract fun calculate(t: Double, u: Double)

    companion object {
        var sum = numberInput()
    }

    fun calculator() {
        val x = signInput()

        when (x) {
            ADD -> ADD.calculate(sum, numberInput())
            MULTIPLY -> MULTIPLY.calculate(sum, numberInput())
            SUBTRACT -> SUBTRACT.calculate(sum, numberInput())
            DIVIDE -> DIVIDE.calculate(sum, numberInput())
            END -> TODO()
        }
        println(sum)
    }
}
