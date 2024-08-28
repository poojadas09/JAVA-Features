public class FindFirstInaString {
    public static void main(String[] args) {
        String str = "I love Coding World";
        str.chars()
                .filter(Character::isLetter)
                .mapToObj(character -> (char) Character.toLowerCase(character))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
