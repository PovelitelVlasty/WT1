package Laba1.classesAndObjects.Task13.utils;

/**
 * Book class
 */
public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    /**
     * Create a new instance of Book object
     * @param title - book title
     * @param author - book author
     * @param price - book price
     * @param isbn - isbn
     */
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
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

        return ((this.title.equals(book.title)) &&
                (this.author.equals(book.author)) &&
                (this.price == book.price));
    }

    /**
     * Clone object
     * @return Object
     */
    @Override
    public Object clone() {
        Book newBook = new Book(this.title, this.author, this.price);
        return newBook;
    }
}
