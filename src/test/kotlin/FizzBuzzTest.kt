import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/*
1-> 1
3 -> Fizz
4-> 4
*/
internal class FizzBuzzTest {

    private lateinit var subject: FizzBuzz

    @Before
    fun setUp() {
        subject = FizzBuzz()
    }


    @Test
    fun oneBecomes1() {
        assertEquals("1",subject.printLineNumber(1))
    }

    @Test
    fun threeBecomesFizz() {
        assertEquals("Fizz",subject.printLineNumber(3))
    }

    @Test
    fun fourBecomes4() {
        assertEquals("4",subject.printLineNumber(4))
    }
}