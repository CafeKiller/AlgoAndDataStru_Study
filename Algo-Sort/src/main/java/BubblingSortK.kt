class BubblingSortK {

    // val 常量， 类似js中的 const
    // var 变量， 类似js中的 let

    fun sort(arr: Array<Int>) {
        val size = arr.size

        for (i in 0 until size -1) {
            for (j in 0 until  size - i -1) {
                if (arr[j] > arr[j +1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j +1] = temp
                }
            }
        }
    }

}