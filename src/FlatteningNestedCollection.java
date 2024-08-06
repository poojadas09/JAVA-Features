import java.util.*;
import java.util.stream.Collectors;
public class FlatteningNestedCollection {
    public static void main(String[] args) {
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(1, Arrays.asList("1", "2", "3"));
        map.put(2, Arrays.asList("4", "5", "6"));
        System.out.println(map);
        System.out.println(map.values().stream().flatMap(x -> x.stream()).collect(Collectors.toList()));
    }
}
