package pojo;

public class NewHeroNode extends HeroNode{

    /*
    * leftType/rightType ==0 表示指向的是左/右子树, 如果 ==1 则表示指向前驱/后续节点
    * */
    private int leftType;
    private int rightType;

    private NewHeroNode left;
    private NewHeroNode right;

    public NewHeroNode(int no, String name) {
        super(no, name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    public NewHeroNode getLeft() {
        return left;
    }

    public void setLeft(NewHeroNode left) {
        this.left = left;
    }

    public NewHeroNode getRight() {
        return right;
    }

    public void setRight(NewHeroNode right) {
        this.right = right;
    }
}
