import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysToCreateStream {
    public static void main(String[] args) {
        // Collection List to stream
        List<String> list = Arrays.asList("apple", "banana", "orange");
        Stream<String> stream = list.stream();

        // Array to Stream
        String[] array = {"apple", "banana", "banana", "orange"};
        Stream<String> stream1 = Arrays.stream(array);

        // Directly using values
        // Alt+Ctrl+V
        Stream<Integer> stream12 = Stream.of(1, 2, 3);

        // Using Iterate from 0 to i limit 5
        Stream<Integer> stream3 = Stream.iterate(0, i -> i + 1).limit(5);

        // Using generate method and limit
        Stream<Integer> stream4 = Stream.generate(() -> (int) Math.random() * 100).limit(5);
        
    }
}
