public class Stringequals {
    public static void main(String[] args) {
        String str = "Java";
        String str1 = new String("Java");
        if (str.equals(str1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
