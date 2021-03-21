package fakhri.chaerul.insan;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Fakhri");
        stack.push("Chaerul");
        stack.push("Insan");

        for(var item = stack.pop(); item != null; item = stack.pop()) {
            System.out.println(item);
//            System.out.println(stack); // melihat stack arraynya
        }

    }
}
