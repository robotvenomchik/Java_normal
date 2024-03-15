package Homework17;

import java.util.List;

public class Main {
    public static void main(String[] args) throws BookNotFoundException {
        Library library = new Library();

        try {
            library.addBook("Title1", "Author1", 2020, "ISBN1");
            library.addBook("Title2", "Author2", 2010, "ISBN2");
            library.addBook("Title3", "Author3", 2010, "ISBN3");
            library.addBook("Title4", "Author3", 2021, "ISBN4");
        } catch (InvalidYearException | DuplicateBookException e) {
            throw new RuntimeException(e);
        }


        System.out.println("---------------------FIND BOOKS BY AUTHOR---------------------");

        List<BookEnum> booksByAuthor = library.findBooksByAuthor("Author3");
        System.out.println("Books by Author3:");
        for (BookEnum b : booksByAuthor) {
            System.out.println(b.getTitle());
        }
        System.out.println("-----------------BY ISBN-------------------------");
        try{
            BookEnum book = library.findBookByIsbn("ISBN2");
            System.out.println("Book found: " + book.getTitle());
        }catch (BookNotFoundException e){
            System.out.println(e);
        }


        try{
            BookEnum book = library.findBookByIsbn("ISBN4");
            System.out.println("Book found: " + book.getTitle());
        }catch (BookNotFoundException e){
            System.out.println(e);
        }
        System.out.println("----------------------PRINT BOOKS--------------------");

        library.printAllBooks();

        System.out.println("----------------------REMOVE BOOK--------------------");

        String k="ISBN1";
        try{
            library.removeBook(k);
            System.out.println("Books published with ISBN " + k +" is removed");
        }catch (BookNotFoundException e){
            System.out.println(e);
        }




        System.out.println("--------------------PRINT BOOKS----------------------");

        library.printAllBooks();

        System.out.println("--------------------FIND BY YEAR----------------------");

        int year=2010;
        List<BookEnum> booksByYear = library.findBooksByYear(year);
        for (BookEnum b : booksByYear) {
            System.out.println(b.getTitle());
        }
        System.out.println("------------------------------------------");

    }
}
