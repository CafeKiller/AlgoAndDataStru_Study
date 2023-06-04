
/**
 * 使用数组实现单向队列
 * */
public class OneWayQueue {

    private int MaxSize; //队列最大值
    private int front;  //队列头
    private int rear;   //队列尾
    private int[] queueArr;


    public OneWayQueue(int maxSize){

        this.MaxSize = maxSize;
        this.queueArr = new int[maxSize];
        this.front = -1;
        this.rear = -1;

    }



}
