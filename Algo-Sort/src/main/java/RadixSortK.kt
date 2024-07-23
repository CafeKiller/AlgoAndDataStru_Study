import java.util.Arrays

// 基数排序算法
// 思想：将所有待比较数值统一为同样的数位长度， 数位较短的数前面补零。 然后， 从最低位开始， 依次进行一次排序。这样从最低位排序一直到最高位排序完成以后, 数列就变成一个有序序列。
class RadixSortK {

    // 基数排序函数
    fun radixSort(array: IntArray) {

        /*
        * array.maxOrNull 方法的作用是返回数组中的最大值，如果数组为空，则返回null。
        *
        * maxOrNull()方法内部会遍历数组中的每个元素，并将其与当前已知的最大值进行比较。
        * 如果当前元素大于已知的最大值，那么就更新最大值。遍历结束后，返回最大值，如果数组为空，则返回null。
        * */

        // 找到数组中的最大值
        var max: Int = Arrays.stream(array).max().orElse(0)
        // 计算以十为底的log（最大值）
        var exp = 1

        // 循环次数等于以十为底的log（最大值）加1
        while (max / exp > 0) {

            val output = Array(10) { IntArray(array.size) }
            for (i in array.indices) {
                val digit = (array[i] / exp) % 10
                output[digit][output[digit].lastIndex - i] = array[i]
            }

            var j = 0
            for (i in output.indices) {
                for (k in output[i].indices) {
                    if (output[i][k] != 0) {
                        array[j++] = output[i][k]
                    }
                }
            }

            exp *= 10
        }

    }

    fun run(arr: IntArray) {
        RadixSortK().radixSort(arr)
        // println(Arrays.toString(arr))
    }


}