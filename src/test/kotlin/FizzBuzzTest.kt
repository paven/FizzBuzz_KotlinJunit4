import org.junit.Before
import org.junit.Test
import kotlin.test.assertTrue

internal class FizzBuzzTest {

    private lateinit var subject: FizzBuzz

    @Before
    fun setUp() {
        subject = FizzBuzz()
    }

    @Test
    fun printNumbersFrom1to100() {
        assertTrue(subject.printNumbers(100))
    }
}