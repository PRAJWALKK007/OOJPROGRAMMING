import java.util.Scanner;

class Book {
    String name;
    String author;
    int price;
    int numPages;

    public Book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        String name, author, price, numPages;

        name = "Book name: " + this.name + "\n";
        author = "Author name: " + this.author + "\n";
        price = "Price: " + this.price + "\n";
        numPages = "Number of pages: " + this.numPages + "\n";

        return name + author + price + numPages;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        String name;
        String author;
        int price;
        int numPages;

        System.out.println("Enter the number of books: ");
        n = s.nextInt();

        Book[] b = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of the book: ");
            name = s.next();

            System.out.println("Enter author of the book: ");
            author = s.next();

            System.out.println("Enter the price of the book: ");
            price = s.nextInt();

            System.out.println("Enter the number of pages of the book: ");
            numPages = s.nextInt();

            b[i] = new Book(name, author, price, numPages);
        }

        for (int i = 0; i < n; i++) 
	{
            System.out.println(b[i].toString());
        }
    }
}
