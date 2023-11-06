package com.telran.org.homeworkten;

import java.util.Comparator;

public class SortBooksByPublishing implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int sortByName = o1.getPublisher().getPublisherName().compareTo(o2.getPublisher().getPublisherName());
        if (sortByName != 0) {
            return sortByName;
        } else {
        return Integer.compare(o1.getYearOfPublishing(), o2.getYearOfPublishing());
        }
    }
}
