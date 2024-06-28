fun main(){

    for (i in 1 .. 5){
        for (j in 1 .. 5){
            print(" *")
        }
        println()
    }
    println()

//------------------

    for(i in 1 .. 5){
        for(j in 1 .. i){
            print(" *")
        }
        println()
    }
    println()

//------------

    for (a in 5 downTo 1){
        for (b in 1..a){
            print(" *")
        }
        println()
    }
    println()

//    ---------------


    for (a in 1 .. 5)
    {
        for ( b in 4 downTo a)
        {
            print(" ")
        }
        for (c in 1..a)
        {
            print(" *")
        }
        println()
    }
    println()

//    -------------

    for (a in 5 downTo 1){
        for ( b in 4 downTo a)
        {
            print(" ")
        }
        for (b in 1..a){
            print(" *")
        }
        println()
    }
    println()

//    ----------------------


}






