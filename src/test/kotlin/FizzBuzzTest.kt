import org.junit.Test
import kotlin.test.assertEquals


/*
  Peter
  Alex
  Next - Scott
  Alagu
  Uryel
  Srinivas
  Patrik

 * Print 1 as 1
 * Print 3 as Fizz
 * Print 4 as 4
 * Print 5 as Buzz
 * Print 6 as Fizz
 * Print 15 as FizzBuzz
 * Print 20 as Buzz
 * Print 45 as FizzBuzz

 Print function returns 100 lines
 The first line is correct

Overview
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
    fun print4As4(){
        assertEquals("4", FizzBuzz().returnNumber(4))
    }

    @Test
    fun print3AsFizz(){
        assertEquals("Fizz", FizzBuzz().returnNumber(3))
    }

    @Test
    fun print5AsBuzz(){
        assertEquals("Buzz", FizzBuzz().returnNumber(5))
    }

    @Test
    fun print15AsFizzBuzz(){
        assertEquals("FizzBuzz", FizzBuzz().returnNumber(15))
    }

    @Test
    fun print20AsBuzz(){
        assertEquals("Buzz", FizzBuzz().returnNumber(20))
    }

    @Test
    fun print45AsFizzBuzz(){
        assertEquals("FizzBuzz", FizzBuzz().returnNumber(45))
    }
}