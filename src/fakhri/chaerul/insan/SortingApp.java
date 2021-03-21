package fakhri.chaerul.insan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(List.of("Fakhri","Chaerul", "Insan", "Budi", "Susi"));

        System.out.println("SORTED");

        Collections.sort(list);

        for(String element : list) {
            System.out.println(element);
        }

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // REVERSED
            }
        };

        System.out.println("REVERSED");

        Collections.sort(list, reverse);

        for(String element : list) {
            System.out.println(element);
        }
    }
}
