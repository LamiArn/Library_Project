import java.util.Scanner;
/**
 * 
 * @author (Lamiaa Arnous) 
 * @version (project1_Programiing2_semester2_2020/2021)
 */
public class DVD extends AudioVisual
{
    // instance variables
    
    private String director;
    /**
     * Constructor for objects of class DVD
     */
    public DVD()
    {
    director = "";
    }
    
    /**
     * set Director
     */
    public void setDirector(String director)
    {
    this.director = director;
    }
    
    /**
     * get Director
     */
    public String getDirector()
    {
    return director;
    }
    
    public void readData(Scanner scanner)
    {
        director = scanner.next();
        //System.out.println(director);
        super.readData(scanner);
    }
    
        /**
     * print details of the library item 
     */
    public void printDetails()
    {
        System.out.print("Type_DVD: Director: " + director + ", ");
        super.printDetails();
    }
}
