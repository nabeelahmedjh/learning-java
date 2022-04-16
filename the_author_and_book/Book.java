package the_author_and_book;

public class Book {
    private Author author;
    private String isbn = null;
    private String name = null;
    private double price = 0;
    private int qty = 0;
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
        this.author = new Author(author.name, author.email);
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
        this.author = new Author(author.name, author.email);
        this.qty = qty;
    }

    public Author getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName () {
        return author.name;
    }

    public String toString() {
        return String.format("Book[isbn = %s, Author[name = %s, email = %s]], price = %s, qty = %s]",
                isbn, author.name, author.email, price, qty);
    }
}
