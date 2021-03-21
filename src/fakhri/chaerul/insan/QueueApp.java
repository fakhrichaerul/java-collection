package fakhri.chaerul.insan;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>(10); // Urutan FIFO
//        Queue<String> queue = new PriorityQueue<>(); // Urutan Ascending
//        Queue<String> queue = new LinkedList<>();


        queue.add("Fakhri");
        queue.add("Chaerul");
        queue.add("Insan");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
