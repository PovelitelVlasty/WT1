package Laba1.classesAndObjects.Task12_14_15_16.utils;

/**
 * Book class
 */
public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    /**
     * Create a new instance of Book object
     * @param title - book title
     * @param author - book author
     * @param price - book price
     * @param isbn - isbn
     */
    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    /**
     * Get book title.
     * @return String - Title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Get book author.
     * @return String - Author
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Get book price.
     * @return int - Price
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * Get string representation
     * @return String
     */
    @Override
    public String toString() {
        return author + " \"" + title + "\" " + price + "$";
    }

    /**
     * Get hash code
     * @return int
     */
    @Override
    public int hashCode() {
        return author.hashCode() + title.hashCode();
    }

    /**
     * Check equality of this object to obj
     * @param obj - some object
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }

        Book book = (Book)obj;

        return ((this.title == book.title) &&
                (this.author == book.author) &&
                (this.price == book.price) &&
                (this.isbn == book.isbn));
    }

    /**
     * Clone object
     * @return Object
     */
    @Override
    public Object clone() {
        Book newBook = new Book(this.title, this.author, this.price, this.isbn);
        return newBook;
    }

    /**
     * Compare this instance of Book with another Book by isbn
     * @param book - book to compare
     * @return int
     */
    public int compareTo(Book book) {
        if (this.isbn == book.isbn) {
            return 0;
        }

        return (this.isbn < book.isbn) ? -1 : 1;
    }
}
