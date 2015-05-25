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
        startCal.clear();
        System.out.println("start year");
        int sy = Integer.parseInt(in.nextLine()) - 2015;
        System.out.println("start month");
        int sm = Integer.parseInt(in.nextLine()) - 1;
        System.out.println("start day");
        int sd = Integer.parseInt(in.nextLine());
        startCal.set(sy, sm, sd);
        Calendar endCal = Calendar.getInstance();
        endCal.clear();
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
        doCal.clear();
        doCal.set(sy, sm, sd);
        while (doCal.compareTo(endCal) <= 0) {
            if (doCal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || doCal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {

            }
        }
    }

    public void addDivision(String l) {
        switch (l) {
            case "j":
                juniorDivs.add(new Division(startDate, endDate, String.valueOf(juniorDivs.size())));
                break;
            case "s":
                seniorDivs.add(new Division(startDate, endDate, String.valueOf(seniorDivs.size())));
                break;
            case "v":
                varsityDivs.add(new Division(startDate, endDate, String.valueOf(varsityDivs.size())));
                break;
        }
    }
}
