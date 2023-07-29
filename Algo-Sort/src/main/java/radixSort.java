
// 基数排序算法
// 将所有待比较数值统一为同样的数位长度， 数位较短的数前面补零。 然后， 从最低位开始， 依次进行一次排序。这样从最低位排序一直到最高位排序完成以后, 数列就变成一个有序序列。
public class radixSort {

    // 根据前面的推导过程，我们可以得到最终的基数排序代码
    public void randixSort(int[] arr){

        // 得到数组中最大数的位数
        int max = arr[0]; // 假设第一数就是最大数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        // 得到最大数是几位数
        int maxLength = (max+"").length();

        // 定义一个二维数组，表示10个桶，每个桶就是一个一维数组
        // 说明
        // 二维数组包含10个一维数组
        // 为了放置存入数的时候，数据溢出，则每个一维数组（桶），大小定义为arr.length
        // 明确, 基数排序是使用空间换时间的经典算法。
        int[][] bucket = new int[10][arr.length];

        // 为了记录每个桶中, 实际放了多少个数据, 我们定义一个一维数组来记录各个桶的每次放入的数据个数
        // 可以理解为: bucketElementCount[0] 记录的就是 bucket[0]桶的放入数据个数
        int[] bucketElementCounts = new int[10];

        for (int i = 0, n =1; i < maxLength; i++,n *= 10) {

            // (针对每个元素的对应位进行排序处理), 第一位是个位数、第二位是十位数、第三位是百位数...
            for (int j = 0; j < arr.length; j++) {
                // 取出每个元素的对应位的值
                int digitOfElement = arr[j] /n %10;
                // 放入对应的桶中
                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
                bucketElementCounts[digitOfElement]++;
            }

            // 按照这个桶的顺序(一维数组的下标依次取出数据, 放入原来数组)
            int index = 0;

            // 遍历每一个桶,并将桶中的数据, 放入到原数组
            for (int k = 0; k < bucketElementCounts.length; k++) {
                // 如果桶中, 有数据, 我们才放入原数组
                if (bucketElementCounts[k] != 0){
                    // 循环该桶即第k桶(即第k个一维数组), 放入
                    for (int l = 0; l < bucketElementCounts[k]; l++) {
                        // 取出元素放入到arr数组中
                        arr[index++] = bucket[k][l];
                    }
                }
                // 第i+1轮处理后,需要将每个bucketElementCounts[k] 清除归零
                bucketElementCounts[k] = 0;
            }

        }


    }


}
