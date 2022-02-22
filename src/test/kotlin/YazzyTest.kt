import org.junit.Test
import kotlin.test.assertEquals

/*
https://sammancoaching.org/kata_descriptions/yatzy.html

 - Uryel
Next - Patrik
 - Scott
 - Alex

- Chance
 * 1,1,3,3,6 = 14
 * 4,5,5,6,1 = 21

- Yatzy
 * 1,1,1,1,1 = 50
 * 1,1,1,2,1 = 0

 - Ones
* 1,1,2,3,4 = 2
* 1,1,1,2,4 = 3

- Twos
* 1,2,2,3,4 = 4

- Threes
* 1,2,3,3,4 = 6

- Fours
* 1,2,3,4,4 = 8

- Fives
* 2,5,4,5,5 = 15

- Sixes
* 6,6,6,6,5 = 24

- PlayGame ?
* 6,6,6,6,5,
 */

class YazzyTest {

    @Test
    fun chance14() {
        assertEquals(14, Yazzy().chance(listOf(1,1,3,3,6)))
    }
    @Test
    fun chance21() {
        assertEquals(21, Yazzy().chance(listOf(4,5,5,6,1)))
    }

    @Test
    fun yatzy50() {
        assertEquals(50, Yazzy().yatzy(listOf(1,1,1,1,1)))
    }

    @Test
    fun yatzy0() {
        assertEquals(0, Yazzy().yatzy(listOf(1,1,1,2,1)))
    }

    @Test
    fun ones2() {
        assertEquals(2, Yazzy().ones(listOf(1,1,2,3,4)))
    }

    @Test
    fun ones3() {
        assertEquals(3, Yazzy().ones(listOf(1,1,1,2,4)))
    }
}
