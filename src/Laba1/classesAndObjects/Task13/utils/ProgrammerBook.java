package Laba1.classesAndObjects.Task13.utils;

import Laba1.classesAndObjects.Task13.utils.Book;


public class ProgrammerBook extends Book{
    private String language;
    private int level;

    
    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Language: " + this.language + ", level " + level;
    }

    
    @Override
    public int hashCode() {
        return super.hashCode() + language.hashCode();
    }

    
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