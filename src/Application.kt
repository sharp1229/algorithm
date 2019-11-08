import solution.RemoveDuplicates

fun main() {
    val solution = Solution()
    val test: IntArray = intArrayOf(0,0,1, 1, 1, 2, 2, 3, 5, 7, 7)
    var time1 = System.currentTimeMillis()
    val result: Int = solution.removeDuplicates1(test)
    val time2 = System.currentTimeMillis();
    println("耗时：" + (time2 - time1))
    println(result)

    val test1: IntArray = intArrayOf(0,0,1, 1, 1, 2, 2, 3, 5, 7, 7)
    val removeDuplicates = RemoveDuplicates()
    val result1 = removeDuplicates.execute(test1)
    println("耗时：" + (System.currentTimeMillis() - time2))
    println(result1)
}

