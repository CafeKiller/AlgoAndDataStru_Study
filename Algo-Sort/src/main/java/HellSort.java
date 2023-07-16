import java.util.Arrays;

// 希尔排序
public class HellSort {

    /* 交换法 */
    public static void sortBySwap(int[] arr){

        int temp = 0;
        int group = arr.length/2;

        while (group != 0) {
            for (int i = group; i < arr.length; i++) {
                for (int j = i-group; j >= 0;j -= group){
                    if (arr[j] > arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            group /= 2;
        }
        //System.err.println("希尔排序（交换法）的结果是：" + Arrays.toString(arr));

    }

    /* 位移法 */
    public static void sortByDisp(int[] arr){
        // 确定每一次的步长
        for (int gap = arr.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j-gap]){
                    while(j - gap >= 0 && temp <= arr[j-gap]){
                        // 进行位移
                        arr[j] = arr[j-gap];
                        j -= gap;
                    }
                    // 找到位置,退出循环
                    arr[j] = temp;
                }
            }
        }
        // System.err.println("希尔排序（位移法）的结果是：" + Arrays.toString(arr));
    }

}
