/* 快速排序 */
public class QuickSort {

    public static void quickSort(int[] arr, int left, int right){

        int lIdx = left;
        int rIdx = right;
        int temp = 0;

        int pivot = arr[(left+right)/2];

        while(lIdx < rIdx){

            while(arr[lIdx] < pivot) lIdx += 1;

            while(arr[rIdx] > pivot) rIdx -= 1;

            if(lIdx >= rIdx) break;

            temp = arr[lIdx];
            arr[lIdx] = arr[rIdx];
            arr[rIdx] = temp;

            if (arr[lIdx] == pivot){
                rIdx -= 1;
            }else if (arr[rIdx] == pivot){
                lIdx++;
            }
        }

        if (lIdx == rIdx){
            lIdx++;
            rIdx--;
        }

        if (left < rIdx) quickSort(arr,left,rIdx);

        if (right > lIdx) quickSort(arr,lIdx,right);


    }

}
