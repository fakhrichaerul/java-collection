package fakhri.chaerul.insan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ImmutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Tunggal");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Fakhri");
        mutable.add("Chaerul");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Fakhri", "Chaerul", "insan");

//        elements.add("Budi"); *ERROR karna List.of adalah pengisian List yang immutable
    }
}
