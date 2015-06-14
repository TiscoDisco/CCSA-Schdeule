package classes;

/**
 *
 * @author TonyChen
 */
import java.util.*;



public class Park {

    private SoftDate startDate;
    private SoftDate endDate;
    private ArrayList<SoftDate> dateList = new ArrayList<>();
    private String name;

    private ArrayList<SoftDate> noPlays = new ArrayList<>();

    public Park(String n, SoftDate s, SoftDate e, ArrayList<SoftDate> np) {
        name = n;
        startDate = s;
        endDate = e;
        noPlays = np;
        Calendar doCal = Calendar.getInstance();
        doCal.clear();
        doCal.setTime(startDate);
        //while the season is still in session, this code adds dates to the available days for games
        while (doCal.getTime().compareTo(endDate) <= 0) {
            if (doCal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || doCal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                dateList.add(new SoftDate(doCal.getTimeInMillis()));
            }
            doCal.add(Calendar.DAY_OF_YEAR, 1);
        }
    }

    public void addNoPlay(SoftDate d, int slot) { // this adds a no play day 
        noPlays.add(d);
    }

    public String getName() { // this gets the name of a string 
        return name;
    }

    public ArrayList<SoftDate> getDateList() {
        return dateList;
    }

    public SoftDate getStartDate() { // tis gets the start date of the schedule
        return startDate;
    }

    public SoftDate getEndDate() { // this gets the end date of the schedule
        return endDate;
    }
    // this code ensures that a team will not have to play on a no play date
    public boolean hasPlayDate(SoftDate d) {
        for (SoftDate np : noPlays) {
            if (np.equals(d)) {
                return false;
            }
        }
        return true;
    }
    // this code checks specific dates for teams based on days that they can play
    public boolean canPlay(SoftDate d, int s) {
        if (hasPlayDate(d)) {
            for (SoftDate checkDate : dateList) {
                if (checkDate.equals(d)) {
                    if (!checkDate.getPlay(s)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
