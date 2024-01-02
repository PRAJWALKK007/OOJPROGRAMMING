import java.util.Scanner;

abstract class Shape {
    int length;
    int breadth;

    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        System.out.println("Area of rectangle is " + (length * breadth));
    }
}

class Triangle extends Shape {
    void printArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of triangle: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        System.out.println("Area of triangle is " + (0.5 * length * breadth));
    }
}

class Circle extends Shape {
    void printArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        length = sc.nextInt();
        System.out.println("Area of circle is " + (3.14 * length * length));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape;
        shape = new Rectangle();
        shape.printArea();
        shape = new Triangle();
        shape.printArea();
        shape = new Circle();
        shape.printArea();
    }
}