//62. Print prime number between given range

fun main() {
    println("Enter the start of the range: ")
    val start = readLine()?.toIntOrNull() ?: 1
    println("Enter the end of the range: ")
    val end = readLine()?.toIntOrNull() ?: 10

    for (number in start..end) {
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
            print("$number ")
        }
    }
}