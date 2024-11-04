fun main() {

    var count:Int =1
    while (count<=5) {
        print(count)
        count++
    }

    // do while -->executes atleast once
    var i =5
    do {
        print("hello 1")
        i++
    }while (i<5)


    //For loop
    for (i in 1..5){
        print(i)
    }

    for (i in 1 until 3){
        print(i)

    }
    for (i in 5 downTo 1){
        print(i)

    }
    val list = listOf("a","b","c")
     for (i in list){
         print(i)
     }

}