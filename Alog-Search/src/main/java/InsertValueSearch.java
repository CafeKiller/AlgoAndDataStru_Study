
// 插值查找算法
public class InsertValueSearch {

    /**
     * @param arr 需要查找的数组
     * @param left 左边的索引
     * @param right 右边的索引
     * @param findValue 要查找的值
     * @return 查找成功则返回数组对应下标, 查找失败则返回-1
     * */
    public int insertValueSearch(int[] arr, int left, int right, int findValue){

        // War：findValue< arr[0] 和 findValue> arr[arr.length-1] 是必须要的
        // 防止出现越界异常
        if(left >right || findValue < arr[0] || findValue > arr[arr.length-1]){
            return -1;
        }

        // 求mid
        int mid = left + (right - left) * (findValue - arr[left]) / (arr[right] - arr[left]);
        int midValue = arr[mid];

        if (findValue > midValue){
            return insertValueSearch(arr, mid+1, right, findValue);
        } else if (findValue < midValue) {
            return insertValueSearch(arr, left, mid-1, findValue);
        }else {
            return mid;
        }
    }


}
