import pojo.HeroNode;
import tree.ArrayBinaryTree;
import tree.BinaryTree;

public class TreeMain {

    public static void main(String[] args) {
        testArrayBinaryTree();
    }


    public static void testSimpleBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();

        HeroNode heroNode1 = new HeroNode(1,"宋江");
        HeroNode heroNode2 = new HeroNode(3,"张三");
        HeroNode heroNode3 = new HeroNode(4,"李四");
        HeroNode heroNode4 = new HeroNode(66,"王五");
        HeroNode heroNode5 = new HeroNode(88,"赵老六");
        HeroNode heroNode6 = new HeroNode(99,"哈哈哈");


        heroNode1.setLeft(heroNode2);
        heroNode1.setRight(heroNode3);
        heroNode3.setLeft(heroNode4);
        heroNode3.setRight(heroNode5);
        heroNode5.setLeft(heroNode6);

        binaryTree.setRoot(heroNode1);

        /*System.out.println("前序遍历");
        binaryTree.preOrder();

        System.out.println("中序遍历");
        binaryTree.infixOrder();

        System.out.println("后序遍历");
        binaryTree.postOrder();*/

        /*System.out.println("前序查找");
        binaryTree.preOrderSearch(3);

        System.out.println("中序查找");
        binaryTree.infixOrderSearch(88);

        System.out.println("后序查找");
        binaryTree.postOrderSearch(111);*/

        boolean isDel = binaryTree.delNode(66);
        if (isDel){
            System.out.println("删除成功");
            binaryTree.preOrder();
        }else {
            System.out.println("删除失败");
            binaryTree.preOrder();
        }
    }

    public static void testArrayBinaryTree(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        ArrayBinaryTree arrayBinaryTree;
        try {
            arrayBinaryTree = new ArrayBinaryTree(arr);
            arrayBinaryTree.proOrder();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
