package com.qsp.bookstore.dto;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> availableBooks;

    public Library() {
        availableBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        availableBooks.add(book);
    }

    public void displayAvailableBooks() {
        if (availableBooks.isEmpty()) {
            System.out.println("The library is currently empty.");
        } else {
            System.out.println("Available Books in the Library:");
            for (Book book : availableBooks) {
                System.out.println(book);
            }
        }
    }

	
}
