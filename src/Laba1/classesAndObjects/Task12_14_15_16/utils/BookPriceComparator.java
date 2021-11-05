package Laba1.classesAndObjects.Task12_14_15_16.utils;

import java.util.Comparator;

/**
 * Book comparator by price class
 */
public class BookPriceComparator implements Comparator<Book> {
    /**
     * Compare by price
     * @param book1 - first book
     * @param book2 - second book
     * @return int
     */
    public int compare(Book book1, Book book2){
        if (book1.getPrice() == book2.getPrice()) {
            return 0;
        }

        return (book1.getPrice() < book2.getPrice()) ? -1 : 1;
    }
}
