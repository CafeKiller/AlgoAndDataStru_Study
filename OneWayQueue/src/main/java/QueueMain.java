import org.apache.log4j.Logger;

import java.util.Scanner;

// 单向队列
public class QueueMain {

    public static Logger logger = Logger.getLogger(QueueMain.class);

    public static void main(String[] args) {


        //测试单向队列
        //testOneWayQueue();

        //测试循环队列
        testCycleQueue();

    }

    // 测试队列
    public static void testOneWayQueue(){

        logger.info("普通单向队列测试");

        System.err.println("[tips] 请输入需要创建的队列长度>>>");
        int queueLength = new Scanner(System.in).nextInt();
        OneWayQueue oneWayQueue = new OneWayQueue(queueLength);
        System.out.println("[tips] 队列初始化成功~");
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        while(loop){
            System.out.println();
            System.out.println(" [s] : (show) 显示队列");
            System.out.println(" [a] : (add) 添加数据到队列");
            System.out.println(" [g] : (get) 从队列取出数据");
            System.out.println(" [h] : (head) 查看队列头的数据");
            System.out.println(" [e] : (exit) 退出程序");
            char key = input.next().charAt(0);

            switch(key){
                case 's' : oneWayQueue.showQueue();
                    break;
                case 'a' : oneWayQueue.add();
                    break;
                case 'g' : oneWayQueue.get();
                    break;
                case 'h' : oneWayQueue.showQueueHeader();
                    break;
                case 'e' :
                    loop = false;
                    System.out.println("bye~");
                    break;
            }
        }
    }

    // 测试循环队列
    public static void testCycleQueue(){

        System.err.println("[CycleQueen: tips] 请输入需要创建的队列长度>>>");
        int queueLength = new Scanner(System.in).nextInt();

        CycleQueue cycleQueue = new CycleQueue(queueLength);

        System.out.println("[CycleQueen: tips] 队列初始化成功~");
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        while(loop){
            System.out.println("");
            System.out.println(" [s] : (show) 显示队列");
            System.out.println(" [a] : (add) 添加数据到队列");
            System.out.println(" [g] : (get) 从队列取出数据");
            System.out.println(" [h] : (head) 查看队列头的数据");
            System.out.println(" [e] : (exit) 退出程序");
            char key = input.next().charAt(0);

            switch(key){
                case 's' : cycleQueue.showAll();
                    break;
                case 'a' :
                    System.out.println("请输入要入队的数字: ");
                    int val = new Scanner(System.in).nextInt();
                    cycleQueue.add(val);
                    break;
                case 'g' : cycleQueue.get();
                    break;
                case 'h' : cycleQueue.showHeader();
                    break;
                case 'e' :
                    loop = false;
                    System.out.println("bye~");
                    break;
            }
        }
    }


}
