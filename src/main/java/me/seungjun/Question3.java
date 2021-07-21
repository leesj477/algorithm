package me.seungjun;

import java.util.Stack;

/**
 * 주어진 수식에 불필요한 괄호가 있지 않은지 확인하는 코드를 작성하라.
 *
 * 예) ((1 + 2)) + 3 => true (불필요한 괄호가 있다.)
 *
 * 예) 1 + (2 * 3) => false (산술적으로는 불필요하지만 이 문제에서는 이런 괄호는 유효하다고 가정한다.)
 *
 * 예) 1 + (2) * 3 => true (2를 감싸고 있는 괄호는 불필요하다.)
 */
public class Question3 {

    public static void main(String[] args) {

        String arr = "((1 + 2)) + 3";

        Question3 q = new Question3();

        System.out.println("result  = " +q.solution(arr));

    }

    private boolean solution(String arr) {

        Stack<Character> stack = new Stack<>();

        char[] arrs = arr.toCharArray();
        //닫는 괄호가 나왔을 때 스택에 사칙 연산 기호가 있는지 확인한다.
        for(int i=0;i<arrs.length;i++) {
            if (arrs[i] == '[' || arrs[i] == '{' || arrs[i] == '(' || arrs[i] == '+' || arrs[i] == '-' || arrs[i] == '*') {
                stack.push(arrs[i]);
            } else if (arrs[i] == ']' || arrs[i] == '}' || arrs[i] == ')') {
                if (stack.peek() == '(') {
                    return true;
                }
                while (stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop();
            }
        }
        return false;
    }


}
