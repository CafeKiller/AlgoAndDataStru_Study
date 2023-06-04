import java.util.Scanner;

/**
 * 使用数组实现单向队列
 * */
public class OneWayQueue {

    private int maxSize; //队列最大值
    private int front;  //队列头
    private int rear;   //队列尾
    private int[] queueArr;


    public OneWayQueue(int maxSize){

        this.maxSize = maxSize;
        this.queueArr = new int[maxSize];
        this.front = -1;
        this.rear = -1;

    }

    /**
    * 添加队列元素
    *  */
    public void add(){

        if (rear == maxSize-1){
            System.err.println("当前队列已满!");
        }
        System.out.println("请输入要入队的数字: ");
        int val = new Scanner(System.in).nextInt();
        rear++;
        queueArr[rear] = val;
        System.out.println("数字: "+val+",入队成功");

    }

    /**
     * 从队列中取出元素
     * */
    public void get(){
        if(rear == front){
            System.err.println("当前队列已空,无法取出元素!");
        }else{
            front++;
            System.out.println("元素: "+queueArr[front]+",成功取出队列.");
        }
    }

    /**
     * 展示队列中的全部元素(不是取出)
     * */
    public void showQueue(){
        if (rear == front){
            System.err.println("当前队列为空,无法进行展示!");
        }else{
            for (int i : queueArr) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }

    /*
    * 展示当前队列头
    * */
    public void showQueueHeader(){
        if (rear == front){
            System.err.println("当前队列为空,无法进行展示!");
        }else{
            System.out.println("当前队列头元素是: " + queueArr[front+1]);
        }
    }

}
