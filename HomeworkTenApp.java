package com.telran.org.homeworkten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HomeworkTenApp {
    public static void main(String[] args) {
        Author author1 = new Author("Jack", "Brown", 1971);
        Author author2 = new Author("Dave", "Smith", 1962);
        Author author3 = new Author("Dereck", "Lam", 1953);
        Author author4 = new Author("Sam", "Green", 1944);
        Author author5 = new Author("Gerbert", "Linch", 1935);
        Author author6 = new Author("John", "Dou", 1926);

        Publisher publisher1 = new Publisher("Silver Bullet", 1891);
        Publisher publisher2 = new Publisher("Dagon", 1952);
        Publisher publisher3 = new Publisher("Far Away", 1963);

        Book book1 = new Book("Autobiography", 221, 1991, author1, publisher1);
        Book book2 = new Book("Imagination", 232, 1982, author2, publisher2);
        Book book3 = new Book("Mystery Files", 243, 2003, author3, publisher3);
        Book book4 = new Book("Grand Tour", 354, 2004, author4, publisher1);
        Book book5 = new Book("Big Story", 455, 1975, author5, publisher2);
        Book book6 = new Book("Love Simphony", 166, 1966, author6, publisher3);
        Book book7 = new Book("True Story", 377, 2007, author1, publisher1);

        List<Book> bookList = Arrays.asList(book1, book2, book3, book4, book5, book6, book7);
        for ( int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }

        System.out.println("Select a sorting option :");
        System.out.println("1 - sort by author");
        System.out.println("2 - sort by year of publishing");
        System.out.println("3 - sort by publisher");
        Scanner scanner = new Scanner(System.in);
        int sortBy = scanner.nextInt();

        SortBooksByAuthor sortBooksByAuthor = new SortBooksByAuthor();
        SortBooksByYearOfPublishing sortBooksByYearOfPublishing = new SortBooksByYearOfPublishing();
        SortBooksByPublishing sortBooksByPublishing = new SortBooksByPublishing();

        switch (sortBy){
            case 1:
                Collections.sort(bookList, sortBooksByAuthor);
                break;

            case 2:
                Collections.sort(bookList, sortBooksByYearOfPublishing);
                break;

            case 3:
                Collections.sort(bookList, sortBooksByPublishing);
                break;

            default:
                System.out.println("Invalid sorting option");
        }

        for (Book book : bookList){
            System.out.println(book.getTitle());
        }
    }
}
