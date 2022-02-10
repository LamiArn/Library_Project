import java.util.Scanner;

/**
 * 
 * @author (Lamiaa Arnous) 
 * @version (project1_Programiing2_semester2_2020/2021)
 */
public abstract class LibraryItem
{
    // instance variables
    //private int noOfPages;
    //private String publisher;
    private String title;
    private String itemCode;
    private int cost;
    private int timesBorrowed;
    private boolean onLoan;

    /**
     * Default Constructor for objects of class LibraryItem with no parameter
     */
    public LibraryItem()
    {
       //noOfPages = 0;
       //publisher = "";
       title = "";
       itemCode = "";
       cost = 0;
       timesBorrowed = 0;
       onLoan = false;
    }

    /**
     * Constructor for objects of class LibraryItem
     */
    public LibraryItem(String publisher, int noOfPages, String title, String itemCode, int cost, int timesBorrowed,boolean onLoan)
    {
        //this.noOfPages = noOfPages;
        //this.publisher = publisher;
        this.title = title;
        this.itemCode = itemCode;
        this.cost = cost;
        this.timesBorrowed = timesBorrowed;
        this.onLoan = onLoan;

    }

    //      /**
    //      * set publisher
    //      */
    //     public void setPublisher (String publisher)
    //     {
    //         this.publisher = publisher;
    //     }
    // 
    //     /**
    //      * get publisher
    //      */
    //     public String getPublisher()
    //     {
    //         return publisher;
    //     }
    //     
    //          /**
    //      * set noOfPages
    //      */
    //     public void setNoOfPages(int noOfPages)
    //     {
    //         this.noOfPages = noOfPages;
    //     }
    // 
    //     /**
    //      * get publisher
    //      */
    //     public int getNoOfPages()
    //     {
    //         return noOfPages;
    //     }

    /**
     * set title 
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * get title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * set itemCode 
     */
    public void setItemCode(String title)
    {
        this.itemCode = itemCode;;
    }

    /**
     * get itemCode
     */
    public String getItemCode()
    {
        return itemCode;
    }

    /**
     * set cost 
     */
    public void setCost(int cost)
    {
        this.cost = cost;
    }

    /**
     * get cost
     */
    public double getCost()
    {
        return cost;
    }

    /**
     * set timesBorrowed 
     */
    public void setTimesBorrowed(int timesBorrowed)
    {
        this.timesBorrowed= timesBorrowed;
    }

    /**
     * get timesBorrowed
     */
    public int getTimesBorrowed()
    {
        return timesBorrowed;
    }

    /**
     * set onLoan status
     */
    public void setOnLoan(boolean onLoan)
    {
        this.onLoan = onLoan;
    }

    /**
     * get onLoan status
     */
    public boolean getOnLoan()
    {
        return onLoan;
    }

    /**
     * print details of the library item //(availability: " + getOnLoan() + ")"
     */
    public void printDetails()
    {
        System.out.println(title + " with item code " + itemCode + " has been borrowed " + timesBorrowed +
        " times. This item is at present"  + ((onLoan) ? " on loan " : " available") + " and when new cost " + cost + " Pence."); 
    }

    /**
     * method that passed a Scanner object 
     * to read values for each of the library item’s fields 
     */
    public void readData(Scanner scanner )
    {
        //noOfPages = scanner.nextInt();
        //System.out.println(noOfPages);
        //publisher = scanner.next();
        //System.out.println(publisher);
        title = scanner.next();
        //System.out.println(title);
        itemCode = scanner.next();
        //System.out.println(itemCode);
        cost = scanner.nextInt();
        //System.out.println(cost);
        timesBorrowed = scanner.nextInt();
        //System.out.println(timesBorrowed);
        onLoan = scanner.nextBoolean();
        //System.out.println(onLoan);
    }
}
