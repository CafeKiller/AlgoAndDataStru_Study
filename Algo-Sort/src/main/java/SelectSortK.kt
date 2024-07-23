class SelectSortK {

    fun sort(arr: IntArray) {

        val size = arr.size

        for (i in 0 until size -1) {

            var minIdx = i

            for (j in i + 1 until size) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j
                }
            }

            if(minIdx != i) {
                val temp = arr[i]
                arr[i] = arr[minIdx]
                arr[minIdx] = temp
            }
        }

    }

}