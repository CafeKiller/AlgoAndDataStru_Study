import org.apache.log4j.Logger;

import java.util.Scanner;

// 单向队列
public class OneWayQueueMain {

    public static Logger logger = Logger.getLogger(OneWayQueueMain.class);

    public static void main(String[] args) {

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

}
