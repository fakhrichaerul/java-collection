package fakhri.chaerul.insan;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stacks = new LinkedList<>();

        stacks.offerFirst("Fakhri");
        stacks.offerFirst("Chaerul");
        stacks.offerFirst("Insan");

        for (String stack : stacks) {
            System.out.println(stack);
        }

        System.out.println(stacks.pollLast());
        System.out.println(stacks.pollLast());
        System.out.println(stacks.pollLast());

        Deque<String> deque = new LinkedList<>();
        deque.offerLast("Fakhri");
        deque.offerLast("Chaerul");
        deque.offerLast("Insan");

        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
    }
}
