import org.apache.log4j.Logger;

import javax.swing.*;

// 关于稀疏数组的使用
public class SparseArray {

    //配置log4j
    public static Logger logger = Logger.getLogger(SparseArray.class);

    public static void main(String[] args) {

        //配置一个log4j


        // 先创建原始数组
        int[][] originArr = new int[11][11];
        // 并赋值
        originArr[1][2] = 1;
        originArr[2][3] = 2;
        originArr[4][4] = 3;

        //调用打印函数
        int sum = outOriginArr(originArr);
        logger.info(sum);



        int[][] newArr = originArrConvSparesArr(originArr, sum);
        //将转换后的稀疏数组打印
        for (int[] ints : newArr) {
            System.out.println(ints[0]+" "+ints[1]+" "+ints[2]);
        }

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

    /**
     * 描述: 将一个原始二维数组 将其转为 稀疏数组;
     * @param originArr 表示原始数组
     * @param dataNum 表示原始数组中的有效数据个数
     * */
    static int[][] originArrConvSparesArr(int[][] originArr,int dataNum){

        //创建一个稀疏数组
        // 行对应的就是: 有效数据+1(需要多一行头部记录原始数组的大小), 3则是稀疏数组规定的
        int[][] sparesArr = new int[dataNum+1][3];

        // 初始化行头
        sparesArr[0][0] = originArr.length;
        sparesArr[0][1] = originArr[0].length;
        sparesArr[0][2] = dataNum;

        int count = 0; //记录当前是第几位有效数据
        for (int i = 0; i < sparesArr[0][0]; i++) {
            for (int j = 0; j < sparesArr[0][1]; j++) {
                //检测到有效数据,将其传入稀疏数组内
                if (originArr[i][j] != 0){
                    count++;
                    sparesArr[count][0] = i;    //记录当前有效数据的行
                    sparesArr[count][1] = j;    //记录当前有效数据的列
                    sparesArr[count][2] = originArr[i][j];  //记录当前有效数据的具体数值
                }
            }
        }
        return  sparesArr;
    }

}


// 主要参考: https://blog.csdn.net/qq_43678588/article/details/117839347