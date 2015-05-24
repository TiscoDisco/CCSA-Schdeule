package classes;

/**
 *
 * @author TonyChen
 */
import java.util.*;

public class Main {

    static SoftDate startDate;
    static SoftDate endDate;
    
    ArrayList<Division> juniorDivs = new ArrayList<>();
    ArrayList<Division> seniorDivs = new ArrayList<>();
    ArrayList<Division> varsityDivs = new ArrayList<>();
    ArrayList<Park> juniorParkList = new ArrayList<>();
    ArrayList<Park> seniorParkList = new ArrayList<>();
    ArrayList<Park> varsityParkList = new ArrayList<>();

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //list of playable days
        Scanner in = new Scanner(System.in);
        Calendar startCal = Calendar.getInstance();
        System.out.println("start year");
        int sy = Integer.parseInt(in.nextLine());
        System.out.println("start month");
        int sm = Integer.parseInt(in.nextLine());
        System.out.println("start day");
        int sd = Integer.parseInt(in.nextLine());
        startCal.set(sy, sm, sd);
        Calendar endCal = Calendar.getInstance();
        startDate = new SoftDate(startCal.getTimeInMillis());
        System.out.println("end year");
        int ey = Integer.parseInt(in.nextLine());
        System.out.println("end month");
        int em = Integer.parseInt(in.nextLine());
        System.out.println("end day");
        int ed = Integer.parseInt(in.nextLine());
        endCal.set(ey, em, ed);
        startDate = new SoftDate(endCal.getTimeInMillis());
        
        //create list of days
        Calendar doCal = Calendar.getInstance();
        doCal.set(sy, sm, sd);
        while(doCal.compareTo(endCal)<=0){
            if(doCal.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY || doCal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
                
            }
        }
    }
}
