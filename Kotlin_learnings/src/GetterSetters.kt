fun main() {
    val person2 = Person2("vijay",10)
    person2.name
    person2.age         //getters

    person2.name ="unknown person"  //setters
    person2.age=-100

    println(person2.name)
}


class Person2(nameParam:String,ageParam:Int) {
    var name = nameParam
        get() {
            return field.toUpperCase()
        }
    var age = ageParam
        set(value) {
            if (value > 18)
                field = value
            else
                println("age is negative ")
        }

    //Agar Property ko -->getter setter nahi likha hai toh ,Kotlin uses default GS
    var email: String = ""
        get() = field        //default GS
        set(value) {
            field = value
        }
}