fun main() {
    val solution = Solution()
    val test: IntArray = intArrayOf(0,0,1, 1, 1, 2, 2, 3, 5, 7, 7)
    var time1 = System.currentTimeMillis()
    val result: Int = solution.removeDuplicates1(test)
    println("耗时：" + (System.currentTimeMillis() - time1))
    println(result)
}

