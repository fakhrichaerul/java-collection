package fakhri.chaerul.insan;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Comparator terbalik / Ascending
            }
        };

//        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator); //DESCENDING
        SortedMap<String, String> sortedMap = new TreeMap<>(); //ASCENDING

        sortedMap.put("Fakhri", "Fakhri");
        sortedMap.put("Budi", "Budi");
        sortedMap.put("Susi", "Susi");

        // Diurutkan Ascending berdasarkan keynya
        for(var key : sortedMap.keySet()){
            System.out.println(key);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

//        immutable.put("Fakhri", "Fakhri");
    }
}
