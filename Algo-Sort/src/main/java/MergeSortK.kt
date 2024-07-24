class MergeSortK {

    fun sort(arr: IntArray): IntArray {

        if(arr.size <= 1) return arr

        val middle = arr.size /2
        val left = arr.slice(0 until middle)
        val right = arr.slice(middle until arr.size)

        return merge(sort(left.toIntArray()), sort(right.toIntArray()))
    }

    fun merge(left: IntArray, right: IntArray): IntArray {

        val result = mutableListOf<Int>()
        var leftIdx = 0
        var rightIdx = 0

        while(leftIdx < left.size && rightIdx < right.size) {
            if(left[leftIdx] <= right[rightIdx]) {
                result.add(left[leftIdx++])
            } else {
                result.add(right[rightIdx++])
            }
        }

        while(leftIdx < left.size) {
            result.add(left[leftIdx++])
        }

        while(rightIdx < right.size) {
            result.add(right[rightIdx])
        }

        return result.toIntArray()
    }

}