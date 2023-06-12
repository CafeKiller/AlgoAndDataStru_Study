public class DoubleLinkedList {

    /* 头节点 */
    private Hero2Node header = new Hero2Node(0,null);

    public void setHeader(Hero2Node header) {
        this.header = header;
    }
    public Hero2Node getHeader() {
        return header;
    }


    /**
     * 展示链表中的所有元素
     */
    public void list(){
        /*判断链表是否为空*/
        if(header.next == null){
            System.err.println("当前链表为空，无法访问");
            return;
        }
        Hero2Node curNode = header.next;
        while(true){
            System.out.println(curNode);
            if (curNode.next == null){ /*为null表示已经到了最后一个元素了*/
                break;
            }
            curNode = curNode.next; // 还有元素,往后移一位.
        }
    }

    



}
