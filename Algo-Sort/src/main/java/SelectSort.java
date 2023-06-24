import java.util.Arrays;

// 选择算法
public class SelectSort {


    public static void sort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIdx = i;

            for (int j = 0; j < arr.length; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    minIdx = j;
                }
            }
            if (minIdx != i){
                int temp = arr[i];
                arr[i] = min;
                arr[minIdx] = temp;
            }
        }
        System.err.println("使用选择排序后输出的结果: " + Arrays.toString(arr));


    }

}
