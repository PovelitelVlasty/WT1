package Laba1.classesAndObjects.Task12_14_15_16.main;

import Laba1.classesAndObjects.Task12_14_15_16.utils.Book;
import Laba1.classesAndObjects.Task12_14_15_16.utils.BookComparator;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Tasks 12, 14, 15, 16 class
 */
public class Task12_14_15_16 {
    /**
     * Print results of task 12
     */
    public static void printTask12() {
        Book book1 = new Book("Harry Potter", "J. Rowling", 10, 1);
        Book book2 = new Book("Harry Potter", "J. Rowling", 10, 1);
        Book book3 = new Book("Kolobok", "Narodnaya", 1, 3);

        System.out.println("-----Task 12-----");
        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book1.equals(book2) = " + book1.equals(book2));
        System.out.println("book1.equals(book3) = " + book1.equals(book3));
    }

    /**
     * Print results of task 14
     */
    public static void printTask14() {
        Book book1 = new Book("Harry Potter", "J. Rowling", 10, 1);

        System.out.println("\n-----Task 14-----");
        Book clonedBook1 = (Book)book1.clone();
        System.out.println("clonedBook1.toString() = " + clonedBook1.toString());
    }

    /**
     * Print results of task 15
     */
    public static void printTask15() {
        Book book1 = new Book("Harry Potter", "J. Rowling", 10, 1);
        Book book3 = new Book("Kolobok", "Narodnaya", 1, 3);

        System.out.println("\n-----Task 15-----");
        System.out.println("book3.compareTo(book1) = " + book3.compareTo(book1));
    }

    /**
     * Print results of task 16
     */
    public static void printTask16() {
        Book book1 = new Book("Harry Potter", "J. Rowling", 9, 1);
        Book book2 = new Book("Harry Potter", "J. Rowling", 10, 1);
        Book book3 = new Book("Kolobok", "Narodnaya", 1, 3);
        Book book4 = new Book("Astrophysics", "Kononovich", 20, 4);
        Book book5 = new Book("Math", "Karpuk", 5, 5);
        Book book6 = new Book("Biology", "Ch. Darvin", 9, 6);

        Comparator<Book> byTitleBookComparator = BookComparator.getByTitleComparator();
        TreeSet<Book> books = new TreeSet(byTitleBookComparator);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        System.out.println("-----Task 16-----");
        System.out.println("By title comparator:");
        for(Book book : books) {
            System.out.println(book.toString());
        }

        byTitleBookComparator = BookComparator.getByAuthorTitlePriceComparator();
        books = new TreeSet(byTitleBookComparator);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        System.out.println("\nBy author, title and price comparator:");
        for(Book book : books) {
            System.out.println(book.toString());
        }
    }

    /**
     * Main method
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        printTask12();
        printTask14();
        printTask15();
        printTask16();
    }
}
