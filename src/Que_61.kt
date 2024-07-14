//61. Check whether the number is prime or not

fun main() {
    println("Enter a number: ")
    val number = readLine()?.toIntOrNull() ?: 1
    var isPrime = true

    if (number <= 1) {
        isPrime = false
    } else {
        for (i in 2..number / 2) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
    }

    if (isPrime) {
        println("$number is a prime number")
    } else {
        println("$number is not a prime number")
    }
}
