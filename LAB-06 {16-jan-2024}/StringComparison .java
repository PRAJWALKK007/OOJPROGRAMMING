public class StringComparison {
    public static void main(String[] args) {
        String bmsce = "Bmsce";
        System.out.println(bmsce.equals("Bmsce")); // true
        System.out.println(bmsce.equals("College")); // false
        System.out.println(bmsce.equals("BMSCE")); // false
        System.out.println(bmsce.equalsIgnoreCase("BMSCE")); // true
    }
}