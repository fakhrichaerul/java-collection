package fakhri.chaerul.insan;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Fakhri");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Fakhri");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Fakhri",
                "middle", "Caherul",
                "last", "Insan"
        );

//        map.put("nameBudi", "Budi"); //ERROR
    }
}
