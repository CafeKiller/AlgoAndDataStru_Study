import org.apache.log4j.Logger;

/**
 * 单向链表测试类
 * */
public class LinkedMain {

    static Logger logger = Logger.getLogger(LinkedMain.class);

    public static void main(String[] args) {


        // test1();

        test2();

    }

    /* 测试单向链表 */
    public static void test1(){
        HeroNode heroNode1 = new HeroNode(1,"赵大");
        HeroNode heroNode2 = new HeroNode(3,"张三");
        HeroNode heroNode3 = new HeroNode(4,"李四");
        HeroNode heroNode4 = new HeroNode(2,"林二");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        // 非顺序插入
        /*singleLinkedList.add(heroNode1);
        singleLinkedList.add(heroNode2);
        singleLinkedList.add(heroNode3);
        singleLinkedList.add(heroNode4);*/

        // 顺序插入
        singleLinkedList.addByOrder(heroNode1);
        singleLinkedList.addByOrder(heroNode2);
        singleLinkedList.addByOrder(heroNode3);
        singleLinkedList.addByOrder(heroNode4);

        System.out.println("测试插入------------------------");
        singleLinkedList.show();

        System.out.println("测试修改------------------------");
        heroNode1 = new HeroNode(2,"陈二");
        singleLinkedList.update(heroNode1);
        singleLinkedList.show();

        System.out.println("测试删除------------------------");
        singleLinkedList.delete(2);
        singleLinkedList.show();
    }

    /* 测试双向链表 */
    public static void test2(){

        logger.warn("当前开始测试: 双向链表");

        // 创建节点
        Hero2Node node1 = new Hero2Node(3,"张三");
        Hero2Node node2 = new Hero2Node(6,"老陆");
        Hero2Node node3 = new Hero2Node(4,"李四");
        Hero2Node node4 = new Hero2Node(9,"Joker");



        // 创建一个双向链表, 并插入节点
        /*DoubleLinkedList doubleLinked = new DoubleLinkedList();
        doubleLinked.add(node1);
        doubleLinked.add(node2);
        doubleLinked.add(node3);
        doubleLinked.add(node4);*/

        /* 测试顺序插入 */
        DoubleLinkedList doubleLinked = new DoubleLinkedList();
        doubleLinked.addOrder(node1);
        doubleLinked.addOrder(node2);
        doubleLinked.addOrder(node3);
        doubleLinked.addOrder(node4);

        // 展示链表中的所有元素
        logger.info("以下为展示链表中的所有元素");
        doubleLinked.list();

        // 测试修改节点
        logger.info("以下测试修改节点");
        Hero2Node node2_2 = new Hero2Node(6,"刘老六");
        doubleLinked.update(node2_2);
        doubleLinked.list();

        logger.info("以下为测试删除一个节点");
        doubleLinked.delete(4);
        doubleLinked.list();


    }

}
