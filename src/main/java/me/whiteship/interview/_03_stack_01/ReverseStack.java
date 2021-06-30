package me.whiteship.interview._03_stack_01;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        System.out.println(numbers);
        ReverseStack reverseStack = new ReverseStack();
//        numbers = reverseStack.solution(numbers);
        reverseStack.solution2(numbers);

        System.out.println(numbers);
    }

    // TODO 스택을 뒤집는 코드를 작성하라.
    private Stack<Integer> solution(Stack<Integer> stack) {
        Stack<Integer> reversed = new Stack<>();
        while(!stack.isEmpty()){
            reversed.push(stack.pop());
        }
        return reversed;
    }


    // TODO 재귀적인 방법으로 호출
    private void  solution2(Stack<Integer> stack) {
        if(stack.isEmpty()) return;

        int temp  = stack.pop();
        solution2(stack);
        insertAtBottom(stack,temp);

    }

    private void insertAtBottom(Stack<Integer> stack , int number){
        if(stack.isEmpty()){
            stack  .push(number);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack,number);
            stack.push(temp);
        }
    }


}
