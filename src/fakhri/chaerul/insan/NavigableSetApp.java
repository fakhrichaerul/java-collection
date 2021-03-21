package fakhri.chaerul.insan;


import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Fakhri", "Chaerul", "Insan", "Belajar", "Java", "Collection"));

        // Set diurut berdasarkan urutan descendint Z-A
        NavigableSet<String> descendingNames = names.descendingSet();
                                                    // Inclusive berarti memasukan toElementnya juga
        NavigableSet<String> headSetNames = names.headSet("Fakhri", true);

        NavigableSet<String> tailSetNames = names.tailSet("Collection", true);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("DESCENDING");

        for (String descendingName : descendingNames) {
            System.out.println(descendingName);
        }

        System.out.println("FIND HEADSET COLLECTIONS OF NAMES");

        for (String headName : headSetNames) {
            System.out.println(headName);
        }

        System.out.println("FIND TAILSET COLLECTIONS OF NAMES");

        for (String tailSetName : tailSetNames) {
            System.out.println(tailSetName);
        }

    }
}
