package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("library 1");
        Book book1 = new Book("Harry Potter and the Philosopher’s Stone", "J.K. Rowling", LocalDate.of(2000, Month.JANUARY, 1));
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", LocalDate.of(2001, Month.JANUARY, 1));
        Book book3 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", LocalDate.of(2002, Month.JANUARY, 1));
        Book book4 = new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", LocalDate.of(2003, Month.JANUARY, 1));
        Book book5 = new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling", LocalDate.of(2003, Month.JANUARY, 1));
        Book book6 = new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling", LocalDate.of(2003, Month.JANUARY, 1));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library 2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("library 3");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.removeBook(book4);
        library.removeBook(book5);
        library.removeBook(book6);

        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(6, deepClonedLibrary.getBooks().size());
    }
}
