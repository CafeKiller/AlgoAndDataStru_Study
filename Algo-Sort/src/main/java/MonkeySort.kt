class MonkeySort {

    var arr = arrayOfNulls<Int>(10)
    var result = arrayOfNulls<Int>(10)

    /**
     * 判断数组是否有序
     * @param arr 需要传入的一个int数组
     * */
    fun checkOrder(arr:IntArray): Boolean{
        for (i in arr.indices) {
            if (arr[i] <= arr[i-1]){
                return false
            }
        }
        return true
    }




}