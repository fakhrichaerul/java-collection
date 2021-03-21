package fakhri.chaerul.insan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collections = new ArrayList<>();

        collections.add("Fakhri");
        collections.add("Chaerul");
        collections.add("Insan");
        collections.addAll(List.of("Belajar", "Java", "Collection"));

        for (String collection : collections) {
            System.out.println(collection);
        }

        System.out.println("REMOVE");

        collections.remove("Insan");
        collections.removeAll(List.of("Belajar", "Java"));

        for (String collection : collections) {
            System.out.println(collection);
        }

        System.out.println(
                collections.contains("Chaerul")
        );

        System.out.println(
                collections.containsAll(List.of("Fakhri", "Java"))
        );

        System.out.println(
                collections.size()
        );

    }
}
