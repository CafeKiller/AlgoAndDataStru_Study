import org.apache.log4j.Logger;

/*
* 数据结构: 栈
* */
public class StackMain {

    public static Logger logger = Logger.getLogger(StackMain.class);

    public static void main(String[] args) {

        test1();


    }

    public static void test1(){
        logger.warn("当前开始测试数组模拟 栈 的测试");
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(9);
        arrayStack.push(1);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(666);

        arrayStack.list();

        logger.warn("开始进行弹栈操作");
        arrayStack.pop();
        arrayStack.pop();

        arrayStack.list();
    }

}


