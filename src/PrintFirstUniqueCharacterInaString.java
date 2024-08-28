import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintFirstUniqueCharacterInaString {
    public static void main(String[] args) {
        String input = "gyfdsdgsfhff";
        Character result =  input.chars()           // IntStream
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
                .entrySet().stream()                       // EntrySet stream
                .filter(entry -> entry.getValue() == 1)   // extracts characters with a count of 1
                .map(entry -> entry.getKey())              // get the keys of EntrySet
                .findFirst().get();
        System.out.println(result);
    }
}
