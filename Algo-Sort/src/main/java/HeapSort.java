public class HeapSort {

    public static void heapSort(int[] arr){
        int temp;
        for (int i= arr.length/2-1; i>=0; i++){
            adjustHeap(arr,i, arr.length);
        }
        for (int i = arr.length-1; i > 0 ; i--) {
            temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            adjustHeap(arr,0,i);
        }
    }


    /**
     * 完成将以i对应的非叶子节点的树转换为大顶堆
     * int arr[] = {4, 6, 8, 5, 9}; => i = 1 => adjustHeap => 得到 {4, 9, 8, 5, 6}
     *
     *
     * */
    public static void adjustHeap(int[] arr, int i, int len){

        int temp = arr[i]; // 获取当前元素的值, 保存为临时变量

        // k =i*2+1, k是i节点的左子节点
        for (int k =i*2+1; k < len; k = k*2-1) {
            if (k+1 <len && arr[k] <arr[k+1]){ // 说明左子节点的值小于右子节点
                k++; // k指向右子节点,因为要将较大的节点交换到父节点
            }
            if (arr[k]>temp){ // 若子节点大于父节点
                arr[i] = arr[k]; // 把较大的值赋给当前节点
                i = k;  // i指向k
            }else {
                break;
            }
        }
        arr[i] = temp;
    }

}
