// 线性查找算法
public class SeqSearch {

    /**
     * @param arr 需要查找的数组
     * @param value 需要查找的数
     * @return 返回找到数的下标, 若未找到则返回-1
     * */
    public int seqSearch(int[] arr, int value){

        // 简单粗暴的进行逐一对比, 发现相同值, 就返回下标
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                return i;
            }
        }
        return -1;

    }

}
