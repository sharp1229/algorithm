package solution

class RemoveDuplicates: Solution  {
    override fun execute(vararg params: Any): Int{
        for (nums in params){
            if (nums is IntArray) {
                if (nums.isEmpty()) return 0
                var j = 0
                for (i in 0 until nums.lastIndex) {
                    if (nums[j] != nums[i]) nums[++j] = nums[i]
                }
                return ++j
            }
        }
        return 0
    }
}