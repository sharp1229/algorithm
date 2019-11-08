package solution

interface Solution {
    fun <T> execture(vararg params: T): T
}