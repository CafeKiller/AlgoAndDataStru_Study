
/*
* 使用数组模拟一个栈
* */
public class ArrayStack {

    /*栈的最大容量*/
    private int maxSize;
    /*数组模拟栈*/
    private int[] stack;
    /*栈顶指针*/
    private int top = -1;


    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    /*判断栈是否已满*/
    public boolean isFull(){
        return this.top == (this.maxSize-1);
    }

    /* 判断栈是否已空 */
    public boolean isEmpty(){
        return this.top == -1;
    }

    /* 进行入栈操作 */
    public void push(int item){
        if (isFull()){
            System.err.println("当前栈已满,无法进行入栈操作,建议试试pop操作");
            return;
        }
        this.top++;
        stack[this.top] = item;
    }

    /* 进行出栈操作 */
    public int pop(){
        if (isEmpty()){
            System.err.println("当前栈为空,无法进行栈操作,可以试试push操作");
            return 0;
        }
        return stack[--this.top];
    }

    /* 遍历展示栈中的所有元素 */
    public void list(){
        if (isEmpty()){
            System.err.println("当前栈为空无法展示其中元素");
            return;
        }
        int temp = top;
        while(temp>=0){
            System.out.print(stack[temp--] + " ");
        }
        System.out.println();
    }
}
