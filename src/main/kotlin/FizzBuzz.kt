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

Typist/Navigator/Next/Ensamble
Next - Asokan
Patrik
Aravindh
* Daniel
* Jegan
Arun

//Ok patrick!
//Webex:https://ford.webex.com/meet/PGUSTA49 <-- sound and video


Kata - https://www.sammancoaching.org/kata_descriptions/fizzbuzz.html
 */

class FizzBuzz {

    fun printLineNumber(number: Int): String {
        return if (3 == number) "Fizz"
        else number.toString()
    }


}