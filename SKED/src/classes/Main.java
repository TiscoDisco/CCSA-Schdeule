package classes;

/**
 *
 * @author TonyChen
 */
import java.util.*;

public class Main {

    static SoftDate startDate;
    SoftDate endDate;

    ArrayList<Division> juniorDivs = new ArrayList<>();
    ArrayList<Division> seniorDivs = new ArrayList<>();
    ArrayList<Division> varsityDivs = new ArrayList<>();

    public static void main(String[] args) {
        //list of playable days
        Scanner in = new Scanner(System.in);
        Calendar thisCal = Calendar.getInstance();
        System.out.println("start year");
        int sy = Integer.parseInt(in.nextLine());
        System.out.println("start month");
        int sm = Integer.parseInt(in.nextLine());
        System.out.println("start day");
        int sd = Integer.parseInt(in.nextLine());
        thisCal.set(sy, sm, sd);
        startDate = new SoftDate(thisCal.getTimeInMillis());
        System.out.println("end year");
        int ey = Integer.parseInt(in.nextLine());
        System.out.println("end month");
        int em = Integer.parseInt(in.nextLine());
        System.out.println("end day");
        int ed = Integer.parseInt(in.nextLine());
        thisCal.set(ey, em, ed);
        startDate = new SoftDate(thisCal.getTimeInMillis());
        
        //create list of days
    }
}
