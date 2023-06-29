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
        System.err.println("希尔排序（交换法）的结果是：" + Arrays.toString(arr));

    }

    /* 位移法 */
    public static void sortByDisp(int[] arr){

        int group = arr.length/2;
        int idx = 0;
        int val = 0;

        while(group != 0){
            for (int i = group; i < arr.length; i++){
                idx = i -group;
                val = arr[i];
                while(idx >= 0 && val < arr[idx]){
                    arr[idx+group] = arr[idx];
                    idx -= group;
                }
                arr[idx + group] = val;
            }
            group /= 2;
        }
        System.err.println("希尔排序(位移法)的结果是: "+ Arrays.toString(arr) );
    }

}
