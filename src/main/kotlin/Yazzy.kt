class Yazzy {
    fun chance(i: List<Int>): Int {
        return i.sum()
    }

    fun yatzy(i: List<Int>) = if (i.distinct().size == 1) 50 else 0

    fun ones(i: List<Int>) = i.filter { it == 1 }.sum()
}



/*
class YazzyImpl(calc: Yazzy) {

    fun playGame(game: Game, roll: List<Int>): Int {
    }
}

enum class Game {
    ONES, TWOS
}*/