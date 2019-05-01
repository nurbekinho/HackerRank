package net.nurbek.hackerrank.algorithms.strings

fun main()
{
    println(reduce("aaabccddd").equals("abd"))
}

fun reduce(s:String):String
{
    var i = 0
    var s = s
    while (i < s.length - 1)
    {
        if (s[i] == s[i + 1])
        {
            if (s.length <= 2) return "Empty String"
            else s = s.substring(0, i) + s.substring(i + 2)

            if (i > 0) i--
        }
        else
            i++
    }

    return if (s.isEmpty()) "Empty String" else s
}