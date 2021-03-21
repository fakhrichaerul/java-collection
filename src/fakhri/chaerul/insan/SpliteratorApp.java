package fakhri.chaerul.insan;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {

        List<String> list = List.of("Fakhri", "Chaerul", "Insan", "Budi", "Susi", "Tono");

        Spliterator<String> spliterator = list.spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();
//        Spliterator<String> spliterator3 = spliterator2.trySplit();


        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator2.estimateSize());
//        System.out.println(spliterator3.estimateSize());

        spliterator.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
