import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DemoOperations {
    public static void main(String[] args) {
        //forEach
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C#");
        items.add("C++");
        items.add("PHP");
        items.add("Javascript");
        items.stream().forEach(item -> System.out.print(item));
        System.out.println();

        //filter, limit
        Stream.iterate(1, count -> count + 1) //
                .filter(number -> number % 3 == 0) //
                .limit(6) //
                .forEach(System.out::println);

        // skip, limit
        items.stream() //
                .skip(1) //
                .limit(3) //
                .forEach(System.out::print); // C#C++PHPJs
        System.out.println();


        items.stream() //
                .map(String::toUpperCase) // convert each element to upper case
                .forEach(System.out::println);

    }
}
