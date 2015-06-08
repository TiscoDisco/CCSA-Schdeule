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

    public Park(String n, SoftDate s, SoftDate e) {
        name = n;
        startDate = s;
        endDate = e;
        Calendar doCal = Calendar.getInstance();
        doCal.clear();
        doCal.setTime(startDate);
        while (doCal.getTime().compareTo(endDate) <= 0) {
            if (doCal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || doCal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                dateList.add(new SoftDate(doCal.getTime().getTime()));
            }
        }
    }

    public Park(String path) {

    }

    public void addNoPlay(SoftDate d, int slot) {
        noPlays.add(d);
    }

    public String getName() {
        return name;
    }

    public ArrayList<SoftDate> getDateList() {
        return dateList;
    }

    public SoftDate getStartDate() {
        return startDate;
    }

    public SoftDate getEndDate() {
        return endDate;
    }

    public boolean hasPlayDate(SoftDate d) {
        for (SoftDate np : noPlays) {
            if (np.equals(d)) {
                return false;
            }
        }
        return true;
    }

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
