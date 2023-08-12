package tree;

import pojo.HeroNode;
import pojo.NewHeroNode;

// 线索化二叉树
public class ThreadedBinaryTree extends BinaryTree {

    private NewHeroNode root;
    /*
    * 为了实现线索化,需要创建要给指向当前节点的前驱节点的指针
    * 在递归进行线索化时,pre 总是保留前一个节点
    * */
    private NewHeroNode pre;

    public void setRoot(NewHeroNode root) {
        this.root = root;
    }

    /**
     * 遍历线索化二叉树
     * */
    public void threadedList(){
        NewHeroNode node = root;

        while(node != null){
            while(node.getLeftType() == 0){
                node = node.getLeft();
            }

            System.out.println("当前节点是" + node);
            while(node.getRightType() == 1){
                // 获取当前节点的后继节点
                node = node.getRight();
                System.out.println(node);
            }
            node = node.getRight();
        }
    }

    public void threadedNodes(){
        this.threadedNodes(root);
    }

    /**
     * 对二叉树进行中序线索化的方法
     *
     * @param node 就是当前需要线索化的结点
     */
    public void threadedNodes(NewHeroNode node) {

        //如果node==null, 不能线索化
        if (node == null) {
            return;
        }

        //(一)先线索化左子树
        threadedNodes(node.getLeft());
        //(二)线索化当前结点[有难度]

        //处理当前结点的前驱结点
        //以8结点来理解
        //8结点的.left = null , 8结点的.leftType = 1
        if (node.getLeft() == null) {
            //让当前结点的左指针指向前驱结点
            node.setLeft(pre);
            //修改当前结点的左指针的类型,指向前驱结点
            node.setLeftType(1);
        }

        //处理后继结点
        if (pre != null && pre.getRight() == null) {
            //让前驱结点的右指针指向当前结点
            pre.setRight(node);
            //修改前驱结点的右指针类型
            pre.setRightType(1);
        }
        //!!! 每处理一个结点后，让当前结点是下一个结点的前驱结点
        pre = node;

        //(三)在线索化右子树
        threadedNodes(node.getRight());


    }


}
