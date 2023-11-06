package com.telran.org.homeworkten;

import java.util.Comparator;

public class SortBooksByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int sortByAuthor = o1.getAuthor().getSurname().compareTo(o2.getAuthor().getSurname());
        if (sortByAuthor != 0) {
            return sortByAuthor;
        } else {
            return Integer.compare(o1.getYearOfPublishing(), o2.getYearOfPublishing());
        }
    }
}
