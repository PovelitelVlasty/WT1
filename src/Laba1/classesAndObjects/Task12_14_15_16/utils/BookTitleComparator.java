package Laba1.classesAndObjects.Task12_14_15_16.utils;

import java.util.Comparator;


public class BookTitleComparator implements Comparator<Book> {
    
    public int compare(Book book1, Book book2){
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
