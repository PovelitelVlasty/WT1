package Laba1.classesAndObjects.Task12_14_15_16.utils;

import java.util.Comparator;


public class BookComparator {
    
    public static Comparator<Book> getByTitleComparator() {
        return new BookTitleComparator();
    }

    
    public static Comparator<Book> getByTitleAuthorComparator() {
        return new BookTitleComparator().thenComparing(new BookAuthorComparator());
    }

    
    public static Comparator<Book> getByAuthorTitleComparator() {
        return new BookAuthorComparator().thenComparing(new BookTitleComparator());
    }

    
    public static Comparator<Book> getByAuthorTitlePriceComparator() {
        return new BookAuthorComparator().thenComparing(new BookTitleComparator()).thenComparing(new BookPriceComparator());
    }
}
