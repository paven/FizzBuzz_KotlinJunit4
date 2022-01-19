import org.junit.Test
import kotlin.test.assertEquals


/*
  - Peter
  - Alagu
 Typist - Scott
 Navigator - Michael
 Uryel
 Srinivas
 Patrik

 Print 1 as 1
 Print 3 as Fizz
 Print 4 as 4
 Print 5 as Buzz

Overiview
red
Green
Refactor
 */
internal class FizzBuzzTest {
    @Test
    fun printOneAsOne(){
        assertEquals("1", FizzBuzz().returnNumber(1))
    }

    @Test
    fun print3AsFizz(){
        assertEquals("Fizz", FizzBuzz().returnNumber(3))
    }
}