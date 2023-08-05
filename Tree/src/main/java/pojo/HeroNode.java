package pojo;

public class HeroNode {

    Integer no;
    String name;

    HeroNode left; // 左节点
    HeroNode right; // 右节点

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Integer getNo() {
        return no;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" + "no=" + no + ", name='" + name + '}';
    }

    /*前序遍历*/
    public void preOrder(){

        System.out.println(this);

        if (this != null && this.left != null){
            this.left.preOrder();
        }
        if (this != null && this.right != null){
            this.right.preOrder();
        }
    }

    /* 中序遍历 */
    public void infixOrder(){
        if (this != null && this.left != null){
            this.left.preOrder();
        }

        System.out.println(this);

        if (this != null && this.right != null){
            this.right.preOrder();
        }

    }

    /* 后序遍历 */
    public void postOrder(){
        if (this != null && this.left != null){
            this.left.preOrder();
        }

        if (this != null && this.right != null){
            this.right.preOrder();
        }

        System.out.println(this);
    }


    /* 前序查找 */
    public HeroNode preOrderSearch(Integer no){
        if (this != null){
            System.out.println(this.no);
        }
        // 当前节点
        if (this != null && this.no == no) return this;

        // 向左递归查找
        HeroNode resNode = null;
        if (this.left != null) resNode = this.left.preOrderSearch(no);
        if (resNode != null) return resNode;

        // 向右递归查找
        if (this.right != null) resNode = this.right.preOrderSearch(no);
        if (resNode != null) return resNode;

        return null;
    }

    /* 中序查找 */
    public HeroNode infixOrderSearch(Integer no){

        // 向左递归查找
        HeroNode resNode = null;
        if (this.left != null) resNode = this.left.infixOrderSearch(no);
        if (resNode != null) return resNode;


        if (this != null){
            System.out.println(this.no);
        }
        // 当前节点
        if (this != null && this.no == no) return this;


        // 向右递归查找
        if (this.right != null) resNode = this.right.infixOrderSearch(no);
        if (resNode != null) return resNode;

        return null;
    }

    /* 后序查找 */
    public HeroNode postOrderSearch(Integer no){

        // 向左递归查找
        HeroNode resNode = null;
        if (this.left != null) resNode = this.left.postOrderSearch(no);
        if (resNode != null) return resNode;


        // 向右递归查找
        if (this.right != null) resNode = this.right.postOrderSearch(no);
        if (resNode != null) return resNode;


        if (this != null){
            System.out.println(this.no);
        }
        // 当前节点
        if (this != null && this.no == no) return this;

        return null;
    }


    /**
     * @param no 需要删除的节点
     * */
    public boolean delNode(int no){

        // 如果当前的左节点不为空，且左节点就是需要删除的节点，那么就直接将left=null，表示删除，并结束方法。
        if (this.left != null && this.left.no == no){
            this.left = null;
            return true;
        }
        if (this.right != null && this.right.no == no){
            this.right = null;
            return true;
        }

        // 对左节点数进行递归删除
        if (this.left != null){
            return this.left.delNode(no);
        }

        if (this.right != null){
            return this.right.delNode(no);
        }

        return false;

    }


}
