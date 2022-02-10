import java.util.Scanner;
import java.util.*;
import java.util.UUID;
/**
 * 
 * @author (Lamiaa Arnous) 
 * @version (project1_Programiing2_semester2_2020/2021)
 */
public class LibraryUser extends LibraryItem
{
    // instance variables - replace the example below with your own
    private String userID;
    private String surname;
    private String firstName;
    private String otherInitials;
    private String title;
    /**
     * Constructor for objects of class LibraryUser
     */
    public LibraryUser()
    {
        // initialise instance variables
        userID = "";
        surname = "";
        firstName = "";
        otherInitials = "";
        title = "";
    }

    /**
     * set UserID 
     */
    public void setUserID(String userID)
    {
        this.userID = userID;
    }

    /**
     * get UserID 
     */
    public String getUserID()
    {
        return userID;
    }

    /**
     * set surname 
     */
    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    /**
     * get surname 
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     * set FirstName 
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * get FirstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * set OtherInitials 
     */
    public void setOtherInitials(String otherInitials)
    {
        this.otherInitials = otherInitials;
    }

    /**
     * get OtherInitials
     */
    public String getOtherInitials()
    {
        return otherInitials;
    }

    /**
     * set Title
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * get Title 
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * print details of the library item 
     */
    public void printDetails()
    {
        System.out.println("User Data: User ID: " + userID + ", Surname: " + surname + ", First Name: " + firstName + ", Other Initials: " + otherInitials + ", Title: " + title);
    }

    public void readData(Scanner scanner)
    {
        userID = scanner.next();
        //System.out.println(userID);
        surname  = scanner.next();
        //System.out.println(surname);
        firstName  = scanner.next();
        //System.out.println(firstName);
        otherInitials  = scanner.next();
        //System.out.println(otherInitials);
        title  = scanner.next();
        //System.out.println(title);

    }
}
    /* 
     //Generate User ID
    public void generateUserID(String prefix , int size)
    {
        //generate random Number 
        String id = "";
        Random rnd = new Random();
        for (int i = 0 ; i <size ; i++){
            int n = rnd.nextInt(10);
            id += n;      
        }
        userID =  String.format(prefix + id); // "%06d",
    }
    */