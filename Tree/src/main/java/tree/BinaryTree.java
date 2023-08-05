package tree;

import pojo.HeroNode;

public class BinaryTree {

    HeroNode root; // 树的根结点

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    // 判断根节点是否为空
    public boolean isRootEmpty(){
        if (this.root == null) System.err.println("根节点为空，无法进行遍历");
        return this.root == null;
    }

    // 前序遍历
    public void preOrder(){
        if (!this.isRootEmpty()){
            this.root.preOrder();
        }
    }

    // 中序遍历
    public void infixOrder(){
        if (!this.isRootEmpty()){
            this.root.infixOrder();
        }
    }

    // 后序遍历
    public void postOrder(){
        if (!this.isRootEmpty()){
            this.root.postOrder();
        }
    }


    // 前序查找
    public HeroNode preOrderSearch(Integer no){
        if (!this.isRootEmpty()){

            HeroNode heroNode = this.root.preOrderSearch(no);
            if (heroNode == null){
                System.err.println("找不到");
                return null;
            }else{
                System.out.printf("找到了 %s \n",heroNode);
                return heroNode;
            }
        }
        return null;
    }

    // 中序查找
    public HeroNode infixOrderSearch(Integer no){
        if (!this.isRootEmpty()){

            HeroNode heroNode = this.root.infixOrderSearch(no);
            if (heroNode == null){
                System.err.println("找不到");
                return null;
            }else{
                System.out.printf("找到了 %s \n",heroNode);
                return heroNode;
            }
        }
        return null;
    }

    // 后序查找
    public HeroNode postOrderSearch(Integer no){
        if (!this.isRootEmpty()){

            HeroNode heroNode = this.root.postOrderSearch(no);
            if (heroNode == null){
                System.err.println("找不到");
                return null;
            }else{
                System.out.printf("找到了 %s \n",heroNode);
                return heroNode;
            }
        }
        return null;
    }

    public boolean delNode(int no){
        return this.root.delNode(no);
    }


}
