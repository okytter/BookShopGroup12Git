import java.util.ArrayList;

/**
 * represents a bookshop that can keep an arraylist of books
 * 
 * @author Ole-Kristian Ytterland, Adrian Tusa, Åsmund Winje
 * @verson 2018.02.19
 */

public class BookKiosk
{
    private ArrayList<Book> books;    
    
    public BookKiosk()
    {
        this.books = new ArrayList<>();
    }

    /**
     * add new book into collection books
     * @param title set the tilte of the book
     * @param author set the author of the book
     * @param pages set the number of pages in the book
     * @param publisher set the publisher of the book
     */
    public void addBook(String title, String author, int pages, String publisher )
    {
        this.books.add(new Book(title, author, pages, publisher));
    }
    
    /**
     * reomves a book from collection books by title
     * @param title removes the book by that title
     */
    public void removeBookByTitle(String title)
    {
        int index = 0;
        while((index < books.size()) && (books.get(index).getTitle().equals(title)))
        {
            if(books.get(index).getTitle().equals(title))
            {
                this.books.remove(index);
            }
            index ++;
        }
    }
    
    /**
     * prints out book details on terminalwindow.
     */
    public void printBookDetails()
    {
        int index = 0;
        for(Book details : this.books)
        {
            System.out.println("Title: " + details.getTitle() +  "    Author: " + details.getAuthor());
            System.out.println("Publisher: " + details.getPublisher() + "    Pages: " + details.getPages() + "  index: " + index);
            System.out.println("  ");
            index ++;
        }
    }
    
    /**
     * search if the collection books contains a book by a spesific title
     * @param title search for that tile
     * @return true if title is found, return false if not.
     */
    public boolean searchForBookByTitle(String title)
    {
        boolean found = false;
        for(Book detail : this.books)
        {
            if(detail.getTitle().equals(title))
            {
                found = true;
            }
        }
        return found;
    }
    
}

    


