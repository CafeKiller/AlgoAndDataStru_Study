public class Hero2Node {

    public int no; //英雄id
    public String name; //英雄名称
    public Hero2Node next; //下一个节点
    public Hero2Node prev; //上一个节点

    public Hero2Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero2Node{" +
                "no=" + no +
                ", name='" + name + '\'' + '}';
    }


}
