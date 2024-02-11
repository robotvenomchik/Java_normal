import java.util.Arrays;

class Library {
    Book[] books;
    int len;
    int capacity;

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
        System.out.println("book '" + book.title + "' added");
    }

    public void remove(String title) {
        int foundIndex=-1;

        for (int i = 0; i < len; i++) {
            if (books[i].title.equals(title)) {
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

    public void printBooks() {
        if (len == 0) {
            System.out.println("library null");
        } else {
            System.out.println("LIST of books: ");
            for (int i = 0; i < len; i++) {
                System.out.println(books[i].title + " (" + books[i].publicationYear + ")");
            }
        }
    }
}