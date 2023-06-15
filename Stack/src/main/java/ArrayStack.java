
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





}
