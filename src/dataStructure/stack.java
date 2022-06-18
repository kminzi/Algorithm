package dataStructure;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<Character>();

        stack1.add('[');
        stack1.add(']');

        System.out.println(stack1.peek()==']');


    }
}
