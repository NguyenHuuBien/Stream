import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class DemoPrimitive {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3).forEach(System.out::println);
        DoubleStream.of(1, 2, 3).forEach(System.out::println);
        LongStream.range(1, 4).forEach(System.out::println);

        //array
        String[] languages = { "Java", "C#", "C++", "PHP", "Javascript" };
        Stream<String> testStream1 = Arrays.stream(languages);
        testStream1.forEach(x -> System.out.print(x));
        System.out.println();

        //arraylist
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C#");
        items.add("C++");
        items.add("PHP");
        items.add("Javascript");
        items.stream().forEach(item -> System.out.print(item));
        System.out.println();

        //Builder

        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

        // stream sang cau truc dư lieu khac
        Stream<String> stream = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
        String[] languages1 = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(languages1));
    }
}
