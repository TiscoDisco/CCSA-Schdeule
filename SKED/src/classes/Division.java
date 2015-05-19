package classes;

/**
 *
 * @author TonyChen
 */
/*teams,match, league, parks, 
 */
import java.util.*;

public class Division {

    SoftDate startDate;
    SoftDate endDate;
    ArrayList<Team> teamList = new ArrayList<>();
    ArrayList<Match> matchList = new ArrayList<>();
    ArrayList<Park> parkList = new ArrayList<>();
    ArrayList<SoftDate> dateList = new ArrayList<>();

    public Division(SoftDate s, SoftDate e) {
        startDate = s;
        endDate = e;
    }

    public ArrayList<Team> getTeamList() {
        return teamList;
    }

    public ArrayList<Match> getMatchList() {
        return matchList;
    }

    public ArrayList<Park> getParkList() {
        return parkList;
    }

    public boolean hasNotScheduled() {
        for (Match m : matchList) {
            if (!m.isScheduled()) {
                return false;
            }
        }
        return true;
    }

    private long dateToLong(int y, int m, int d) {
        Calendar thisCal = Calendar.getInstance();
        thisCal.set(y, m, d);
        return thisCal.getTimeInMillis();
    }
}
