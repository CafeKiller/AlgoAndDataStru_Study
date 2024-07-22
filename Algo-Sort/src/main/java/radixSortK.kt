import kotlin.math.log10

// 基数排序算法
// 思想：将所有待比较数值统一为同样的数位长度， 数位较短的数前面补零。 然后， 从最低位开始， 依次进行一次排序。这样从最低位排序一直到最高位排序完成以后, 数列就变成一个有序序列。
class radixSortK {

    // 基数排序函数
    fun radixSort(array: IntArray) {

        /*
        * array.maxOrNull 方法的作用是返回数组中的最大值，如果数组为空，则返回null。
        *
        * maxOrNull()方法内部会遍历数组中的每个元素，并将其与当前已知的最大值进行比较。
        * 如果当前元素大于已知的最大值，那么就更新最大值。遍历结束后，返回最大值，如果数组为空，则返回null。
        * */

        // 找到数组中的最大值
        var max: Int = array.maxOrNull()!!
        // 计算以十为底的log（最大值）
        var exp = log10(max.toDouble()).toInt() +1

        // 循环次数等于以十为底的log（最大值）加1
        repeat(exp) {
            // 定义一个长度为10的数组，用于存放排序后的数组
            val output = Array(10) { IntArray(array.size) }
            // 定义当前的基数
            val index = it + 1

            // 将数组中的每个元素按照当前的基数进行划分，存放到对应的数组中
            for (i in array.indices) {
                val digit = (array[i] / index) % 10
                output[digit][output[digit].lastIndex - i] = array[i]
            }

            // 将排序后的数组复制到原始数组中
            System.arraycopy(output, 0, array, 0, array.size)
        }

    }

    fun run(arr: IntArray) {
        radixSort(arr)
    }


}