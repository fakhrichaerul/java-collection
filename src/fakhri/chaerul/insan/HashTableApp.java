package fakhri.chaerul.insan;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("Fakhri", "Fakhri Value");
        map.put("Budi", "Budi Value");
        map.put("Susi", "Susi Value");

        for(String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
