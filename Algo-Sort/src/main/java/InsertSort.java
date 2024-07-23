import java.util.Arrays;

// 插入排序
public class InsertSort {


    public static void sort( int[] arr ){

        int insertIdx = 0;
        int insertValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            insertIdx = i -1;
            insertValue = arr[i];

            while(insertIdx >= 0 && insertValue < arr[insertIdx]){
                arr[insertIdx+1] = arr[insertIdx];
                insertIdx--;
            }
            if (insertIdx+1 != i){
                arr[insertIdx+1] = insertValue;
            }
        }
    }


}
