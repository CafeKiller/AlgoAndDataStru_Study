

/**
 * 单向链表类
 * */
public class SingleLinkedList {

    public HeroNode header = new HeroNode(0,""); //头节点

    /**
     * 添加方法(不考虑编号顺序问题)
     * */
    public void add(HeroNode heroNode){

        HeroNode temp = header;
        while (true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

}
