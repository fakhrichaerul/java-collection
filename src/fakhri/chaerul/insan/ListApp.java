package fakhri.chaerul.insan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
//        List<String> strings = new LinkedList<>();

        strings.add("Fakhri");
        strings.add("Chaerul");
        strings.set(0, "Budi");
        strings.remove(0);

        System.out.println(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
