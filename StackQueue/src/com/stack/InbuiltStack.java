package com.stack;

public class InbuiltStack {
    public static void main(String[] args) throws Exception {
        //FILO
//        Stack<Integer> stack = new Stack<>();
//        stack.push(5);
//        stack.push(10);
//        stack.push(21);
//        stack.push(3);
//        stack.push(2);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        //Custom stack
//        CustomStack stack = new CustomStack(5);
//        stack.push(5);
//        stack.push(10);
//        stack.push(21);
//        stack.push(3);
//        stack.push(2);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        //Dynamic stack - no size limit
        DynamicStack stack = new DynamicStack(5);
        stack.push(5);
        stack.push(10);
        stack.push(21);
        stack.push(3);
        stack.push(2);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
