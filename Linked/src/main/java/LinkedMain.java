

/**
 * 单向链表测试类
 * */
public class LinkedMain {

    public static void main(String[] args) {

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

}
