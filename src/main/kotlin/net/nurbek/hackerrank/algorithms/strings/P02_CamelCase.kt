package net.nurbek.hackerrank.algorithms.strings

fun main()
{
    println(camelcase("saveChangesInTheEditor"))
}

fun camelcase(s:String):Int
{
    var count = 1
    var i = 1
    while (i < s.length)
    {
        if (s[i].isUpperCase()) count++

        i++
    }

    return count
}