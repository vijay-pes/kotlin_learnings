fun main() {
    val phone:Phone=Phone()
    phone.name ="Vijay "
    phone.price=1000
    println(phone.call())
    phone.calc(10,20)

}
class Phone{
    var name:String=""
    val type:String=""
    var price:Int=0

    fun call(): String {
        return "calling from phone !"

    }
    fun calc(a: Int,b:Int):Int{
        return a+b
    }
}

