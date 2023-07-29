// 归并排序算法
class MergeSort {

    // 分+合方法
    fun mergeSort(array: IntArray, left: Int, right: Int, tempArr: IntArray){
        if (left < right){
            var mid = (left + right )/2 // 中间索引

            // 向左递归进行分解
            mergeSort(array, left, mid, tempArr)

            // 向右递归进行分解
            mergeSort(array,mid+1, right, tempArr)

            // 合并
            merge(array, left, mid, right, tempArr)
        }
    }


    /**
     *  合并方法
     *  @param arr      需要排序的原始数组
     *  @param left     左边有序序列的初始索引
     *  @param mid      中间索引
     *  @param right    右边索引
     *  @param tempArr  中转使用的数组
     * */
    fun merge(arr: IntArray, left: Int, mid: Int, right: Int, tempArr: IntArray){

        // println("left=$left, right=$right")

        var i: Int = left   // 初始化i. 记录左序列表的初始索引
        var j: Int = mid+1  // 初始化j, 记录右序列表的初始索引
        var t: Int = 0      // 初始化t, 指向tempArr数组的当前索引


        // 先将左右两边有序的数据按照规则填充到temp数组
        // 知道左右两边的有序序列, 有一边处理完成为止
        while (i<= mid && j<= right){ // 继续
            // 若左边的有序序列的当前元素，小于等于右边有序序列的当前元素
            // 即将左边的当前元素，填充到tempArr数组中
            // 然后t++，i++
            if(arr[i] <= arr[j]){
                tempArr[t] = arr[i]
                t += 1
                i += 1
            }else{ // 反之，将右边有序序列的当前元素，填充到tempArr数组。
                tempArr[t] = arr[j]
                t += 1
                j += 1
            }
        }

        // 把有剩余数据的一边的数据依次全部填充到temp数组内
        while (i <= mid){ // 左边的有序序列还有剩余的元素，就全部填充到tempArr数组内
            tempArr[t] = arr[i]
            t += 1
            i += 1
        }
        while (j <= mid){ // 右边的有序序列还有剩余的元素，就全部填充到tempArr数组内
            tempArr[t] = arr[j]
            t += 1
            i += 1
        }

        // 将tempArr数组的元素全部拷贝到Arr数组内
        // 注意，并不是每次都拷贝所有
        t = 0
        var tempLeft: Int = left;
        while(tempLeft <= right){
            arr[tempLeft] = tempArr[t]
            t += 1
            tempLeft += 1
        }


    }


}