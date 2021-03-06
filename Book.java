/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Greg Babbert
 * @version September 19, 2020
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    //For 2.85
    private int pages;
    //For 2.88
    private String refNumber;
    //For 2.91
    private int borrowed;
    //For 2.92
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean course)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = course;
    }

    // Add the methods here ...
    /**
     * Sets the reference number. This is for 2.88 and 2.90
     */
    public void setRefNumber(String ref) 
    {
        if (ref.length() >= 3) {
            refNumber = ref;
        } else {
            System.out.println("Error! Reference number not long enough");
        }
    }
    
    /**
     * Gets the reference number. This is for 2.88
     */
    public String getRefNumber() 
    {
        return refNumber;
    }
    
    /**
     * Gets the reference number. This is for 2.88
     */
    public boolean isCourseText() 
    {
        return courseText;
    }
    
    /**
     * Increase borrowed number. This is for 2.91
     */
    public void borrow() 
    {
        borrowed += 1;
    }
    
    /**
     * Gets the number of times borrowed. This is for 2.91
     */
    public int getBorrowed() 
    {
        return borrowed;
    }
    
    /**
     * Provide access to the string holding the author's name
     * @return author
     */
    public String getAuthor()
    {
        return author;
    }
    
        /**
     * Provide access to the string holding the book's title
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    
        /**
     * Provide access to the int holding the book's pages
     * @return pages
     */
    public int getPages()
    {
        return pages;
    }
    
    
    /**
     * Prints author. This is for 2.84
     */
    public void printAuthor() 
    {
        System.out.println("The author of this book is: " + author);
    }
    
    /**
     * Prints title. This is for 2.84
     */
    public void printTitle() 
    {
        System.out.println("The title of this book is" + title);
    }
    
    /**
     * Prints the book's details. This is for 2.87, 2.89, 2.91
     */
    public void printDetails() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        if (refNumber.length() > 0) {
            System.out.println("Reference Number: " + refNumber);
        } else {
            System.out.println("Reference Number: zzz");
        }
        System.out.println("Amount of times borrowed: " + borrowed);
    }
    
}
