import java.util.Scanner;
/**
 * 
 * @author (Lamiaa Arnous) 
 * @version (project1_Programiing2_semester2_2020/2021)
 */
public class CD extends AudioVisual
{
    // instance variables 
    private String artist;
    private int noOfTracks;

    /**
     * Constructor for objects of class CD
     */
    public CD()
    {
        // initialise instance variables
        super();
        artist = "";
        noOfTracks = 0;
    }

    /**
     * set Artist
     */
    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    /**
     * get Artist
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * set NoOfTracks
     */
    public void setNoOfTracks(int noOfTracks)
    {
        this.noOfTracks = noOfTracks;
    }

    /**
     * get NoOfTracks
     */
    public int getNoOfTracks()
    {
        return noOfTracks;
    }

    public void readData(Scanner scanner)
    {
        artist = scanner.next();
        //System.out.println(artist);
        noOfTracks  = scanner.nextInt();
        //System.out.println(noOfTracks);
        super.readData(scanner);
    }

    /**
     * print details of the library item 
     */
    public void printDetails()
    {
        System.out.print("Type_CD: artist: " + artist + ", Number Of Tracks: " + noOfTracks + ", ");
        super.printDetails();
    }
}
