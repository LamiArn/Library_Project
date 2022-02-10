import java.util.Scanner;
/**
 * 
 * @author (Lamiaa Arnous) 
 * @version (project1_Programiing2_semester2_2020/2021)
 */
public class AudioVisual extends LibraryItem
{
    // instance variables 
    private int playingTime;
    /**
     * default Constructor for objects of class AudioVisual
     */
    public AudioVisual()
    {
        // initialise instance variables
        super();
        playingTime = 0;
    }

    /**
     * Constructor for objects of class AudioVisual
     */
    public AudioVisual(int playingTime)
    {
        // initialise instance variables
        this.playingTime = playingTime; 
    }

    /**
     * set playingTime
     */
    public void setPlayingTime(int playingTime)
    {
        this.playingTime = playingTime;
    }

    /**
     * get playingTime
     */
    public int getPlayingTime()
    {
        return playingTime;
    }

    public void readData(Scanner scanner )
    {
        playingTime = scanner.nextInt();
        //System.out.println(playingTime);
        super.readData(scanner);
    }

    /**
     * 
     */
    public void printDetails()
    {
        System.out.print("Playing Time: " + playingTime);
        super.printDetails();
    }
}
