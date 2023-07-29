// 二分查找算法
public class BinarySearch {

    /**
     * @param arr 需要查找的数组
     * @param left 左边的索引
     * @param right 右边的索引
     * @param findValue 要查找的值
     * @return 查找成功则返回数组对应下标, 查找失败则返回-1
     * */
    public int binarySearch(int[] arr, int left, int right, int findValue){

        // 当left > right时, 说明递归整个数组, 但没有找到对应的数值
        if(left>right) {
            return -1;
        }

        // 获取数组的中间数
        int mid = (left + right) / 2;
        int midValue = arr[mid];

        if (findValue > midValue){ // 向右递归
            return binarySearch(arr,mid+1, right,findValue);
        }else if (findValue < midValue){ // 向左递归
            return binarySearch(arr, left,mid-1, findValue);
        }else{ // 如果都没有,则表示中间值就是要查找的数值
            return mid;
        }


    }


}
