package fakhri.chaerul.insan;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>(); // Diurut kan berdasarkan urutan pemasukan data

        map.put("first", "Fakhri");
        map.put("last", "Insan");
        map.put("middle", "Chaerul");

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key);
        }
    }
}
