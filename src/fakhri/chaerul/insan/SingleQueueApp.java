package fakhri.chaerul.insan;

import fakhri.chaerul.insan.collection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new SingleQueue<>();
        System.out.println(queue.size());

        System.out.println(queue.offer("Fakhri"));
        System.out.println(queue.offer("Chaerul"));
        System.out.println(queue.offer("Insan"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
