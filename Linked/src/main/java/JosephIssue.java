
/**
 * 约瑟夫问题
 * @author 咖啡Killer
 * @create 2023年6月14日22:53:39
 * */
public class JosephIssue {

    static CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();

    public static void test(){
        circleSingleLinkedList.addBoy(5);
        circleSingleLinkedList.list();
        circleSingleLinkedList.solveJoseph(1,3,5);
    }

}

class Boy{
    private int no;
    private Boy next;

    public Boy(){

    }
    public Boy(int no){
        this.no = no;
    }


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }

}

class CircleSingleLinkedList{
    // 头节点,展示赋值为-1,稍后赋正确的值.
    private Boy first = new Boy(-1);

    /**
     * 创建一个: 环形单向链表
     * */
    public void addBoy(int nums){

        // 判断输入的nums值是否合法
        if (nums < 1){
            System.err.println("输入的nums值不合法,无法形成环形单向链表");
            return;
        }

        // 辅助指针
        Boy current = null;

        // 循环创建链表
        for (int i = 1; i <= nums; i++) {
            Boy newBoy = new Boy(i);
            /* 判断到是第一个节点,将其与未初始化的first进行替换 */
            if (i==1){
                first = newBoy;
                first.setNext(first);   //形成闭环
                current = first;    //将第一个节点指向first,first不可动
            }else {
                current.setNext(newBoy);
                newBoy.setNext(first);
                current = newBoy;
            }
        }

    }

    // 遍历链表
    public void list(){

        Boy current = first;

        if(current.getNo() == -1){
            System.err.println("当前链表为空,无法进行变量");
            return;
        }
        while(true){
            System.out.println("当前小孩编号"+current.getNo());
            current = current.getNext();
            if(current == first){
                break;
            }
        }
    }


    /**
     * 根据传入的参数,计算出孩子出圈的顺序.
     *
     * */
    public void solveJoseph(int startNo, int countNum, int num){
        /* 判断输入的参数是否合法 */
        if(first.getNo() == -1 || startNo < 1 || startNo > num) {
            System.err.println("当前参数不合法,无法进行计算");
            return;
        }
        // 辅助指针 helper
        Boy helper = first;
        while(true){
            if(helper.getNext() == first) break;
            helper = helper.getNext();
        }
        for (int j = 0; j < startNo-1; j++){
            first = first.getNext();
            helper = helper.getNext();
        }
        while(true){
            if(helper == first){
                System.err.println("最后出圈的是: " + first.getNo());
                break;
            }
            for (int i = 0; i < countNum-1; i++) {
                first = first.getNext();
                helper = first.getNext();
            }
            // 这是后first指向的小孩 出圈
            System.out.println(first.getNo()+" ");
            first = first.getNext();
            helper.setNext(first);
        }
    }

}