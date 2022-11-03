import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class DemoComparison {
    public static void main(String[] args) {
        //sorted
        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        list.stream().sorted().forEach(System.out::print);
        System.out.println();
        //max
        Integer maxNumber = list.stream()
                .max((i, j) -> i.compareTo(j)).get();
        System.out.println(maxNumber);
        //min
        Integer minNumber = list.stream()
                .min((i, j) -> i.compareTo(j)).get();
        System.out.println(minNumber);
        //average
        IntStream intStream = IntStream.of(15, 13, 45, 18, 89, 70, 76, 56);
        OptionalDouble res = intStream.average();
        System.out.println(res);
    }
}
