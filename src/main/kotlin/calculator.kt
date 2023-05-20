fun main() {
    var counter = 0
    var input: InputClass = Calculate(readln())
    while (input.input != "") {
        input.inputIsValid()
        input.operatorOrNumber()
        counter++
        input.calculate(counter)
        input = InputClass(readln())
    }
}