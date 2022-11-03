import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class DemoCreation {
    public static void main(String[] args) {
        Stream<String> streamEmpty = Stream.empty();
        System.out.println(streamEmpty == null);

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        streamOfCollection.forEach(coll -> System.out.print(coll));
    }
}
