package fakhri.chaerul.insan;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        // Navigable Map adalah turunan dari Sorted Map
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Fakhri", "Fakhri");
        map.put("Chaerul", "Chaerul");
        map.put("Insan", "Insan");
        map.put("Budi", "Budi");
        map.put("Susi", "Susi");

        for(var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("METHOD NAVIGABLE MAP");
        System.out.println(map.lowerKey("Fakhri"));
        System.out.println(map.higherKey("Fakhri"));
        System.out.println(map.floorKey("Zaza"));
        System.out.println(map.ceilingKey("Zaza"));

        System.out.println("MAP DESCENDING");

        NavigableMap<String, String> mapDesc = map.descendingMap();

        for(String key : mapDesc.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

//        immutable.put("Udin", "Udin"); // ERROR karna Immutable
    }
}
