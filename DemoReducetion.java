import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoReducetion {
    public static void main(String[] args) {
        int product = IntStream.range(2, 8)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(-1);
        System.out.println("The product is : " + product);

        List<Character> list = Arrays.asList('D', 'e', 'm', 'o');
        String str = list.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println("Concatenated = "+str);

        List<Integer> integerList = Arrays.asList(23, 23, 8);
        System.out.println("Contents of the list - " + integerList);
        Stream<Integer> integerStream = integerList.stream();
        IntSummaryStatistics intSummaryStatistics = integerStream.collect(Collectors.summarizingInt(e -> e));
        System.out.println("Summary statistics of the stream - " + intSummaryStatistics);
    }
}
