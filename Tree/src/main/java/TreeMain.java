import pojo.HeroNode;
import pojo.NewHeroNode;
import tree.ArrayBinaryTree;
import tree.BinaryTree;
import tree.ThreadedBinaryTree;

public class TreeMain {

    public static void main(String[] args) {

        // testSimpleBinaryTree();

        // testArrayBinaryTree();

        testThreadedBinaryTree();
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

    public static void testThreadedBinaryTree(){
        //测试一把中序线索二叉树的功能
        NewHeroNode root = new NewHeroNode(1, "tom");
        NewHeroNode node2 = new NewHeroNode(3, "jack");
        NewHeroNode node3 = new NewHeroNode(6, "smith");
        NewHeroNode node4 = new NewHeroNode(8, "mary");
        NewHeroNode node5 = new NewHeroNode(10, "king");
        NewHeroNode node6 = new NewHeroNode(14, "dim");

        //二叉树，后面我们要递归创建, 现在简单处理使用手动创建
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);

        //测试中序线索化
        ThreadedBinaryTree threadedBinaryTree = new ThreadedBinaryTree();
        threadedBinaryTree.setRoot(root);
        threadedBinaryTree.threadedNodes();

        //测试: 以10号节点测试
        HeroNode leftNode = node5.getLeft();
        HeroNode rightNode = node5.getRight();
        System.out.println("10号结点的前驱结点是 =" + leftNode); //3
        System.out.println("10号结点的后继结点是=" + rightNode); //1

        //当线索化二叉树后，能在使用原来的遍历方法
        //threadedBinaryTree.infixOrder();
        System.out.println("使用线索化的方式遍历 线索化二叉树");
        threadedBinaryTree.threadedList(); // 8, 3, 10, 1, 14, 6
    }

}
