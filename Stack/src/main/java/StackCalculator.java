
/*
* 使用栈模拟一个计算器
* */
public class StackCalculator {

    /* 表达式 */
    String expression = "7*2*2-5+1-5+3-4";

    /*需要使用到两个栈 数栈 和 运算符栈*/
    ArrStack numStack = new ArrStack(10);
    ArrStack operStack = new ArrStack(10);

    int index = 0;
    int num1 = 0;
    int num2 = 0;
    int oper = 0;
    int res = 0;
    char ch = ' ';
    String keepNum = "";

    public void fun1(){
        while(true){
            ch = expression.substring(index, index+1).charAt(0);

        }
    }



}


class ArrStack extends ArrayStack{
    public ArrStack(int maxSize) {
        super(maxSize);
    }

    // 查看栈顶的值,不进行出栈操作
    public int peak(){
        if (isEmpty()){
            System.err.println("当前栈为空");
            return -1;
        }
        return this.stack[this.top];
    }

    // 返回运算符的优先级, 返回值越大优先级越高
    public int priority(int oper){
        //java中是允许int和char进行比较的
        if(oper == '*' || oper == '/'){
            return 1;
        }else if(oper == '+' || oper == '-'){
            return 0;
        }else {
            return -1;
        }
    }

    // 判断是否为运算符
    public boolean isOper(char val){
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    /**
     * 计算方法
     * @param numA 参与运算的前一位数字
     * @param numB 参与运算的后一位数字
     * @param oper 运算符号
     * @return 两个数字相互运算后的结果
     * */
    public int cal(int numA, int numB,int oper){
        switch (oper){
            case '+': return numA + numB;
            case '-': return numB - numA;
            case '*': return numA * numB;
            case '/': return numB / numA;
        }
        return 0;
    }

}