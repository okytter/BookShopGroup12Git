/**
 * reprecents a book, stores information about a specific book
 * 
 * @author Ole-Kristian Ytterland, Adrian Tusa, Åsmund Winje.
 * @verson 2018.02.14
 */


public class Book
{
    private String title;
    private String author;
    private int pages;
    private String publisher;

    /**
     * constructor of the class and sets the inital values of the field.
     * @param title set the tilte of the book
     * @param author set the author of the book
     * @param pages set the number of pages in the book
     * @param publisher set the publisher of the book
     */
    public Book(String title, String author, int pages, String publisher)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
    }
    
    /**
     * constructor of the class and sets the inital values of the field.
     * @param title set the tilte of the book
     * @param author set the author of the book
     */
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.pages = 0;
        this.publisher = "unknown";
    }

    /**
     * constructor of the class and sets the inital values of the field.
     * everything is set to "null".
     */
    public Book()
    {
        this.title = null;
        this.author = null;
        this.pages = 0;
        this.publisher = null;
    }

    /**
     * returns the name of the author
     * @return the name of the author
     */
    public String getAuthor()
    {
        return this.author;
    }
    
    /**
     * return the tilte of the book
     * @return the tilte of the book
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * return the publisher of the book
     * @return the publisher of the book
     */
    public String getPublisher()
    {
        return this.publisher;
    }
    
    /**
     * returns the number of pages in the book
     * @returns the number of pages in the book
     */
    public int getPages()
    {
        return this.pages;
    }

    /**
     * sets the number of pages in the book
     * @param pages set the number of pages in the book
     */
    public void setNumberOfPages(int pages)
    {
        this.pages = pages;
    }

    /**
     * sets the publisher of the book
     * @param publisher set the publisher of the book
     */
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
}
