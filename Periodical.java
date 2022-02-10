import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.awt.*;
/**
 * 
 * @author (Lamiaa Arnous) 
 * @version (project1_Programiing2_semester2_2020/2021)
 */
public class Periodical extends PrintedItem
{
    // instance variables 
    private String publicationDate;

    /**
     * Constructor for objects of class Periodical
     */
    public Periodical()
    {
        super();
        publicationDate = "";
    }

    /**
     * Set the publication Date in this LibraryItem .
     */
    public void setPeriodical(String publicationDate)
    {
        this.publicationDate = publicationDate;
    }

    /**
     * Return the publication Date in this LibraryItem .
     * 
     * @return The LibraryItem's publication Date.
     */
    public String getPublicationDate()
    {
        return publicationDate;
    }

    public void readData(Scanner scanner)
    {
        publicationDate = scanner.next();
        //System.out.println(publicationDate);
        super.readData(scanner);
    }

    /**
     * print details of the library item 
     */
    public void printDetails()
    {
        System.out.print("Type_Periodical: Publication Date: " + publicationDate + ", ");
        super.printDetails();
    }
}
