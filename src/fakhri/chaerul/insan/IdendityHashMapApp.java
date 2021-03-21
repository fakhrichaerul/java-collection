package fakhri.chaerul.insan;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdendityHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String first = "first";
        String key2 = name+"."+first;

        System.out.println(key1.equals(key2)); // Membandingkan hasil value
        System.out.println(key1 == key2); // Membandingkan identity memory / identitas referensi

        map.put(key1, "Fakhri");
        map.put(key2, "Fakhri");

        System.out.println(map.size());
    }
}
