package fakhri.chaerul.insan;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> satu = Collections.singleton("Satu");

//        Set<String> mutable = new LinkedHashSet<>(); // Element berurut
        Set<String> mutable = new HashSet<>(); // Element tidak berurut
        mutable.add("Fakhri");
        mutable.add("Chaerul");

        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Fakhri", "Chaerul");

//        set.add("Fakhri"); *ERROR
//        set.remove("Fakhri"); *ERROR

        System.out.println(set);
    }
}
