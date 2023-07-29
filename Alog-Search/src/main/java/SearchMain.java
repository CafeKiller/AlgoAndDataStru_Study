import org.jetbrains.annotations.NotNull;

public class SearchMain {

    public static void main(String[] args) {

        testSeqSearch();

    }

    public static void testSeqSearch(){
        // 开始
        System.err.println("线性查找算法测试,处理数据量"+100000+"条");
        long startTime = System.currentTimeMillis();
        int[] arr = generateArray(100000, 100000);

        SeqSearch seqSearch = new SeqSearch();
        int index = seqSearch.seqSearch(arr, 898);

        if (index != -1){
            System.out.printf("找到啦, 下标是%d \n",index);
        }else{
            System.out.println("哎呀没有找到");
        }

        long endTime = System.currentTimeMillis();
        // 结束
        System.out.println("线性查找算法测试完成，约耗时： " + (endTime - startTime) + "ms");
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
