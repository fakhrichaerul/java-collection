package fakhri.chaerul.insan;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

//        Set<String> names = new HashSet<>(); // Elementnya tidak berurut
        Set<String> names = new LinkedHashSet<>();  // Elemantnya berurut
        names.add("Fakhri");
        names.add("Chaerul");
        names.add("insan");
        names.add("Fakhri");
        names.add("Chaerul");
        names.add("insan");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
