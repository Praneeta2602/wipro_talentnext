package oops_Inheritance;

class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public void displayAuthorDetails() {
        System.out.println("Author Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
    }
}

// Book class
class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public void displayBookDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + qtyInStock);
        System.out.println("Author Details:");
        author.displayAuthorDetails();
    }
}

// Main class
public class Encapsulation {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');

        // Create a Book object
        Book book = new Book("Harry Potter and the Philosopher's Stone", author, 699.99, 50);

        // Print all details of the book (including author)
        book.displayBookDetails();
    }
}
