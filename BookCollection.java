import java.util.ArrayList;

/**
 * represents a book collection that can keep an arraylist of books
 * 
 * @author Ole-Kristian Ytterland, Adrian Tusa, Åsmund Winje
 * @verson 2018.02.19
 */

public class BookCollection
{
    private ArrayList<Book> books;    

    public BookCollection()
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

    public void addBooks()
    {
        addBook("auto", "ok", 12, "ntnu");
        addBook("norsk", "adrian", 10, "ntnu");
        addBook("elektro", "åsmund", 9, "ntnu");
    }

    /**
     * returns a string with details of a book
     * @param title takes in title and search for that title
     * @return a string of all book details.
     */
    public String GetBookDetailsString(String title)
    {
        int index = 0;
        boolean found = false;
        Book book = null;
        while((index < this.books.size()) && !found)
        {
            if(this.books.get(index).getTitle().equals(title))
            {
                book = this.books.get(index);
                found = true;
            }
            index ++;
        }
        if(book != null)
        {
            String returnBookString = book.getAuthor() + " ";
            returnBookString += book.getTitle()+ " ";
            returnBookString += book.getPublisher() + " ";
            returnBookString += book.getPages();
            
            return returnBookString;
        }
        else
        {
            return null;
        }
    }

    /**
     * reomves a book from collection books by title
     * @param title removes the book by that title
     */
    public void removeBookByTitle(String title)
    {
        this.books.remove(GetBookByTilte(title));
    }

    /**
     * findes book from arraylist by searching with title
     * @param title removes the book by that title
     * @return book object or 
     */
    public Book GetBookByTilte(String title)
    {
        int index = 0;
        boolean found = false;
        while((index < this.books.size()) && (!found))
        {
            if(this.books.get(index).getTitle().equals(title))
            {
                found = true;
                return this.books.get(index);
            }
            index ++;
        }
        // return new Book("","",0,"");
        return null;
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

