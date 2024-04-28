package relation.has_a.aggregation;

/**
 * Represents a book that can be found in a library.
 * This class is part of an aggregation relationship with the Library class.
 * The lifecycle of Book is independent of the lifecycle of any Library.
 */
public class Book {
    private String title;

    /**
     * Constructs a book with a given title.
     * @param title The title of the book.
     */
    public Book(String title) {
        this.title = title;
    }

    /**
     * Retrieves the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }
}
