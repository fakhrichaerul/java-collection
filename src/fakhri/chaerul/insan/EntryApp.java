package fakhri.chaerul.insan;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Fakhri", "Fakhri Value");
        map.put("Chaerul", "Chaerul Value");
        map.put("Insan", "Insan Value");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
