import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfStringUsingStreamAPI {
    public static void main(String[] args) {
        String str = "I love Coding World";
        // create hashmap to store character occurrences
        HashMap<Character, Integer> hashMap = new HashMap<>();
        // create a map to store character occurrences using stream API
        Map<Character, Long> chars = str.chars()
                .mapToObj(c -> (char) Character.toLowerCase(c))
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(chars);
    }
}
