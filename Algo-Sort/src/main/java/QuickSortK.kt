class QuickSortK {

    fun quickSort(arr: IntArray, low: Int, high: Int) {
        if(low < high) {
            val pivotIndex = partition(arr, low, high)
            quickSort(arr, low, pivotIndex - 1)
            quickSort(arr, pivotIndex +1, high)
        }
    }

    fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[high]
        var i = low -1

        for (j in low..<high) {
            if(arr[j] < pivot) {
                i++
                swap(arr, i, j)
            }
        }

        swap(arr, i+1, high)
        return i + 1
    }

    fun swap(array: IntArray, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }

}