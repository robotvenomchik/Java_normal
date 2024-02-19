package Homeworks.Homework11;


import java.util.Arrays;

class Library {
    private Book[] books;
    private int len;
    private int capacity;

    public Library(int initialCapacity) {
        this.books = new Book[initialCapacity];
        this.len = 0;
        this.capacity = initialCapacity;
    }

    public void addBook(Book book) {
        if (len == capacity) {
            int newCapacity = capacity * 2;
            books = Arrays.copyOf(books, newCapacity);
            capacity = newCapacity;
        }
        books[len++] = book;
        System.out.println("book '" + book.getTitle() + "' added");
    }



    public void remove(String title) {
        int foundIndex=-1;

        for (int i = 0; i < len; i++) {
            if (books[i].getTitle().equals(title)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            books[foundIndex] = books[len - 1];
            books[len - 1] = null;
            len--;

            System.out.println("Book '" + title + "' deleted");
        } else {
            System.out.println("Book '" + title + "' not found in library");
        }
    }
    public static int countBooksInLibrary(Library library) {
        return library.len;
    }




    public void printBooks() {
        if (len == 0) {
            System.out.println("library null");
        } else {
            System.out.println("LIST of books: ");
            for (int i = 0; i < len; i++) {
                System.out.println(books[i].getTitle() + " (" + books[i].getPublicationYear() + ")");
            }
        }
    }
}