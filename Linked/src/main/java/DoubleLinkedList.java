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

        /* 临时指针，因为是插入节点,所以不能拿next */
        Hero2Node curNode = header;

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
        Hero2Node curNode = header;
        /* 标志位,为true时表示可以插入新节点了 */
        boolean flag = false;

        while (true) {
            if (curNode.next == null) {
                /* 表示已经找了尾节点了,可以直接插入了 */
                break;
            }
            if (curNode.no == newHero.no) {
                System.err.println("当前元素已存在,无法添加");
                flag = false;
                break;
            } else if (curNode.no > newHero.no) {
                /* 表示已经找到可以插入的节点了,退出循环 */
                break;
            }
            /* 还有找到可以插入/尾节点,需要再后移一位 */
            curNode = curNode.next;
        }
        if (!flag) {
            if(curNode.next == null){
                curNode.next = newHero;
                newHero.prev = curNode;
                return;
            }
            newHero.next = curNode;
            newHero.prev = curNode.prev;
            curNode.prev.next = newHero;
            curNode.prev = newHero;
        }


    }


    /**
     *  修改节点中的内容
     * */
    public void update(Hero2Node newNode){
        if(header.next == null){
            System.err.println("当前链表为空，无法修改节点");
            return;
        }
        /* 临时节点 */
        Hero2Node curNode = header.next;
        boolean flag = false;   // 标志符
        while (true){
            // 到达尾节点,退出循环
            if (curNode == null){
                break;
            }
            // 表示找到对应节点退出循环
            if (curNode.no == newNode.no){
                flag = true;
                break;
            }
            // 后移
            curNode = curNode.next;
        }

        if (!flag){
            System.err.println("未找到节点: "+newNode.no+" 无法进行修改操作");
        }else{
            curNode.name = newNode.name;
            System.out.println("修改成功");
        }
    }

    /**
     * 删除节点
     * */
    public void delete(int no){
        Hero2Node curNode = header.next;
        if (curNode == null){
            System.err.println("当前链表为空 无法进行删除操作");
        }
        boolean flag = false;
        while(true){
            // 找到对应节点.
            if (curNode.no == no){
                flag = true;
                break;
            }
            curNode = curNode.next;
        }
        if (flag){
            // 将"要删除节点"的 下一节点 ,和"要删除节点"的 上一节点的下节点 进行连接
            curNode.prev.next = curNode.next;
            if (curNode.next != null){
                // 如果"要删除节点"的 下一节点 不为空时,需要和'要删除节点'的 上节点进行连接.
                curNode.next.prev = curNode.prev;
            }
        }
    }

}
