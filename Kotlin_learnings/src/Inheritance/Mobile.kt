package Inheritance

// Any -->Mobile -->Oneplus


fun main() {

    val onePlus = OnePlus("Oneplus")
    println(onePlus.name)
    println(onePlus.toString())                         //default -->Give objectname
    println()
}

open class Mobile(val type :String){
    open val name:String ="Mobile"
    val size:Int =6

    fun makeCall() = println("Call in from mobile")
    fun powerOff()= println("Power off in Mobile ")
    open fun Display() = println("Mobile Display")

}

class OnePlus(typeParam: String) : Mobile(typeParam) {  //Parent constructor pass karna compulsory hai
    override val name: String ="Oneplus Mobile"

    override fun Display() {
        super.Display()                               //Super Keyword -->kuch bhi call karna hai parent se (variable ,func..)
        println("Oneplus display ")

    }

    override fun toString(): String {
        return "$name and - $size"
    }

}


