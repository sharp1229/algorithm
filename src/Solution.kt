class Solution {
    //[26]删除排序数组中的重复项
    // 给定 nums = [0,0,1,1,1,2,2,3,3,4],
    //
    //函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
    //
    //你不需要考虑数组中超出新长度后面的元素。
    //
    //
    // 说明:
    //
    // 为什么返回数值是整数，但输出的答案是数组呢?
    //
    // 请注意，输入数组是以“引用”方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
    //
    // 你可以想象内部操作如下:
    //
    // // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
    //int len = removeDuplicates(nums);
    //
    //// 在函数里修改输入数组对于调用者是可见的。
    //// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
    //for (int i = 0; i < len; i++) {
    //    print(nums[i]);
    //}
    //
    // Related Topics 数组 双指针

    //leetcode submit region begin(Prohibit modification and deletion)
    fun removeDuplicates(nums: IntArray): Int {
        var cache = 0
        var count = 0
        if (nums?.size > 1) {
            for ((index, item) in nums.withIndex()) {
                if (index == 0) {
                    cache = item
                    count++
                } else if (cache != item) {
                    cache = item
                    nums[count] = item
                    count++
                    //println("当前数组下标：$index, 数组项：$item");
                }
            }
            //nums.forEach { println(it) }
            return count
        }
        return nums.size
    }

    fun removeDuplicates1(nums: IntArray): Int{
        if (nums.isEmpty()) return 0
        var j = 0
        for (i in 0 until nums.lastIndex){
            if (nums[j] != nums[i]) nums[++j] = nums[i]
        }
        return ++j
    }
    //leetcode submit region end(Prohibit modification and deletion)
}