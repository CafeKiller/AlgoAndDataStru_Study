import java.util.Random;

// 排序算法
public class SortMain {

    public static void main(String[] args) {

        /*int[] arr1 = {100,34,119,1,22,98};
        BubblingSort.sort(arr1);

        int[] arr2 = {233,33,129,10,2,908};
        SelectSort.sort(arr2);

        int[] arr3 = {9567,323,29,-2,33,81};
        InsertSort.sort(arr3);*/

        Random random = new Random();
        Integer[] arr = new Integer[]{9,4,7,1,3,5,10,2,6,8};
        MonkeySort monkeySort = new MonkeySort(arr);
        boolean isOrder = false;
        int num = 0;

        // 开始
        long startTime = System.currentTimeMillis();
        while(true){
            monkeySort.sort(num++,random);
            isOrder = monkeySort.checkOrder(monkeySort.getResult());
            if (isOrder){
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        // 结束

        System.out.println("排序完成，约耗时： " + (endTime - startTime)/1000 + "S");
        System.out.printf("一共执行了 %d 次\n",num);



    }
}
