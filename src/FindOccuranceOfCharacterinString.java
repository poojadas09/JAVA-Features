import java.util.*;

public class FindOccuranceOfCharacterinString {
    public static void main(String[] args) {
        String str = "I love Coding World";
        HashSet<Character> hashSet = new HashSet<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if (hashSet.add(ch)) {
                hashMap.put(ch, 1);
            } else {
                int count = hashMap.get(ch);
                hashMap.put(ch, ++count);
            }
        }
        System.out.println(hashMap);
    }
}
