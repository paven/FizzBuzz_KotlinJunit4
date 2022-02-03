import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/*
1-> 1
3->Fizz
4-> 4
5 -> Buzz
6 -> Fizz
15 -> FizzBuzz
*/
internal class FizzBuzzTest {

    private lateinit var subject: FizzBuzz

    @Before
    fun setUp() {
        subject = FizzBuzz()
    }


    @Test
    fun oneBecomes1() {
        assertEquals("1", subject.printLineNumber(1))
    }

    @Test
    fun threeBecomesFizz() {
        assertEquals("Fizz", subject.printLineNumber(3))
    }

    @Test
    fun fourBecomes4() {
        assertEquals("4", subject.printLineNumber(4))
    }

    @Test
    fun fiveBecomesBuzz() {
        assertEquals("Buzz", subject.printLineNumber(5))
    }

    @Test
    fun sixBecomesFizz() {
        assertEquals("Fizz", subject.printLineNumber(6))
    }

    @Test
    fun fifteenBecomesFizzBuzz() {
        assertEquals("FizzBuzz", subject.printLineNumber(15))
    }

    @Test
    fun tenBecomesBuzz() {
        assertEquals("Buzz", subject.printLineNumber(10))
    }

    @Test
    fun multiplesOf3BecomesFizz() {
        assertEquals("Fizz", subject.printLineNumber(9))
        assertEquals("Fizz", subject.printLineNumber(12))
        assertEquals("Fizz", subject.printLineNumber(18))

    }

    /* @Test
        fun multiplesBecomesBuzz() {
            assertEquals("Buzz",subject.printLineNumber(10))
        }*/
}