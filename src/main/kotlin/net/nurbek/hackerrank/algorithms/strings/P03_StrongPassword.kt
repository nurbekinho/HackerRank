package net.nurbek.hackerrank.algorithms.strings

fun main()
{
    println(minimumNumber(11, "#HackerRank"))
    println(minimumNumber(4, "4700"))
    println(minimumNumber(3, "Ab1"))
    println(minimumNumber(4, "goxg"))
    println(minimumNumber(4, "IGEC"))
    println(minimumNumber(5, "55542"))
}

fun minimumNumber(n:Int, password:String):Int
{
    var numbers = "0123456789"
    var lower_case = "abcdefghijklmnopqrstuvwxyz"
    var upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var special_characters = "!@#$%^&*()-+"

    var count = 0

    for (c in password)
    {
        if (numbers.indexOf(c) >= 0)
        {
            count++
            numbers = ""
        }
        else if (lower_case.indexOf(c) >= 0)
        {
            count++
            lower_case = ""
        }
        else if (upper_case.indexOf(c) >= 0)
        {
            count++
            upper_case = ""
        }
        else if (special_characters.indexOf(c) >= 0)
        {
            count++
            special_characters = ""
        }
    }

    return if (n > 6 || n + 4 - count > 6) 4 - count else 6 - n
}