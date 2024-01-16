public class StringConstructors {
    public static void main(String[] args) {
        // Using string literal
        String s1 = "Hello, World!";

        // Using new keyword
        char[] charArray = {'J', 'a', 'v', 'a'};
        String s2 = new String(charArray);

        System.out.println(s1);
        System.out.println(s2);
    }
}