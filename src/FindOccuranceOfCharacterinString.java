import java.util.*;
import java.util.stream.Collectors;

public class FindOccuranceOfCharacterinString {
    public static void main(String[] args) {
        String str = "I love Coding World";
        // create hashmap to store character occurrences
        HashMap<Character, Integer> hashMap = new HashMap<>();
        // convert the string to character array to iterate
        for (char ch : str.toCharArray()) {
            // convert each character to lowercase
            ch = Character.toLowerCase(ch);
            // check if the character is a letter
            if (Character.isLetter(ch)) {
                // add or update the count in the hashmap
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
        }
        System.out.println(hashMap);
    }
}
