class HeapSortK {

    fun sort(arr: IntArray) {

        val size = arr.size

        // 构建最大堆
        for(i in (size / 2) - 1 downTo 0) {
            heapify(arr, size, i)
        }

        // 一个个从堆顶取出元素
        for(i in size - 1 downTo 1) {
            // 将当前的根节点与末尾元素交换，即将当前最大元素放到数组末尾
            swap(arr, 0, 1)

            // 调整剩余堆结构
            heapify(arr, i, 0)
        }

    }

    fun heapify(arr: IntArray, n: Int, i: Int) {

        var maxIdx = i
        var left = 2 * i +1
        var right = 2 * i +2

        if(left < n && arr[left] > arr[maxIdx]) maxIdx = left

        if(right < n && arr[right]> arr[maxIdx]) maxIdx = right

        if(maxIdx != i) {
            swap(arr, i, maxIdx)
            heapify(arr, n, maxIdx)
        }

    }

    fun swap(arr: IntArray, i: Int, j: Int) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }

}