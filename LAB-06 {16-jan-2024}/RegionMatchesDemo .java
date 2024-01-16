public class RegionMatchesDemo {
    public static void main(String[] args) {
        String fullString = "Welcome to Bmsce College of Engineering";
        String target = "Bmsce college";

        if (fullString.regionMatches(true, 11, target, 0, target.length())) {
            System.out.println("Substring is matched.");
        } else {
            System.out.println("Substring is not matched.");
        }
    }
}