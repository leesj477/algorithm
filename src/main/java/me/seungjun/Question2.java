package me.seungjun;

import java.util.Stack;

/**
 * 문제 1. 괄호 수식과 여는 괄호의 위치가 주어졌을 때 그에 대응하는 닫힌 괄호의 위치를 찾는 코드를 작성하라.
 *
 * 예) [{1+2*(2+2)}-(1-3)], 1   => 11 (‘{‘에 대응하는 ‘}’가 11번째 위치에 있다.
 */
public class Question2 {

    public static void main(String[] args) {
        // {
        String arr = "[{1+2*(2+2)}-(1-3)]";
        int  index = 1;
        int result = findIndextomath(arr,index);
        int result2 = findIndextoStack(arr,index);
        System.out.println("result = " + result);
        System.out.println("result = " + result2);



    }

    private static int findIndextoStack(String matharray, int index) {

        Stack<Character> stack = new Stack<>();

        char[] chars = matharray.toCharArray();

        stack.push(chars[index]);

        char[] open = "{[(".toCharArray();
        char[] close = "}])".toCharArray();

        //}()]

        // i = index + 1 이 포인트...
        for (int i = index + 1; i < chars.length; i++) {
            char c = chars[i];
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')'){

                for(int j=0;j<3;j++){
                    if(c == close[j] && open[j] != stack.peek()){
                        return -1;
                    }
                }
                stack.pop();

                if(stack.isEmpty()) return i;
            }



        }



        return -1;
    }


    private static int findIndextomath(String matharray,int index){

        char[] chars = matharray.toCharArray();

        char findBrackets = chars[index];
        char findValue = '\0';
        if(findBrackets == '('){
            findValue = ')';
        } else if  (findBrackets == '{'){
            findValue = '}';
        } else if  (findBrackets == '[') {
            findValue = ']';
        }

        for (int i = 0; i < chars.length; i++) {
            if(findValue == chars[i]){
                return i;
            }
        }

        return -1;
    }


}
