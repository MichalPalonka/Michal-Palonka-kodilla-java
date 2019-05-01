package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumList = new ArrayList<>();

    public Forum() {
        theForumList.add(new ForumUser(1, "Adam Adamowicz", 'M', LocalDate.of(2000, Month.JANUARY, 15), 2));
        theForumList.add(new ForumUser(2, "Basia Beatowicz", 'F', LocalDate.of(2000, Month.JANUARY, 15), 1));
        theForumList.add(new ForumUser(3, "Cezary Cezary", 'M', LocalDate.of(2000, Month.JANUARY, 15), 0));
        theForumList.add(new ForumUser(4, "Dorota Dombek", 'F', LocalDate.of(1970, Month.JANUARY, 15), 1));
        theForumList.add(new ForumUser(5, "Franek Fajka", 'M', LocalDate.of(1970, Month.JANUARY, 15), 2));
        theForumList.add(new ForumUser(6, "Grażyna Żarko", 'F', LocalDate.of(1970, Month.JANUARY, 15), 0));
        theForumList.add(new ForumUser(7, "Henryk Kania", 'M', LocalDate.of(2000, Month.JANUARY, 15), 1));
        theForumList.add(new ForumUser(8, "Iza Irys", 'F', LocalDate.of(2000, Month.JANUARY, 15), 2));
        theForumList.add(new ForumUser(9, "Janusz Polak", 'M', LocalDate.of(2000, Month.JANUARY, 15), 0));
        theForumList.add(new ForumUser(10, "Katarzyna Kot", 'F', LocalDate.of(2000, Month.JANUARY, 15), 1));
        theForumList.add(new ForumUser(11, "Leszek Zimny", 'M', LocalDate.of(1970, Month.JANUARY, 15), 2));
        theForumList.add(new ForumUser(12, "Marta Mała", 'F', LocalDate.of(1970, Month.JANUARY, 15), 0));
        theForumList.add(new ForumUser(13, "Norbert Narutowicz", 'M', LocalDate.of(1970, Month.JANUARY, 15), 1));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumList);
    }
}