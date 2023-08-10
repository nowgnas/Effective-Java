package chapter5.generic;

import java.util.Stack;

public class GenericStack<E> {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String arg :
                args) {
            stack.push(arg);
        }
    }
}
