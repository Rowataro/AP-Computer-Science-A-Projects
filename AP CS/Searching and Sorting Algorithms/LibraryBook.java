
/**
 * Write a description of class LibraryBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryBook
{
    public LibraryBook(final Book book, final int copies)
    {
        this.book = book;
        this.copies = copies;
    }
    public final Book getBook()
    {
        return book;
    }
    public final String getAuthor()
    {
        return book.author;
    }
    public final String getTitle()
    {
        return book.title;
    }
    public final int getNumPages()
    {
        return book.numPages;
    }
    public final int getCopies()
    {
        return copies;
    }
    public String toString()
    {
        return 
        "\n\nBook Information" +
        "\n  Title: " + book.title + 
        "\n  Author: " + book.author +
        "\n  Page #: " + book.numPages +
        "\n  # of Copies: " + copies;
    }
    private Book book;
    private int copies;
}
