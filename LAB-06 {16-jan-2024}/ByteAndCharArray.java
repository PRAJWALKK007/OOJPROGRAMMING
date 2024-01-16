public class ByteAndCharArrayDemo {
    public static void main(String[] args) {
        String text = "Hello, World!";
        byte[] bytes = text.getBytes();
        char[] chars = text.toCharArray();

        System.out.println("Bytes: " + new String(bytes));
        System.out.println("Chars: " + new String(chars));
    }
}