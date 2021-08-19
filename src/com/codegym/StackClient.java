package com.codegym;

public class StackClient {
    public static void main(String[] as) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);

        System.out.println("Danh Sách vừa tạo là: ");
        stack.showStack();

        System.out.println();
        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        stack.pop();

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
        stack.showStack();

        stack.push(0);
        stack.push(-1);
        System.out.println();
        stack.showStack();
    }
}
