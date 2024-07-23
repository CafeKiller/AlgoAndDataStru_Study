class InsertSortK {

    fun sort(arr: IntArray) {

        val size = arr.size

        for(i in 1 until size) {
            var temp = arr[i]
            var j = i -1

            while( j >= 0 && arr[j] > temp ) {
                arr[j+1] = arr[j]
                j -= 1
            }
            arr[j + 1] = temp
        }
    }

}