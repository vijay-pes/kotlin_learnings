fun main() {
    val calculator = Calculator()   // If we do not specify a Constructor(anyone primary ,secondary ,properties )
    // -->Kotlin will put default Constructors
    val add = calculator.add(10, 20)
    val multiply = calculator.multiply(10, 20)
    print(add)
    println(multiply)

}

class Calculator {

    lateinit var message: String
    //lateinit cannot be int , boolean , ...

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}


