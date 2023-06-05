import java.util.Scanner;

/**
 * 循环队列
 * */
public class CycleQueue {

    private final int maxSize; //队列最大值
    private int front;  //队列头
    private int rear;   //队列尾
    private final int[] queueArr;

    public CycleQueue(int maxSize){
        this.maxSize = maxSize;
        this.queueArr = new int[maxSize];
        this.front = 0;
        this.rear = 0;
    }

    /**
     * 判断当前队列是否已满
     * 说明: 当算法 队列尾+1 % 队列最大个数 等于 队列头 时表示当前队列已满
     * */
    public boolean isFull(){
        return (rear+1) % maxSize == front;
    }

    /**
     * 判断当前队列是否为空
     * 说明: 当队列头与队列尾相同时就表示当前队列为空
     * */
    public boolean isEmpty(){
        return front == rear;
    }

    /**
     * 展示当前队列中的有效数据
     * */
    public int size(){
        return (rear + maxSize - front) % maxSize;
    }

    /**
     * 往队列中添加元素
     * 后移算法: 队列头/队列尾+1 % 队列最大长度 即可获得"队列头/队列尾"的后移位置
     * */
    public void add(int number){
        if (isFull()){
            System.err.println("当前队列已满,无法添加新的元素");
            return;
        }
        queueArr[rear] = number;
        rear = (rear+1) % maxSize;
    }

    /**
     * 取出队列中的元素
     * 后移算法: 队列头/队列尾+1 % 队列最大长度 即可获得"队列头/队列尾"的后移位置
     * */
    public int get(){
        if (isEmpty()){
            System.err.println("当前队列已空,无法取出元素");
            return -1;
        }
        int value = queueArr[front];
        front = (front+1) % maxSize;
        return value;
    }

    /**
     * 展示队列中的所有元素(不是取出)
     * */
    public void showAll(){
        if (isEmpty()){
            System.err.println("当前队列为空,无法进行展示");
        }
        for (int i = front; i <front+size(); i++){
            System.out.printf("arr[%d] = %d \n", i %maxSize, queueArr[ i %maxSize]);
        }

    }

    /**
     * 展示队列的队列头元素(不是取出)
     * */
    public void showHeader(){
        if (isEmpty()){
            System.err.println("当前队列为空,无法查询队列头");
            return;
        }
        System.out.println(queueArr[front]);
    }


}
