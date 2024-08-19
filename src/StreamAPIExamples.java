import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExamples {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,55,8988,44,2,4,57,7);
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        List<Integer> collect1 = collect.stream().map(x -> x / 2).collect(Collectors.toList());
        List<Integer> collect2 = list.stream()
                .filter(x -> x % 2 == 0) // filter even numbers
                .map(x -> x / 2) //
                .distinct()
                .sorted((a, b) -> b - a)
                .limit(4)
                .skip(1)
                //.peek(System.out::println)
                .collect(Collectors.toList());

       Long collect3 = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map(integer -> integer / 20)
                .distinct()
               // .max((o1, o2) -> o1-o2).get()
               .count(); // terminal operations -- min, max, count ,collect
        //System.out.println(collect3);


        List<Integer> list1 = Arrays.asList(1, 3, 4, 5, 5);
        Stream<Integer> integerStream = list1.parallelStream().filter(x -> x % 2 == 0);
        integerStream.forEach(System.out::println);
    }
}
