package Laba1.classesAndObjects.Task13.utils;


public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    public String getTitle() {
        return this.title;
    }

    
    public String getAuthor() {
        return this.author;
    }

    
    public int getPrice() {
        return this.price;
    }

    
    @Override
    public String toString() {
        return author + " \"" + title + "\" " + price + "$";
    }

    
    @Override
    public int hashCode() {
        return author.hashCode() + title.hashCode();
    }

    
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

    
    @Override
    public Object clone() {
        Book newBook = new Book(this.title, this.author, this.price);
        return newBook;
    }
}
