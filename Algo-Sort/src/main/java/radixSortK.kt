
// 基数排序算法
// 思想：将所有待比较数值统一为同样的数位长度， 数位较短的数前面补零。 然后， 从最低位开始， 依次进行一次排序。这样从最低位排序一直到最高位排序完成以后, 数列就变成一个有序序列。
class radixSortK {

    fun radixSort(array: IntArray){

        var max: Int = array[0]

        var i1:Int = 1
        while (i1 < array.size){
            if (array[i1] > max){
                max = array[i1]
            }
            i1++
        }

        var maxLength: Int = max.toString().length

        var bucket:Array<IntArray> = Array<IntArray>(size = 10, init = {IntArray(array.size)})

        var bucketElementCount: IntArray = intArrayOf(10)

        /*var i2: Int = 1
        var n:Int = 1
        while (i2 < maxLength){
            for (){

            }

        }*/


    }


}