import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;
import java.io.*;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.util.Date;
/**
 * 
 * @author (Lamiaa Arnous) 
 * @version (project1_Programiing2_semester2_2020/2021)
 */
public class Library
{
    /**
     * ArrayList for storing the LibraryItem
     */ 
    //private ArrayList<LibraryItem> itemList;
    //private ArrayList<LibraryUser> userList;
    //private List<LibraryItem> itemList;
    //private List<LibraryUser> userList;
    private HashMap<String, LibraryItem> itemMap ;
    private HashMap<String, LibraryUser> userMap;
    private HashMap<String, ItemReservation> itemReservationMap;
    private Diary diary;
    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        //itemList = new ArrayList<LibraryItem>();
        //userList = new ArrayList<LibraryUser>();
        itemMap = new HashMap<String, LibraryItem>();
        userMap = new HashMap<String, LibraryUser>();
        itemReservationMap = new HashMap<String, ItemReservation>();
        diary = new Diary();
    }

    /** 
     * get libraryItem map
     */
    public HashMap<String, LibraryItem> getItemMap() 
    {
        return itemMap;
    }

    /** 
     * get libraryUser map
     */
    public HashMap<String, LibraryUser> getUserMap() 
    {
        return userMap;
    }

    /** 
     * get ItemReservation map
     */
    public HashMap<String, ItemReservation> getItemReservation() 
    {
        return itemReservationMap;
    }

    /**
     *storeUser method to add a library user to userList 
     * 
     */
    public void storeItem(LibraryItem libraryItem)
    {
        //itemList.add(libraryItem);
        itemMap.put(libraryItem.getItemCode(),libraryItem);
    }

    /**
     * Generate User ID
     */
    private String generateUserID(String prefix , int siz)
    {
        int max = (int) Math.pow(10, siz );
        int min = (int) Math.pow(10, siz - 1);
        Random random = new Random();
        int num = random.nextInt(max - min) + min;
        String id = prefix+Integer.toString(num);
        return id;
    }   

    /**
     *storeUser method to add a library user to userList 
     * 
     */
    public void storeUser(ArrayList<String> i, LibraryUser libraryUser)
    {
        if (libraryUser.getUserID().equals("unknown"))
        {
            String id = generateUserID("AB-" , 6);
            while(i.contains(id))
            {
                id = generateUserID("AB-" , 6);
            }
            i.add(id);
            libraryUser.setUserID(id);
        }
        //userList.add(libraryUser); 
        userMap.put(libraryUser.getUserID(),libraryUser);
    } 

    /**
     *storeItemReservation method to add 
     * 
     */    
    public void storeItemReservation(ItemReservation reservation)
    {
        this.itemReservationMap.put(reservation.getReservationNo(), reservation);
        diary.addReservation(reservation);
    }   

    /**
     *displays the details of all the items in itemList.  
     * 
     */ 
    public void printAllItems()
    {
        //for(LibraryItem item : itemList)

        //item.printDetails();
        //System.out.println(); // empty line between items
        System.out.println("Library Items");
        for(Map.Entry<String, LibraryItem> entry : this.itemMap.entrySet())
        {
            entry.getValue().printDetails();
        }
        System.out.println("Library Users");
        for(Map.Entry<String, LibraryUser> entry : this.userMap.entrySet())
        {
            entry.getValue().printDetails();
        }

    }

    /**
     * 
     */
    public void readItemData()

    {
        Frame frame = null;
        FileDialog fileBox = new FileDialog(frame, "Open", FileDialog.LOAD);
        fileBox.setDirectory("C:\\Users\\user\\Desktop");
        fileBox.setVisible(true);
        String fileName = fileBox.getFile(); // get file name
        //System.out.println(fileName);
        String directoryPath = fileBox.getDirectory(); // get file Directory
        //System.out.println(directoryPath);
        File file = new File(directoryPath+fileName);
        Scanner scanner = null;
        String typeOfData = "Book data";
         ArrayList<String> i = new ArrayList<String>();
        // set up scanner to read from file
        try{       
            scanner = new Scanner(file);
        }
        catch (FileNotFoundException e){
            System.out.println("Cannot read file");
        }

        while(scanner.hasNextLine())
        {
            String lineOfText = scanner.nextLine().trim();
            if (lineOfText.startsWith("//") || lineOfText.isEmpty())
            {
                continue; //Exit this iteration if line starts with // or blank line
            }

            else if (lineOfText.equalsIgnoreCase("[Book data]"))
            {
                typeOfData = "Book data";
            }

            else if (lineOfText.equalsIgnoreCase("[periodical data]"))
            {
                typeOfData = "periodical data";
            }

            else if (lineOfText.equalsIgnoreCase("[CD data]"))
            {
                typeOfData = "CD data";
            }

            else if (lineOfText.equalsIgnoreCase("[DVD data]"))
            {
                typeOfData = "DVD data";
            }
            else if (lineOfText.equalsIgnoreCase("[Library User Data]"))
            {
                typeOfData = "Library User Data";
            }
            else if (lineOfText.startsWith("["))
            {
                typeOfData = "Unknown data";
            }

            else//now dealing with real data
            {   
                Scanner scanner2 = new Scanner(lineOfText).useDelimiter("\\s*,\\s*"); // set up second scanner to read from virable string (lineOfText)
                if (typeOfData.equals("Book data"))
                {
                    LibraryItem book = new Book ();  // create a Book object
                    book.readData(scanner2); //pass the scanner2 to readData() method of the Book class & read data for each of its fields
                    storeItem(book); // store the Book object in itemList
                }
                else if (typeOfData.equals("periodical data"))
                {
                    LibraryItem periodical = new Periodical ();  // create a periodical object
                    periodical.readData(scanner2); //pass the scanner2 to readData() method of the Periodical class & read data for each of its fields
                    storeItem(periodical); // store the Periodical object in itemList
                }
                else if (typeOfData.equals("DVD data"))
                {
                    LibraryItem dvd = new DVD ();  // create a DVD object
                    dvd.readData(scanner2); //pass the scanner2 to readData() method of the DVD class & read data for each of its fields
                    storeItem(dvd); // store the DVD object in itemList
                }
                else if (typeOfData.equals("CD data"))
                {
                    LibraryItem cd = new CD ();  // create a CD object
                    cd.readData(scanner2); //pass the scanner2 to readData() method of the CD class & read data for each of its fields
                    storeItem(cd); // store the CD object in itemList
                }
                else if (typeOfData.equals("Library User Data"))
                {
                    LibraryUser userData = new LibraryUser ();  // create a LibraryUser object
                    userData.readData(scanner2); //pass the scanner2 to readData() method of the LibraryUser class & read data for each of its fields
                    storeUser(i,userData); // store the LibraryUser object in itemList
                   
                }

                else //if ( typeOfData.equals("Unknown data"))
                {
                    System.out.println("Unknown data");
                }
            }
        }
        scanner.close();
    }

    /**
     * write User data to new txt file.
     * The directory will be the same one of the project (in the position where the project is saved)
     */
    public void writeUserData()
    //throws FileNotFoundException
    {
        PrintWriter pWriter = null;
        try{
            pWriter = new PrintWriter("new_User_Data.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Cannot Write to file");
        }

        pWriter.println("// this is a comment, any lines that start with //");
        pWriter.println("// (and blank lines) should be ignored");
        pWriter.println();// Empty line
        pWriter.println("// data is userID, surname, firstName, otherInitials, title");
        pWriter.println();// Empty line
        pWriter.println("[Library User Data]");
        pWriter.println();// Empty line
        //         for(LibraryUser user: userList)
        //         {
        //             String lineOfOutput = user.getUserID()+ "," + user.getSurname() + "," + user.getFirstName() + "," + user.getOtherInitials() + "," + user.getTitle() ;
        //             pWriter.println(lineOfOutput);
        //         }
        for(Map.Entry<String, LibraryUser> entry : userMap.entrySet())
        {
            entry.getValue();//.setValue(pWriter);//writeData(pWriter)
        }
        pWriter.close();
    }

    public boolean makeItemReservation(String userID, String itemCode, String startDate, int noOfDays)
    {
        if((itemMap.containsKey(itemCode))&&(userMap.containsKey(userID)))
        {
            String reservationNo = generateReservationNo();
            while(itemReservationMap.containsKey(reservationNo))
            {
                reservationNo = generateReservationNo();
            }
            //the reservation in selceted date
            //check if any items contain code(if so the item is already reserved)
            Date reservationDate = DateUtil.convertStringToDate(startDate);
            ItemReservation[] allReservations = diary.getReservations(reservationDate);
            if(allReservations != null)
            {
                for(ItemReservation item : allReservations)
                {
                    if(item.getItemCode ()== itemCode)
                        return false;
                }
            }
            ItemReservation reservation = new ItemReservation( reservationNo, itemCode, userID ,startDate,  noOfDays );
            storeItemReservation(reservation);
            return true;
        }
        else
            return false;
    }   

    private String generateReservationNo()
    {
        Random random = new Random();
        int num = random.nextInt(1000000);
        return  String.format("%06d", num);
    }

    /**
     * check that a "valid" reservation has been correctly added to the reservation list.
     */
    public void printItemReservations() 
    {
        System.out.println("Reservation has been added");
        for(Map.Entry<String, ItemReservation> entry : itemReservationMap.entrySet())
        {
            entry.getValue().printDetails();
        }
    }

    /**
     * write Item Reservation Data to new txt file.
     * The directory will be the same one of the project (in the position where the project is saved)
     */
    public void writeItemReservationData() 
    {
        PrintWriter iWriter = null;
        try{
            iWriter = new PrintWriter(new File("reservationData.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Cannot Write to file");
        }
        iWriter.println("// this is a comment, any lines that start with //"); 
        iWriter.println("// (and blank lines) should be ignored"); 
        iWriter.println();
        iWriter.println("// New user data"); 
        iWriter.println("// data is reservationNo, itemCode , userID , startDate, noOfDays"); 
        iWriter.println();
        iWriter.println("[Item reservation data]"); 
        iWriter.println();
        for(Map.Entry<String, ItemReservation> entry : itemReservationMap.entrySet())
        {
            entry.getValue().writeData(iWriter);
        }
        iWriter.close();
    }

    /**
     * read Item Reservation Data.
     */

    public void readItemReservationData()
    {
        Frame frame = null;
        FileDialog fileBox = new FileDialog(frame, "Open", FileDialog.LOAD);
        fileBox.setDirectory("C:\\Users\\user\\Desktop");
        fileBox.setVisible(true);
        String fileName = fileBox.getFile();
        //ArrayList<String> ids = new ArrayList<String>();
        if(fileName == null)
        {
            System.out.println("File is null, choose another file");
        }
        else
        {
            String directory = fileBox.getDirectory();
            String filePath = directory + fileName;
            File itemData = new File(filePath);
            Scanner scanner = null;
            try
            {
                scanner = new Scanner(itemData);
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Cannot read file");
            }
            while(scanner.hasNextLine())
            {
                String lineOfText = scanner.nextLine().trim();
                if(!lineOfText.isEmpty() || !lineOfText.startsWith("//"))
                {
                    if(!lineOfText.startsWith("["))
                    {
                        Scanner scanner2 = new Scanner(lineOfText);
                        scanner2.useDelimiter("\\s*,\\s*");
                        ItemReservation reservation = new ItemReservation();                
                        reservation.readData(scanner2);
                        storeItemReservation(reservation);     
                    }                   
                }
            }

        }
    }

    /**
     * This will enable a user of the system to display diary entries for a specified period.
     */    
    public void printDiaryEntries(String startDate, String endDate)
    {
        diary.printEntries(DateUtil.convertStringToDate(startDate), DateUtil.convertStringToDate(endDate));
    }

    /**
     * Deletes the corresponding reservation from the reservation system.
     */
    public void deleteItemReservation(String reservationPeriod)
    {
        ItemReservation reservation = itemReservationMap.get(reservationPeriod);
        diary.deleteReservation(reservation);
        itemReservationMap.remove(reservationPeriod);
    }
}
