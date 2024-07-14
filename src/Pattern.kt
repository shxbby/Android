//Pattern 1

fun main() {
    for (i in 1..5) {
        for (j in 1..5) {
            print("$j ")
        }
        println()
    }
    println()


//Pattern 2

    for (i in 1..5) {
        for (j in 1..5) {
            print("$i ")
        }
        println()
    }
println()

//Pattern 3

    for (i in 1..5) {
        for (j in 1..5) {
            print("${i * j} ")
        }
        println()
    }
    println()


//Pattern 4

    for (i in 'A'..'E') {
        for (j in 1..5) {
            print("$i")
        }
        println()
    }
    println()



//Pattern 5

    for (i in 1..5) {
        for (j in 1..5) {
            if (j <= i) {
                print("\$")
            } else {
                print("$j")
            }
        }
        println()
    }
    println()


//Pattern 6

    for (i in 1..5) {
        for (j in 1..5) {
            if (j <= i) {
                print(i)
            } else {
                print("$")
            }
        }
        println()
    }
    println()


//Pattern 7

    for (i in 1..5) {
        for (j in 0 until 5) {
            if (j < i) {
                print("X")
            } else {
                print("0")
            }
        }
        println()
    }
    println()


//Pattern 8

    for (i in 1..5) {
        for (j in 1..5) {
            if (j == 1 || j == 5 || i == j) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    println()


//Pattern 9

    for (i in 1..5) {
        for (j in 1..i) {
            print("$i")
        }
        println()
    }
    println()


//Pattern 10

    for (i in 1..5) {
        for (j in 1..i) {
            print(j)
        }
        println()
    }
    println()


//Pattern 11

    for (i in 5 downTo 1) {
        for (j in 5 downTo i) {
            print(j)
        }
        println()
    }
    println()



//Pattern 12

    for (i in 1..5) {
        for (j in 1..i) {
            print(j)
        }
        println()
    }
    println()


//Pattern 13

    var num = 1
    for (i in 1..4) {
        for (j in 1..i) {
            print("$num ")
            num++
        }
        println()
    }
    println()


//Pattern 14

    for (i in 1..5) {
        for (j in 0 until i) {
            print(if (j % 2 == 0) 1 else 0)
        }
        println()
    }
    println()


//Pattern 15

    var ch = 'A'
    for (i in 1..5) {
        for (j in 1..i) {
            print(ch++)
        }
        println()
    }
    println()


//Pattern 16

    for (i in 1..5) {
        for (j in 1..5) {
            if (i == j || j == 1 || j == 5) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    println()
    
}