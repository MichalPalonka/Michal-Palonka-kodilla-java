package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Adam Adasko", "History of Adam", 2000, "1"));
        books.add(new Book("Beata Basko", "Best story of Beata", 1800, "2"));
        books.add(new Book("Cezary cezary", "13 posterunek", 1990, "3"));
        books.add(new Book("David Daltonist", "World without colors", 2010, "4"));
        books.add(new Book("Evan Ewron", "Is fortnite game of the milenium?", 2019,"5"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int mediana = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(2000, mediana);
    }
}
