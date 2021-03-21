package fakhri.chaerul.insan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Fakhri", "Chaerul", "Insan", "Budi", "Susi"));

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);

        System.out.println("COPY LIST");
        List<String> list2 = new ArrayList<>(list); // MASUKAN LISTFROM DI METHODNYA AGAR PUNYA PROPERTIES YANG SAMA

//        Collections.copy(list2, list);

        System.out.println(list2);
    }
}
