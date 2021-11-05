package Laba1.classesAndObjects.Task13.utils;

import Laba1.classesAndObjects.Task13.utils.Book;

/**
 * Programmer book class
 */
public class ProgrammerBook extends Book{
    private String language;
    private int level;

    /**
     * Create a new instance of ProgrammerBook
     * @param title - title of a book
     * @param author - author of a book
     * @param price - price of a book
     * @param language - programming language
     * @param level - level
     */
    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    /**
     * Get string representation
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + ", Language: " + this.language + ", level " + level;
    }

    /**
     * Get hash code
     * @return int
     */
    @Override
    public int hashCode() {
        return super.hashCode() + language.hashCode();
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

        if (!(obj instanceof ProgrammerBook)) {
            return false;
        }

        ProgrammerBook programmerBook = (ProgrammerBook)obj;

        return (super.equals(programmerBook) &&
                (this.language.equals(programmerBook.language)) &&
                (this.level == programmerBook.level));
    }
}