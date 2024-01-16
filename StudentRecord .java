public class StudentRecord {
    private String name;
    private double cgpa;

    // Default constructor
    public StudentRecord() {
        name = "John Doe";
        cgpa = 0.0;
    }

    // Parameterized constructor
    public StudentRecord(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }
}
public void display() {
    System.out.println("Name: " + name);
    System.out.println("CGPA: " + cgpa);
}
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        String message = sb.toString();
        System.out.println(message); // Output: Hello world
    }
}