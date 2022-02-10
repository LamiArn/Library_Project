import java.util.Scanner;
/**
 * 
 * @author (Lamiaa Arnous) 
 * @version (project1_Programiing2_semester2_2020/2021)
 */
public class PrintedItem extends LibraryItem
{
    //instance variables
    private String publisher;
    private int noOfPages;

    /**
     *  Default Constructor for objects of class PrintedItem
     */
    public PrintedItem()
    {
        //initialise instance variables
        super();
        noOfPages = 0;
        publisher = "";     
    }

    /** Constructor for objects of class  PrintedItem
     */
    public PrintedItem(String publisher, int noOfPages)
    {
        this.noOfPages = noOfPages;
        this.publisher = publisher;
    }

    /**
     * set publisher
     */
    public void setPublisher (String publisher)
    {
        this.publisher = publisher;
    }

    /**
     * get publisher
     */
    public String getPublisher()
    {
        return publisher;
    }

    /**
     * set noOfPages
     */
    public void setNoOfPages(int noOfPages)
    {
        this.noOfPages = noOfPages;
    }

    /**
     * get publisher
     */
    public int getNoOfPages()
    {
        return noOfPages;
    }

    /**
     * 
     */
    public void readData(Scanner scanner )
    {
        noOfPages = scanner.nextInt();
        //System.out.println(noOfPages);
        publisher = scanner.next();
        //System.out.println(publisher);
        super.readData(scanner);
    }

    /**
     * 
     */
    public void printDetails()
    {
        System.out.print("Number Of Pages: " + noOfPages + ", Publisher: " + publisher +".");
        super.printDetails();
    }
}
