fun main() {
    printMyName(arrayListOf("vijay","hello"))
}

fun printMessage(count:Int){

    for (i in 1..count){
        println("hello $i")

    }
}

fun printDefault(string: String ="vijay"){
    println("heloo $string")

    val myarray = arrayOf("a", "b", "c")

    val namesList: Array<String> = arrayOf("name", "name2")



}


fun printMyName(array: ArrayList<String>){
    for (i in 0..array.size-1){
        println(array[i])
    }

}