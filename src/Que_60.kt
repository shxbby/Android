//60. Print factorial value of given number

fun main() {
    println("Enter a number: ")
    val number = readLine()?.toIntOrNull() ?: 1
    var factorial = 1L

    for (i in 1..number) {
        factorial *= i
    }

    println("Factorial of $number is $factorial")
}
