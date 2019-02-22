import array.LongestCommonPrefix
import array.TwoSum

fun main(args: Array<String>) {
//    print(TwoSum.twoSum(intArrayOf(3,2, 4), 6).toPrint())
    val start = System.currentTimeMillis()

    print(LongestCommonPrefix.longestCommonPrefix2(arrayOf<String>("flower","flow","flight")).toPrint())
//    print(LongestCommonPrefix.longestCommonPrefix(arrayOf<String>("flower","flow","flight")).toPrint())
    val end = System.currentTimeMillis()

    print("\n" + (end - start))
}

fun IntArray.toPrint(): String {
    if (this.isEmpty()) {

    }
    val str = this.map { it.toString() }.reduce { acc, s -> acc + "," + s }

    return "[${str}]"
}

fun String.toPrint(): String {
    return "\"${this}\""
}