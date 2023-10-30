package com.qsp.bookstore.dto;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        library.displayAvailableBooks();
    }
}
