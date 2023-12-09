package solutions

import java.util.*

//Problem Statement
//On a given list of strings, for each string take the first and last number join it together for all the given items finally add the values together and return it
class Day1(private val input: List<String>) {

    private var currentCalculatedValue: Int = 0
    private var currentCalculatedValuePart2: Int = 0

    //Part one solution
    private fun extractFirstAndLastNumbersForPartOne(input: String) {
        //if we don't need only numbers cant we use a regex to filter only numbers?
        val onlyNumbers = input.replace(regex = "\\D+".toRegex(), "")
        currentCalculatedValue += ("${onlyNumbers[0]}${onlyNumbers[onlyNumbers.lastIndex]}").toInt()
    }

    fun partOneResult(): Int {
        input.forEach(::extractFirstAndLastNumbersForPartOne)//calculation
        return currentCalculatedValue
    }

    //PartTwo solution

}