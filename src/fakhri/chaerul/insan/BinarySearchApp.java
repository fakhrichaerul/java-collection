package fakhri.chaerul.insan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(1000);

        for (int i = 0; i <= 1000; i++) {
            list.add(i);
        }

//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

        int index = Collections.binarySearch(list, 333);
        System.out.println(index);

        Comparator<Integer> reverseComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // reverse
            }
        };

        int index2 = Collections.binarySearch(list, 333);
        System.out.println(index2);
    }
}
