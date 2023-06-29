import java.util.Arrays;

// 冒泡排序
public class BubblingSort {

    public static void sort(int[] arr){

        int count = 0;
        int temp = 0;
        boolean flag = false;

        for (int i = 0; i < arr.length - 1; i++) {
            count++;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }else {
                flag = false;
            }
        }

        System.err.println("冒泡排序后的数组:" + Arrays.toString(arr)+" 共运行了"+count+"趟");


    }

}
