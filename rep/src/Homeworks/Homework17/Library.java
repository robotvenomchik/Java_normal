package Homeworks.Homework17;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class Library {
    private final List<BookEnum> books = new ArrayList<>();

    public void addBook(String title, String author, int year, String isbn) throws DuplicateBookException, InvalidYearException {
        for (BookEnum book : books) {
            if (book.getIsbn().equals(isbn)) {
                throw new DuplicateBookException("Book with ISBN " + isbn + " already exists");
            }
        }
        if (year < 0 || year > Calendar.getInstance().get(Calendar.YEAR)) {
            throw new InvalidYearException("Invalid year: " + year);
        }
        for (BookEnum bookEnum : BookEnum.values()) {
            if (bookEnum.getTitle().equals(title)) {
                books.add(bookEnum);
                return;
            }
        }
        throw new IllegalArgumentException("No enum constant with title: " + title);
    }

    public void removeBook(String isbn) throws BookNotFoundException {
        boolean removed = books.removeIf(book -> book.getIsbn().equals(isbn));
        if (!removed) {
            throw new BookNotFoundException("Book with ISBN " + isbn + " not found");
        }
    }

    public BookEnum findBookByIsbn(String isbn) throws BookNotFoundException {
        for (BookEnum book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book with ISBN " + isbn + " not found");
    }

    public List<BookEnum> findBooksByAuthor(String author) {
        List<BookEnum> result = new ArrayList<>();
        for (BookEnum book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<BookEnum> findBooksByYear(int year) {
        List<BookEnum> result = new ArrayList<>();
        for (BookEnum book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }

    public void printAllBooks(){
        for (BookEnum book: books){
            System.out.println(book);
        }
    }
}