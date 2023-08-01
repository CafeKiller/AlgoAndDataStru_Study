
// 雇员链表
public class EmpLinkedList {

    // 头指针
    private Emp head;


    // 添加到链表
    public void add(Emp emp){
        if (head == null){
            head = emp;
            return;
        }
        Emp curEmp = head;
        while(true){
            if (curEmp.next == null){
                break;
            }
            curEmp = curEmp.next;// 后移
        }
        // 表示已经找到最后一个节点, 将元素添加到链表尾部
        curEmp.next = emp;
    }

    // 遍历链表的雇员信息
    public void list(int no){

        if (head == null){
            System.out.printf("第 %d 链表为空 \n", no+1 );
            return;
        }

        System.out.printf("第 %d 链表的信息为", no+1 );
        Emp curEmp = head; // 辅助指针
        while (1==1) {
            System.out.printf(" => id=%d name=%s\t", curEmp.id, curEmp.name);
            if (curEmp.next == null){ // 表示curEmp已经到了最后节点
                break;
            }
            curEmp = curEmp.next; // 后移
        }
        System.out.println();
    }

    // 根据id查询雇员
    // 如果找到了就返回该Emp对象,没有则返回null
    public Emp findEmpById(int id){
        if (head == null){ // 判断链表是否为空
            System.out.println("链表为空");
            return null;
        }
        Emp curEmp = head; // 辅助指针
        while(true){
            if (curEmp.id == id){ //找到目标
                break;
            }
            if (curEmp.next == null){
                curEmp = null;
                break;
            }
            curEmp = curEmp.next; // 后移
        }
        return curEmp;
    }

}
