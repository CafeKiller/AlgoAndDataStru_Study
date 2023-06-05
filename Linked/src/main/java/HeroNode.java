


/**
 * 英雄节点类
 * */
public class HeroNode {
    public int id; //英雄id
    public String name; //英雄名称
    public HeroNode next; //下一个节点

    public HeroNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", next=" + next +
                '}';
    }


}
