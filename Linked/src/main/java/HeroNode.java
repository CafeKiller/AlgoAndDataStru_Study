


/**
 * 英雄节点类
 * */
public class HeroNode {
    public int no; //英雄id
    public String name; //英雄名称
    public HeroNode next; //下一个节点

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' + '}';
    }


}
