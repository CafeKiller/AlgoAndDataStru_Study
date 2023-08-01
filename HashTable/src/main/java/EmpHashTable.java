public class EmpHashTable {

    private EmpLinkedList[] empLinkedListArray;

    private int size = 10;


    public EmpHashTable(int size){
        this.size = size;
        empLinkedListArray = new EmpLinkedList[size];
        for (int i = 0; i < empLinkedListArray.length; i++) {
            empLinkedListArray[i] = new EmpLinkedList();
        }
    }

    // 添加雇员
    public void add(Emp emp){
        int no = hashFunc(emp.id);
        empLinkedListArray[no].add(emp);
    }

    // 遍历散列表
    public void list(){
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i].list(i);
        }
    }

    // 根据输入id，查询雇员
    public void findEmpById(int id){
        int no = hashFunc(id);
        Emp emp = empLinkedListArray[no].findEmpById(id);
        if (emp != null){
            System.out.printf("在第%d条链表中 找到了雇员 id=%d\n",no+1,id);
        } else {
            System.out.println("在哈希表内未找到该雇员");
        }
    }


    // 编写一个简单的散列函数
    public int hashFunc(int id){
        return id % size;
    }




}
