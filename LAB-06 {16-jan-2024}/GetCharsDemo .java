public class GetCharsDemo {
    public static void main(String[] args) {
        String sentence = "Welcome to Bmsce college";
        char[] target = new char[4];
        sentence.getChars(11, 15, target, 0);
        String extracted = new String(target);

        System.out.println("Extracted: " + extracted);
    }
}