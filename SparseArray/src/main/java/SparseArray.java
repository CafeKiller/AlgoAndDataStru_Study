
// 关于稀疏数组的使用
public class SparseArray {
    public static void main(String[] args) {

        // 先创建原始数组
        int[][] originArr = new int[11][11];
        // 并赋值
        originArr[1][2] = 1;
        originArr[2][3] = 2;
        originArr[4][4] = 3;

        //调用打印函数
        int sum = outOriginArr(originArr);


    }

    //打印原始数组,并记录有效数据的个数
    static int outOriginArr(int[][] arr){
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt != 0) sum++;
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        return sum;
    }

}


// 主要参考: https://blog.csdn.net/qq_43678588/article/details/117839347