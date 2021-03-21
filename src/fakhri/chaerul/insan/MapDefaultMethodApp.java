package fakhri.chaerul.insan;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Fakhri", "Fakhri Value");
        map.put("Budi", "Budi Value");
        map.put("SUsi", "SUsi Value");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

    }
}
