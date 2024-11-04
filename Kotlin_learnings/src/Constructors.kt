// Constructor  --> Objects ko default value dene ke liye use hota hai

fun main() {
    val person = Person()
    println(person.name)
    println(person.age)

    val automobile = Automobile("swift", 3, 3,true)
    val automobile2 = Automobile("swift2", 3, 3,false)
}

//Type 1
class empty()           //bekar

//type 2
class Person() {             //we cannot pass default values --> koi argument pass nahi kar saktha
    val name: String = ""
    val age: Int = 0
}

//type 3
class Automobile(var name: String, var tyres: Int, val maxSeating: Int,hasAirBag:Boolean) {

    var AirBag =hasAirBag
    
    fun drive() {}
    fun applyBrakes() {}

}





