package Inheritance

import Inheritance.Child
import Inheritance.Child as Child1

fun main() {
    val parent = Parent()
    println( parent.myMethod())

    val child = Child()
    println(child.myMethod2())
}
open class Parent{
    val name:String =""

    fun myMethod(){
        println("i am in the main method ")
    }


}
//Child can never exist without parent
//parent Contructors is called first -->child Constructor


class Child :Parent()       //only one parent class

{
    val name2 :String =""

    fun myMethod2(){
        println("i am in child ")
    }
}