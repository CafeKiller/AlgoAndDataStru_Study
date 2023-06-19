
/* 使用递归处理八皇后问题 */
public class Queen8 {


    int max = 8;

    static int count = 0; // 计数器,用于统计需要多少步才能获得最终结果

    int[] arr = new int[max];

    public void fun1(){

        Queen8 queen8 = new Queen8();

        queen8.check(0);

    }

    public void check(int n){

        if(n == max){
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            arr[n] = i;
            if (judge(n)){
                check(n+1);
            }
        }

    }

    public boolean judge(int n){
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[n] || Math.abs(n-i) == Math.abs(arr[n]-arr[i])){
                return false;
            }
        }
        return true;
    }

    public void print(){
        System.out.print("第"+(++count)+"种: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
