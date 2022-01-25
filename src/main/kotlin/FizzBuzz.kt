class FizzBuzz {

    fun returnNumber(number: Int): String =
        when {
            (number % 15 == 0) -> "FizzBuzz"
            (number % 5 == 0) -> "Buzz"
            (number % 3 == 0) -> "Fizz"
            else -> number.toString()
        }
}