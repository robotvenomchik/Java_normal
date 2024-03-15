package Homework17;

public enum BookEnum {
    BOOK1("Title1", "Author1", 2020, "ISBN1"),
    BOOK2("Title2", "Author2", 2010, "ISBN2"),
    BOOK3("Title3", "Author3", 2010, "ISBN3"),
    BOOK4("Title4", "Author3", 2021, "ISBN4");

    private final String title;
    private final String author;
    private final int year;
    private final String isbn;

    BookEnum(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
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

    public String getIsbn() {
        return isbn;
    }
}
