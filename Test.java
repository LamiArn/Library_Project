
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
/**
 *  Test class to test the programm.
 * 
 * @author (Lamiaa Arnous) 
 * @version (project1_Programiing2_semester2_2020/2021)
 */
public class Test
{
    public Test(){
        Library library = new Library();
        library.readItemData();
        library.printAllItems();
        library.writeUserData();
        System.out.println("*****************");
        //------------------------------------------------
        //LibraryItem libraryItem;
        //libraryItem = new Book();
        //libraryItem.printDetails();
        HashMap<String, LibraryItem> items = library.getItemMap();
        HashMap<String, LibraryUser> users = library.getUserMap();

        //--------------------------------------------------

        Date startDate = DateUtil.convertStringToDate("01-01-2021"); 
        Date endDate = DateUtil.convertStringToDate("31-01-2021"); 
        System.out.println("Number of days between " + DateUtil.daysBetween(startDate, endDate));
        Date today = DateUtil.convertStringToDate("01-01-2021");
        Date todayWeek = DateUtil. incrementDate(today, 7);
        System.out.println(DateUtil.convertDateToLongString(todayWeek));

        System.out.println("*****************");

        if(!users.isEmpty())
        {
            String userId = (String) users.keySet().toArray()[0];//to get the first user id to use it to make reservations
            if(!items.isEmpty())
            {
                for(int i=1;i<7;i++)
                {
                    library.makeItemReservation(userId, (String) items.keySet().toArray()[0], "5"+i+"-01-2021 ", 7);
                }
            }
            else
            {
                System.out.println("No Items");
            }
        }
        else
        {
            System.out.println("No Users");
        }
        
        library.printItemReservations();
        library.writeItemReservationData();
        library.readItemReservationData();
        library.printItemReservations();
    }
}
