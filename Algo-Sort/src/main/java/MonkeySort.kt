import java.util.*
import kotlin.collections.HashSet
import kotlin.math.log

class MonkeySort {
    private var arr: Array<Int> = arrayOf()
    var result = arrayOfNulls<Int>(10)
    // 控制数组长度
    private var maxNum: Int = 10;

    constructor(arr: Array<Int>){
        this.arr = arr
    }
    constructor(arr: Array<Int>, maxNum: Int){
        this.arr = arr
        this.maxNum = maxNum
    }
    /**
     * 判断数组是否有序
     * @param arr 需要传入的一个int数组
     * */
    fun checkOrder(arr:Array<Int>): Boolean{
        var i=1
        var len = arr.size
        while(i < len){
            if (arr[i] <= arr[i-1]){
                return false
            }
            i++
        }
        return true
    }
    /**
     * 排序方法,使用随机数进行排序,使用Set验证并确保每次取出不同数值,这样可以更快的得出结构
     * @param num 用于统计执行次数
     * @param random 随机数对象,使用Java.Utils的
     * */
    fun sort(num: Int,random: Random){
        var numberSet:HashSet<Int> = HashSet<Int>()
        //println("当前执行, 第"+ num +"次")

        for (i in 0..<maxNum){
            var idx = random.nextInt(maxNum)
            while (numberSet.contains(idx)){
                idx = random.nextInt(maxNum)
            }
            numberSet.add(idx)
            var number = arr[idx]
            result[i] = number
            // println(result.contentToString())
        }
    }






}