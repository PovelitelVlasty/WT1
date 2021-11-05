package Laba1.classesAndObjects.Task12_14_15_16.utils;

import java.util.Comparator;

/**
 * Book comparator by title class
 */
public class BookTitleComparator implements Comparator<Book> {
    /**
     * Compare by price
     * @param book1 - first book
     * @param book2 - second book
     * @return int
     */
    public int compare(Book book1, Book book2){
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
