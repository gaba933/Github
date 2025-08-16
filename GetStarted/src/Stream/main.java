package Stream;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
//        var value1 = Stream.generate(() -> new Random().nextInt())
//                .limit(5)
//                .toArray(Integer[]::new);
//
//        for (var v : value1) {
//            System.out.println(v);
//        }
//
//        var value2 = IntStream.generate(() -> new Random().nextInt())
//                .limit(5)
//                .toArray();
//
//        for (var v : value2) {
//            System.out.println(v);
//        }

        var value = Stream.of("joao", "gabriel", "juan")
                .filter(x -> !x.equals("joao"))
                .toList();

        var value2 = Stream.of("joao", "maria", "pedro")
                .filter(x -> x.endsWith("o"))
                .toList();


        System.out.println(value);

    }
}
