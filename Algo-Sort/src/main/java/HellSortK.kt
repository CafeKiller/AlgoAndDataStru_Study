class HellSortK {

    fun sort(arr: IntArray): IntArray {

        val size = arr.size
        var gap = size / 2

        while (gap > 0) {
            for(i in gap until size) {
                var j = i
                while(j >= gap && arr[j - gap] > arr[j]) {
                    val temp = arr[j - gap]
                    arr[j - gap] = arr[j]
                    arr[j] = temp
                    j -= gap
                }
            }

            gap /= 2
        }

        return arr

    }

}