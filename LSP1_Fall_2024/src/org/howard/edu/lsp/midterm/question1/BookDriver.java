package org.howard.edu.lsp.midterm.question1;

// This is the driver class to test the Book class
public class BookDriver {
    public static void main(String[] args) {
        // Make a few books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Check if two books are the same
        System.out.println(book1.equals(book2));  // true, same ISBN and author
        System.out.println(book1.equals(book3));  // false, different ISBN and author

        // Print out a book's information
        System.out.println(book1);
    }
}
