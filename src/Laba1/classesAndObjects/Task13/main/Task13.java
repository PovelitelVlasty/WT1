package Laba1.classesAndObjects.Task13.main;

import Laba1.classesAndObjects.Task13.utils.Book;
import Laba1.classesAndObjects.Task13.utils.ProgrammerBook;

/**
 * Task13 class
 */
public class Task13 {
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J. Rowling", 10);
        ProgrammerBook programmerBook1 = new ProgrammerBook("Java. A Beginner's Guide", "H. Shildt", 20, "Java", 3);
        ProgrammerBook programmerBook2 = new ProgrammerBook("C# 7 programming language and platforms .NET and .NET Core", "A. Troelsen & P. Jepics", 25, "C#", 3);


        System.out.println("-----Task 13-----");
        System.out.println("programmerBook1.hashCode() = " + programmerBook1.hashCode());
        System.out.println("programmerBook1.toString() = " + programmerBook1.toString());
        System.out.println("programmerBook1.equals(programmerBook2) = " + programmerBook1.equals(programmerBook2));
        System.out.println("programmerBook1.equals(book1) = " + programmerBook1.equals(book1));
    }
}
