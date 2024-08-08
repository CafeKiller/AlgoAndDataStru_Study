// 斐波那契(黄金分割法)查找算法
class FibonacciSearch {
    fun search(arr: IntArray, target: Int) : Int {
        if (arr.isEmpty()) return -1

        val n = arr.size
        val fibNums = calculateFibNumbers(n)

        var left = 0
        var right = arr.lastIndex

        while (left <= right) {
            val mid = left + (right - left) / 2

            if (arr[mid] == target) {
                return mid
            }

            if (arr[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return binarySearch(arr, target, fibNums)
    }

    private fun calculateFibNumbers(n: Int): List<Int> {
        val fibNums = mutableListOf<Int>()
        var a = 0
        var b = 1

        for (i in 0 until n) {
            fibNums.add(a)
            val temp = a + b
            a = b
            b = temp
        }

        return fibNums
    }

    private fun binarySearch(arr: IntArray, target: Int, fibNums: List<Int>): Int {
        var left = 0
        var right = arr.lastIndex

        while (left <= right) {
            val mid = left + (right - left) / 2

            if (arr[mid] == target) {
                return mid
            }

            if (arr[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return -1
    }

}