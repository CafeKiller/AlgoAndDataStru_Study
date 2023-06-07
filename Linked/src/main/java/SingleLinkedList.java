

/**
 * 单向链表类
 * */
public class SingleLinkedList {

    /*初始化一个节点头,不存放数据*/
    public HeroNode header = new HeroNode(0,""); //头节点

    /**
     * 添加方法(不考虑编号顺序问题)
     * 将每一个新增的元素添加到链表的尾端
     * */
    public void add(HeroNode newNode){
        /*
        * (1)先找到链表的尾节点;
        * (2)在将新节点插入尾节点的next;
        * */
        // header 不可移动,所以需要一个临时节点
        HeroNode temp = header;
        while (true){
            // 循环判断,是否为链表的尾节点
            if(temp.next == null){
                break;
            }
            temp = temp.next; //后移节点
        }
        temp.next = newNode; /*找到尾节点后,将新节点插入*/
    }

    /**
     *  添加方法(考虑编号顺序问题)
     *  依照编号(no)顺序插入,如果编号已存在则无法插入
     * */
    public void addByOrder(HeroNode newNode){
        HeroNode temp = header;     //头节点不可移动,需要转换为一个临时节点
        boolean isExist = false;    //判断编号是否存在
        while (true){
            if (temp.next==null){break;}    //找到尾节点,退出循环
            if (temp.next.no > newNode.no){ //找到需要插入的位置,退出循环
                break;
            } else if (temp.next.no == newNode.no) {    //找到已有的相同编号节点,退出循环
                isExist = true;
                break;
            }
            temp = temp.next;   //以上条件都无法成立,节点后移
        }

        if (isExist){
            System.err.println("当前元素已存在,无法再进行插入操作");
        }else{
            // 新节点与"需要插入节点的上一节点"进行next替换;
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }

    /**
     * 修改方法(通过编号)
     * */
    public void update(HeroNode newNode){
        /*非空判断*/
        if (header.next == null){
            System.err.println("当前链表为空!");
            return;
        }

        HeroNode temp = header.next;
        boolean flag = false;   //定位阀,标志是否找到需要修改的节点

        while (true){
            if (temp == null) break;    //说明遍历结束;
            if (temp.no == newNode.no){ //查询到需要修改的节点;
                flag = true;
                break;
            }
            temp = temp.next;   //后移
        }

        if(flag){ //修改
            temp.name = newNode.name;
        }else {
            System.err.println("未查询到对应编号: "+newNode.no+"节点,无法进行修改操作!");
        }
    }

    /**
     * 删除方法(通过编号来定位需要删除的节点)
     * */
    public void delete(int no){

        HeroNode temp = header;
        boolean flag = false;

        while(true){
            if(temp == null) break;
            if(temp.next.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.next = temp.next.next;
        }else {
            System.err.println("查询到对应编号: "+no+"节点,无法进行删除操作!");
        }
    }


    /**
     * 显示链表
     * */
    public void show(){

        if (header.next == null){
            System.err.println("当前链表为空,无法查看");
            return;
        }
        HeroNode temp = header.next;
        while(true){
            if (temp == null) break;
            System.out.println(temp);
            temp = temp.next;
        }
    }


}
