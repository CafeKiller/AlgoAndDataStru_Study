import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SearchMain {

    public static void main(String[] args) {

        // testSeqSearch();

        // testBinarySearch();

        // testInsertValueSearch();

        testFibonacciSearch();


    }

    // 测试线性查找算法
    public static void testSeqSearch(){

        System.err.println("线性查找算法测试,处理数据量"+100000+"条");

        int[] arr = generateArray(100000, 100000);
        SeqSearch seqSearch = new SeqSearch();

        // 开始
        long startTime = System.currentTimeMillis();
        int index = seqSearch.seqSearch(arr, 31190);
        if (index != -1){
            System.out.printf("找到啦, 下标是%d \n",index);
        }else{
            System.out.println("哎呀没有找到");
        }
        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("线性查找算法测试完成，约耗时： " + (endTime - startTime) + "ms");
    }


    // 测试二分查找算法
    public static void testBinarySearch(){

        System.err.println("二分查找算法测试,处理数据量"+100000+"条");
        int[] arr = generateArray(100000, 100000);
        // 注意：二分查找算法必须是有序的
        Arrays.sort(arr);
        BinarySearch binarySearch = new BinarySearch();

        // 开始
        long startTime = System.currentTimeMillis();
        int index = binarySearch.binarySearch(arr, 0,arr.length-1,31190);
        if (index != -1){
            System.out.printf("找到啦, 下标是%d \n",index);
        }else{
            System.out.println("哎呀没有找到");
        }
        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("二分查找算法测试完成，约耗时： " + (endTime - startTime) + "ms");
    }

    // 测试插值查找算法
    public static void testInsertValueSearch(){
        System.err.println("插值查找算法测试,处理数据量"+100000+"条");
        int[] arr = generateArray(100000, 100000);
        // 注意：二分查找算法必须是有序的
        Arrays.sort(arr);
        InsertValueSearch insertValueSearch = new InsertValueSearch();

        // 开始
        long startTime = System.currentTimeMillis();
        int index = insertValueSearch.insertValueSearch(arr, 0,arr.length-1,5540);
        if (index != -1){
            System.out.printf("找到啦, 下标是%d \n",index);
        }else{
            System.out.println("哎呀没有找到");
        }
        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("插值查找算法测试完成，约耗时： " + (endTime - startTime) + "ms");
    }

    // 测试斐波那契查找算法
    public static void testFibonacciSearch(){
        System.err.println("斐波那契查找算法测试,处理数据量"+100000+"条");
        int[] arr = generateArray(100000, 100000);
        // 注意：二分查找算法必须是有序的
        Arrays.sort(arr);
        FibonacciSearch.setMaxSize(100000);

        // 开始
        long startTime = System.currentTimeMillis();
        int index = FibonacciSearch.fidSearch(arr,98890);
        if (index != -1){
            System.out.printf("找到啦, 下标是%d \n",index);
        }else{
            System.out.println("哎呀没有找到");
        }
        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("斐波那契查找算法测试完成，约耗时： " + (endTime - startTime) + "ms");
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
