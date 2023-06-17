
/*
* 使用栈模拟一个计算器
* */
public class StackCalculator {

    /* 表达式 */
    String expression = "7*2*2-5+1-5+3-4";



    /*需要使用到两个栈 数栈 和 运算符栈*/
    ArrStack numStack = new ArrStack(10);
    ArrStack operStack = new ArrStack(10);

    int index = 0;  // 扫描指针,用于对表达式进行扫描
    int num1 = 0;   // 参与计算的数字1
    int num2 = 0;   // 参与计算的数字2
    int oper = 0;   // 参与计算的运算符号
    int res = 0;    // 计算结果
    char ch = ' ';  // 每次扫描表达式时, 数字/运算符号 临时保存在此
    String keepNum = "";    // 用于拼接多位数

    public void setExpression(String expression) {
        this.expression = expression;
    }
    public String getExpression() {
        return expression;
    }

    public void fun1(){

        while(true){

            // 一依次获取表达式中每一个数字/运算符号
            ch = expression.substring(index, index+1).charAt(0);

            // 判断字符是否是运算符号/数字 并做出不同处理
            if(operStack.isOper(ch)){
                // 判断当前符号栈是否为空
                if (!operStack.isEmpty()){

                    // 判断当前符号栈中是否存在符号, 如果存在就需要先进行比较
                    if (operStack.priority(ch) <= operStack.priority(operStack.peak())){
                        /*
                        * 进入这里表示当前运算符号的优先级小于或等于 当前符号栈顶的运算符
                        * 1、需要从数栈中取出两个数字, 再从符号栈中获取一个符号
                        * 2、进行运算, 将计算结果重新入数栈, 当前的运算符则入符号栈
                        * */
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1,num2,oper);
                        // 计算结果入数栈
                        numStack.push(res);
                        // 运算符号入符号栈
                        operStack.push(ch);
                    }else {
                        /*
                        * 表示当前元素符号大于栈中的运算符
                        * 直接入栈即可
                        * */
                        operStack.push(ch);
                    }

                }else{
                    // 当前符号栈为空 直接入栈即可
                    operStack.push(ch);
                }

            }else{  /* 扫描到数字,直接入数栈即可(注意此时只是字符,还不是真正的数字) */

                // 处理多位数
                keepNum += ch;

                // 如果当前扫描符号为表达式中最后的符号, 即可直接入栈
                if (index == expression.length()-1){
                    numStack.push(ch-48);
                }else {
                    // 判断下一个符号是不是数字, 是就继续扫描, 如果不是数字而是运算符号 则入栈
                    // 只是查看后一位,不可以进行index++操作
                    if (operStack.isOper( expression.substring(index+1, index+2).charAt(0) ) ){
                        // 后一位为数字,入数栈
                        numStack.push(Integer.parseInt(keepNum));
                        // 必须要对keepNum进行清空
                        keepNum = "";
                    }
                }

            }
            // 让扫描指针向后移动一位
            index++;
            // 表示扫描到表达式的最后一位
            if(index >= expression.length()){
                break;
            }


        }

        while(true){

            if (operStack.isEmpty()){
                break;
            }

            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.cal(num1, num2, oper);
            numStack.push(res);

        }
        System.err.println(expression + " = " + res);

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