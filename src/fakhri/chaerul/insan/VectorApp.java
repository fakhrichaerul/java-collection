package fakhri.chaerul.insan;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> listVector = new Vector<>();

        listVector.add("Fakhri");
        listVector.add("Chaerul");
        listVector.add("Insan");

        for(var element : listVector) {
            System.out.println(element);
        }
    }
}
