package com.collections.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8CollectionExample {
    public static void main(String[] args) {
        // Create a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));

        // Filter books published after 1950
        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getYear() > 1950)
                .collect(Collectors.toList());

        System.out.println("Filtered Books:");
        filteredBooks.forEach(System.out::println);

        // Map book titles to uppercase
        List<String> uppercasedTitles = books.stream()
                .map(book -> book.getTitle().toUpperCase())
                .collect(Collectors.toList());

        System.out.println("\nUppercased Titles:");
        uppercasedTitles.forEach(System.out::println);

        // Find the book with the earliest publication year
        Book earliestBook = books.stream()
                .min((book1, book2) -> Integer.compare(book1.getYear(), book2.getYear()))
                .orElse(null);

        System.out.println("\nEarliest Book: " + earliestBook);

        // Check if any book's title contains the word "Great"
        boolean containsGreat = books.stream()
                .anyMatch(book -> book.getTitle().contains("Great"));

        System.out.println("\nContains 'Great': " + containsGreat);
    }
}

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
