package array

import java.lang.IllegalArgumentException

object LongestCommonPrefix {
    /**
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".

    Example 1:

    Input: ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

     **/
    fun longestCommonPrefix(strs: Array<String>): String {

        val size = strs.size

        if (size == 0) {
            return ""
        }
        var prefix = strs[0]
        if (size > 0) {
            for (i in 1 until size) {
                var index = strs[i]
                prefix = returnPrefix(prefix, index)
                if (prefix.isEmpty()) {
                    break
                }
            }
        }

        return prefix
    }
    /**
    按顺序取第一个字符串的字符。去和字符串数组每个字符串对应位置字符比较。不相等则返回当前字符前一个位置长度

     **/
    fun longestCommonPrefix2(strs: Array<String>?): String {
        if (strs == null || strs.size == 0) return ""
        for (i in 0 until strs[0].length) {
            val c = strs[0][i]
            for (j in 1 until strs.size) {
                if (i == strs[j].length || strs[j][i] != c)
                    return strs[0].substring(0, i)
            }
        }
        return strs[0]
    }
    private fun returnPrefix(a: String, b: String): String {
        var prefix = ""
        if (a.length < b.length) {
            for (i in a.length downTo 0) {
                val now = a.substring(0, i)
                if (b.startsWith(now)) {
                    prefix = now
                    break
                }
            }
        } else {
            for (i in b.length  downTo 0) {
                val now = b.substring(0, i)
                if (a.startsWith(now)) {
                    prefix = now
                    break
                }
            }
        }

        return prefix
    }

}