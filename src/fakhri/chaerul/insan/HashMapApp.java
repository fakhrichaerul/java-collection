package fakhri.chaerul.insan;

import java.util.HashMap;

public class HashMapApp {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("name.first", "Fakhri");
        map.put("name.middle", "Chaerul");
        map.put("name.last", "Insan");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
}
