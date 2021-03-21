package fakhri.chaerul.insan;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {

    public static enum Level{
        FREE, PREMIUM, STANDARD, VIP
    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);

        map.put(Level.FREE, "Fakhri");
        map.put(Level.VIP, "Chaerul");

        for(Level key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
