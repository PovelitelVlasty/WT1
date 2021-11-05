package Laba1.classesAndObjects.Task12_14_15_16.utils;


public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;


    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
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

        return ((this.title == book.title) &&
                (this.author == book.author) &&
                (this.price == book.price) &&
                (this.isbn == book.isbn));
    }

    
    @Override
    public Object clone() {
        Book newBook = new Book(this.title, this.author, this.price, this.isbn);
        return newBook;
    }

    
    public int compareTo(Book book) {
        if (this.isbn == book.isbn) {
            return 0;
        }

        return (this.isbn < book.isbn) ? -1 : 1;
    }
}
