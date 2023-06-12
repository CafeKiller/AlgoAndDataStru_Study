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
        /* 临时指针 */
        Hero2Node curNode = header.next;
        while(true){
            System.out.println(curNode);
            if (curNode.next == null){ /*为null表示已经到了最后一个元素了*/
                break;
            }
            curNode = curNode.next; // 还有元素,往后移一位.
        }
    }

    /**
    * 添加元素(添加至尾节点处)
    * */
    public void add(Hero2Node newNode){
        /* 临时指针 */
        Hero2Node curNode = header.next;

        while(true){
            if (curNode.next == null){ /*表示已经找到了尾节点，可以退出循环了*/
                break;
            }
            curNode = curNode.next; /*还没有找到尾节点，需要后移*/
        }
        /* 推出循环 curNode指向尾节点 */
        /* 将新节点插入尾节点， 并连接前一个节点 */
        curNode.next = newNode;
        newNode.prev = curNode;
    }

    /**
     * 添加元素(按照顺序进行插入)
     * */
    public void addOrder(Hero2Node newHero){
        /* 临时指针 */
        Hero2Node curNode = header.next;
        /* 标志位,为true时表示可以插入新节点了 */
        boolean flag = true;

        /* 说明当前链表还没有元素,所以可以直接插入 */
        if(header.next == null){
            newHero.prev = header;
            header.next = newHero;
        }else{
            while(true){
                if (curNode.no == newHero.no){
                    System.err.println("当前元素已存在,无法添加");
                    flag = false;
                    break;
                } else if (curNode.no > newHero.no) {
                    /* 表示已经找到可以插入的节点了,退出循环 */
                    break;
                }
                if (curNode.next == null){
                    /* 表示已经找了尾节点了,可以直接插入了 */
                    break;
                }
                /* 还有找到可以插入/尾节点,需要再后移一位 */
                curNode = curNode.next;
            }
            if(flag){
                /* 新节点连接原先的上下节点 */
                newHero.next = curNode;
                newHero.prev = curNode.prev;
                /* 将原先的上下节点的相邻节点替换成新节点 */
                curNode.prev.next = newHero;
                curNode.prev = newHero;

            }
        }


    }



}
