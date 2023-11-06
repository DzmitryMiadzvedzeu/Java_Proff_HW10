package com.telran.org.homeworkten;

import java.util.Comparator;

public class SortBooksByYearOfPublishing implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYearOfPublishing() - o2.getYearOfPublishing();
    }
}
