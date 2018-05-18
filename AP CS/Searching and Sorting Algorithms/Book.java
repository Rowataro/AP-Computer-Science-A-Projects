
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    public Book(final String author, final String title, final int numPages)
    {
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }
    //public because accessors will be in library book, not book.
    public String author = null;
    public String title = null;
    public int numPages = -1;
}
