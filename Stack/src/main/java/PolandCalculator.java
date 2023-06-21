import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* 使用逆波兰算法 设计计算器 */
public class PolandCalculator {

    public void fun1(){


        /* 中缀表达式 需要转为逆波兰(后缀)表达式 */
        String expression = "1+((2+3)*4)-5";



    }



    /* 将中缀表达式转换为对应的string集合 */
    public List<String> toInfixExpression(String s){

        List<String> list = new ArrayList<>();

        int i = 0;
        String str;
        char c;
        do {
            if ((c = s.charAt(i)) < 48 || (c = s.charAt(i)) < 57){
                list.add(c+" ");
                i++;
            }else{
                str = "";
                while(i < s.length() && (s.charAt(i) >= 48 && s.charAt(i) <= 57)){
                    str += c;
                    i++;
                }
                list.add(str);
            }
        }while(i < s.length());

        return list;
    }

    /* 将得到的中缀表达式中的list =》 后缀表达式的list */
    public List<String> parseSuffixExpressionList(List<String> list){

        Stack<String> stack = new Stack<>();

        List<String> arrList = new ArrayList<>();


        for (String item : list) {
            if(item.matches("\\d+")){
                arrList.add(item);
            } else if ("(".equals(item)) {
                stack.push(item);
            } else if (")".equals(item)) {
                while(!"(".equals(stack.peek())){
                    arrList.add(stack.pop());
                }
                stack.pop();
            }else{
                while(stack.size() !=0 && (Operation.getValue(item) <= Operation.getValue(stack.peek()))){
                    arrList.add(stack.pop());
                }
                stack.push(item);
            }
        }



        return arrList;

    }

}

class Operation{
    private static int ADD = 1;
    private static int SUB = 1;
    private static int MUL = 2;
    private static int DIV = 2;

    public static int getValue(String operation){
        int result = 0;
        switch(operation){
            case "+": result = ADD;break;
            case "-": result = SUB;break;
            case "*": result = MUL;break;
            case "/": result = DIV;break;
            default:
                System.err.println("不存在的运算符号");
        }
        return result;
    }
}