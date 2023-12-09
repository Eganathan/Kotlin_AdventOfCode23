import solutions.Day1

fun main() {
//    fun part1(input: List<String>): Int {
//        return Day1(input).partOneResult()
//    }

    fun part2(input: List<String>): Int {
        return Day1(input).part2Result()
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("day1_test")
//    check(part1(testInput) == 1)

    val input = readInput("day_1")
//    val input = readInput("singletextcase")
//    part1(input).println()
    part2(input).println()
}
