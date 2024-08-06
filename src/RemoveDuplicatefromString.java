import java.util.HashSet;

public class RemoveDuplicatefromString {
    public static void main(String[] args) {
        String inputString = "I love coding world";
        StringBuilder str = new StringBuilder();
        HashSet<Character> hashset = new HashSet<>();
        for (char ch : inputString.toCharArray()) {
            if (hashset.add(ch)) {
                str.append(ch);
            }
        }
        System.out.println(inputString);
        System.out.println(str);
    }
}
