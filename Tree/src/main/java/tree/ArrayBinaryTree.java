package tree;


// 顺序存储二叉树
public class ArrayBinaryTree {

    private int[] arr; //存储数据节点的数组

    public ArrayBinaryTree(int[] arr) throws Exception {
        if (arr == null || arr.length == 0){
            System.err.println("初始化失败，数组为空");
            throw new Exception();
        }
        this.arr = arr;
    }

    public void proOrder(){
        this.proOrder(0);
    }

    public void proOrder(int idx){

        System.out.printf("当前元素是 '%d' \n",arr[idx]);

        // 向左递归遍历
        if ((idx*2+1) < arr.length){
            proOrder(2*idx+1);
        }

        // 向右递归遍历
        if ((idx*2+2) < arr.length){
            proOrder(2*idx+2);
        }

    }

}
