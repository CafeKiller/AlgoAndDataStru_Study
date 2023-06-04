import java.util.Scanner;

/**
 * 循环队列
 * */
public class CycleQueue {


    private int maxSize; //队列最大值
    private int front;  //队列头
    private int rear;   //队列尾
    private int[] queueArr;


    public CycleQueue(int maxSize){

        this.maxSize = maxSize;
        this.queueArr = new int[maxSize];
        this.front = -1;
        this.rear = -1;

    }


}
