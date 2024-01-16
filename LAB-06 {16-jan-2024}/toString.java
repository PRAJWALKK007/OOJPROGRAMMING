class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}
public class ToStringDemo {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        System.out.println(student); // Calls toString()
    }
}