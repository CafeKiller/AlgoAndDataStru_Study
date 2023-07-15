import kotlin.random.Random

class MonkeySort {

    private var arr: Array<Int> = arrayOf()
    private var result = arrayOfNulls<Int>(10)

    constructor(arr: Array<Int>){
        this.arr = arr
    }

    /**
     * 判断数组是否有序
     * @param arr 需要传入的一个int数组
     * */
    private fun checkOrder(arr:Array<Int>): Boolean{
        for (i in arr.indices) {
            if (arr[i] <= arr[i-1]){
                return false
            }
        }
        return true
    }

    private fun sort(num: Int,random: Random){
        var numberSet:Set<Int> = HashSet<Int>()
        println("第"+ num +"次")

        for (i in 0..9){
            var idx = random.nextInt(10)
            while (numberSet.contains(idx)){
                idx = random.nextInt(10)
            }
            numberSet.plus(idx)
            var number = arr[idx]
            result[i] = number
            print(" " + result[i])
        }
        println()
    }






}