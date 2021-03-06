import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Date;
import java.io.PrintWriter;  

/**
 * 
 * @author (Lamiaa Arnous) 
 * @version (project1_Programiing2_semester2_2020/2021)
 */
public class ItemReservation
{
    // instance variables - replace the example below with your own
    private String reservationNo;
    private String itemCode ;
    private String userID ;
    private Date startDate ;
    private int noOfDays;

    /**
     * Constructor for objects of class ItemReservation
     */
    public ItemReservation(String reservationNo, String itemCode , String userID , String startDate, int noOfDays)
    {
        // initialise instance variables
        this.reservationNo = reservationNo;
        this.itemCode  = itemCode ;
        this.userID  = userID ;      
        this.startDate = DateUtil.convertStringToDate(startDate); 
        this.noOfDays = noOfDays;
    }
    
    public ItemReservation()
    {
        // initialise instance variables
        reservationNo = "";
        itemCode  = "";
        userID  = "";
        startDate = null;//DateUtil.convertStringToDate(startDate); 
        noOfDays = 0;
    }
    

    /**
     * Set reservationNo
     */
    public void setReservationNo(String reservationNo)
    {
        this.reservationNo = reservationNo;
    }

    /**
     * Get reservationNo
     */
    public String getReservationNo()
    {
        return reservationNo;
    }

    /**
     * Set itemCode
     */
    public void setItemCode(String itemCode)
    {
        this.itemCode = itemCode;
    }

    /**
     * Get itemCode
     */
    public String getItemCode()
    {
        return itemCode;
    }     

    /**
     * Set userID 
     */
    public void setUserID (String userID )
    {
        this.userID  = userID ;
    }

    /**
     * Get userID 
     */
    public String getUserID ()
    {
        return userID ;
    }

    /**
     * Set StartDate
     */
    public void setStartDate (Date startDate )
    {
        this.startDate  = startDate ;
    }

    /**
     * Get StartDate
     */
    public Date getStartDate ()
    {
        return startDate;
    }

    /**
     * Set noOfDays
     */
    public void setNoOfDays(int noOfDays )
    {
        this.noOfDays = noOfDays ;
    }

    /**
     * Get noOfDays 
     */
    public int getNoOfDays ()
    {
        return noOfDays;
    }   

    /**
     * check that a "valid" reservation has been correctly added to the reservation list.
     */
    public void printDetails() 
    {
        System.out.println("Reservation Number: " + reservationNo);
        System.out.println (" Item Code: " + itemCode);
        System.out.println ("User ID: " + userID );
        System.out.println ("Start Date: " + startDate );
        System.out.println ("Number Of Days: " + noOfDays);        
    }
    
    /**
     * write Data
     */
    public void writeData(PrintWriter writer)
    {
        writer.println(reservationNo + ", " + itemCode  + ", " + userID + ", " + DateUtil.convertDateToShortString(startDate) + ", " + noOfDays);                                                             
    }
    
    /**
     * read Data
     */
    public void readData(Scanner scanner)
    {
       reservationNo = scanner.next();
       itemCode = scanner.next();
       userID  = scanner.next();
       startDate = DateUtil.convertStringToDate(scanner.next());
       noOfDays = scanner.nextInt();

    }
    
        public String toString()
    {
        return "Reservation No: " + reservationNo + " User ID: " + userID  + " Item Code: " + itemCode ;
    }
}
