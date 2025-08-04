class Book {
    String title;
    int pages;

    // Default constructor
    Book() {
        title = "Unknown";
        pages = 0;
    }

    // Parameterized constructor
    Book(String t, int p) {
        title = t;
        pages = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Pages: " + pages);
    }
}

public class thirtyseventh {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", 350);

        b1.display();
        b2.display();
    }
}
