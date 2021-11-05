package Laba1.classesAndObjects.Task12_14_15_16.utils;

import java.util.Comparator;

/**
 * Book comparator class
 */
public class BookComparator {
    /**
     * Get comparator by title object
     * @return Comparator<Book>
     */
    public static Comparator<Book> getByTitleComparator() {
        return new BookTitleComparator();
    }

    /**
     * Get comparator by title and author object
     * @return Comparator<Book>
     */
    public static Comparator<Book> getByTitleAuthorComparator() {
        return new BookTitleComparator().thenComparing(new BookAuthorComparator());
    }

    /**
     * Get comparator by author and title object
     * @return Comparator<Book>
     */
    public static Comparator<Book> getByAuthorTitleComparator() {
        return new BookAuthorComparator().thenComparing(new BookTitleComparator());
    }

    /**
     * Get comparator by author, title and price object
     * @return Comparator<Book>
     */
    public static Comparator<Book> getByAuthorTitlePriceComparator() {
        return new BookAuthorComparator().thenComparing(new BookTitleComparator()).thenComparing(new BookPriceComparator());
    }
}
