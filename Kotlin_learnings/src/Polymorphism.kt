import kotlin.math.PI

fun main() {

    // parent can holds refrence to it's child class ,
    //parent can call methods of it's child classes -->
    // Below are objects of shape , Par shape knows ->circle or square

    // Jaha parentclass ka object chahiye waha -->object class ka pass kar sakthe hai
    // below :  Type - Shape required tha -->but we can give all it's child object(circle,...)
    //Vice versa is not possible  Child object needed -->passed parent passed

    val circle:Shape = Circle(4.0)
    val square:Shape = Square(4.0)

    val shapes = arrayOf(Circle(3.0), Circle(4.0), Square(4.0),
        Triangle(3.0,2.0))
    calArea(shapes)
}

//Only 1 CalArea -->we can keep adding any number of Classes which overide (loose coupling )
// Multiple forms --Based on the object type -->form decide hoga

fun calArea(shapes:Array<Shape>) {
    for (shape in shapes) {
        println( shape.area())
    }

}



open class Shape(){
    open fun area(): Double{
        return 0.0
    }
}

class Circle(val radius:Double) : Shape(){
    override fun area(): Double{
        return PI*2*radius
    }
}

class Square(val side:Double) : Shape(){
    override fun area(): Double{
        return side * side
    }
}

class Triangle(val base:Double ,val height:Double) : Shape(){
    override fun area(): Double{
        return base * height *0.5
    }
}


