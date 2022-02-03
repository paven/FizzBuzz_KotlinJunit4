/*
Overview
- Look at problem statment
- List Test cases
- Update the order for navigator typist

    - Print numbers from 1 to 100
    - Multiples of 3 should be printed as "Fizz"
    - Multiples of 5 should be printed as "Buzz"
    - Multiples of both 3 & 5 should be printed as "FizzBuzz"


Red - failing test
Green - all test

Refactor - Make it do the same thing but somewhat better.

Tardigrades:
Typist/Navigator/Next/Ensamble
Next - Aravindh
Asokan
Patrik
* Daniel
* Jegan
* Arun

//Ok patrick!
//Webex:https://ford.webex.com/meet/PGUSTA49 <-- sound and video


Kata - https://www.sammancoaching.org/kata_descriptions/fizzbuzz.html
 */

class FizzBuzz {

    fun printLineNumber(number: Int): String {
        return if (15 == number) "FizzBuzz"
        else if (number % 3 == 0) "Fizz"
        else if (number % 5 == 0) "Buzz"
        else number.toString()
    }


}