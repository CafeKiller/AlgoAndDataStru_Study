import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class SortMain {

    public static void main(String[] args) {

        SortMain sortMain = new SortMain();

        //sortMain.testBubblingSort();

        //sortMain.testSelectSort();

        //sortMain.testInsertSort();

        //sortMain.testBogoSort();

        //sortMain.testHellSortBySwap();

        //sortMain.testHellSortByDisp();

        //sortMain.testQuickSort();

        //sortMain.testMergeSort();

        // sortMain.testRadixSort();

        // sortMain.testHeapSort();

        sortMain.testRadixSortK();
    }



    /**
     * 测试冒泡排序算法
     * */
    public void testBubblingSort(){
        // 开始
        System.err.println("选择排序测试,处理数据量"+100000+"条");
        long startTime = System.currentTimeMillis();
        int[] arr1 = generateArray(100000, 100000);
        BubblingSort.sort(arr1);
        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("排序完成，约耗时： " + (endTime - startTime) + "ms");
    }

    /*
    * 测试选择排序算法
    * */
    public void testSelectSort(){
        // 开始
        System.err.println("选择排序测试,处理数据量"+100000+"条");
        long startTime = System.currentTimeMillis();
        int[] arr1 = generateArray(100000, 100000);
        SelectSort.sort(arr1);
        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("排序完成，约耗时： " + (endTime - startTime) + "ms");
    }

    /**
     * 测试插入排序算法
     * */
    public void testInsertSort(){
        // 开始
        System.err.println("选择排序测试,处理数据量"+100000+"条");
        long startTime = System.currentTimeMillis();
        int[] arr1 = generateArray(100000, 100000);
        InsertSort.sort(arr1);
        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("排序完成，约耗时： " + (endTime - startTime) + "ms");
    }


    /**
     * 测试希尔排序算法(交换法)
     * */
    public void testHellSortBySwap(){
        // 开始
        System.err.println("希尔排序（交换法）测试,处理数据量"+100000+"条");
        long startTime = System.currentTimeMillis();
        int[] arr1 = generateArray(100000, 100000);
        HellSort.sortBySwap(arr1);
        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("排序完成，约耗时： " + (endTime - startTime) + "ms");
    }


    /**
     * 测试希尔排序算法(位移法)
     * */
    public void testHellSortByDisp(){
        // 开始
        System.err.println("希尔排序（交换法）测试,处理数据量"+100000+"条");
        long startTime = System.currentTimeMillis();
        int[] arr1 = generateArray(100000, 100000);
        HellSort.sortByDisp(arr1);
        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("希尔排序（交换法）测试完成，约耗时： " + (endTime - startTime) + "ms");
    }

    /**
     * 测试快速排序
     * */
    public void testQuickSort(){
        // 开始
        System.err.println("快速排序测试,处理数据量"+100000+"条");
        long startTime = System.currentTimeMillis();
        int[] arr1 = generateArray(100000, 100000);
        QuickSort.quickSort(arr1, 0, arr1.length-1);
        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("快速排序测试完成，约耗时： " + (endTime - startTime) + "ms");
    }

    /*
    * 测试归并排序
    * */

    public void testMergeSort(){
        // 开始
        System.err.println("归并排序测试,处理数据量"+100000+"条");
        long startTime = System.currentTimeMillis();
        int[] arr1 = generateArray(100000, 100000);

        int[] temp = new int[arr1.length];
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr1, 0, arr1.length-1, temp);

        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("归并排序测试完成，约耗时： " + (endTime - startTime) + "ms");
    }

    /*
    * 测试基数排序算法
    * */
    public void testRadixSort(){
        // 开始
        System.err.println("基数排序测试,处理数据量"+100000+"条");
        long startTime = System.currentTimeMillis();
        int[] arr1 = generateArray(100000, 100000);

        radixSort radixSort = new radixSort();
        radixSort.randixSort(arr1);

        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("基数排序测试完成，约耗时： " + (endTime - startTime) + "ms");
    }

    public void testHeapSort(){
        // 开始
        System.err.println("堆排序测试,处理数据量"+100000+"条");
        long startTime = System.currentTimeMillis();
        int[] arr1 = generateArray(100000, 100000);
        int[] temp = new int[arr1.length];
        HeapSort.heapSort(arr1);
        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("堆排序测试完成，约耗时： " + (endTime - startTime) + "ms");
    }

    /**
     * 测试Bogo排序算法(猴子算法)
     * */
    public void testBogoSort(){

        Random random = new Random();
        Integer[] arr = new Integer[]{9,4,7,1,3,5,10,2,6,8};
        MonkeySort monkeySort = new MonkeySort(arr);
        boolean isOrder = false;
        int num = 0;

        // 开始
        System.err.println("Bogo测试,处理数据量"+10+"条");
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

        System.out.println("排序完成，约耗时： " + (endTime - startTime) + "ms");
        System.out.printf("一共执行了 %d 次\n",num);

    }

    public void testRadixSortK() {

        // 开始
        System.err.println("基数排序（Kotlin）测试，处理数据量"+100000+"条");
        long startTime = System.currentTimeMillis();
        int[] arr1 = generateArray(100000, 100000);

        radixSortK radixSortK = new radixSortK();
        radixSortK.radixSort(arr1);

        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("堆排序测试完成，约耗时： " + (endTime - startTime) + "ms");

    }


    /**
     * 生成随机数数组,用于排序测试
     * @param len 需要生成的随机数组的长度
     * @param max 生成随机数的最大值[0,max)
     * @return 随机数数组
     * */
    @NotNull
    public static int[]  generateArray(int len, int max){
        int[] arr=new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*max);
        }
        return arr;
    }

}
