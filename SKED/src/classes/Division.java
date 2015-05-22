package classes;

/**
 *
 * @author TonyChen
 */
/*teams,match, league, parks, 
 */
import java.util.*;

public class Division {

    private SoftDate startDate;
    private SoftDate endDate;
    private ArrayList<Team> teamList = new ArrayList<>();
    private ArrayList<Match> matchList = new ArrayList<>();
    private ArrayList<Park> parkList = new ArrayList<>();
    private ArrayList<SoftDate> dateList = new ArrayList<>();

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

    public void schedule(ArrayList<Park> pList) {
        while (hasNotScheduled()) {
            
        }
        /*check availability after each of the following steps
         pick park
         saturday
         pick match
         pick match with one of the two teams
         pick match with another one of the two teams
         sunday
         pick match
         pick match with one of the two teams
         pick match with another one of the two teams
         */

        /*
         Possible Matchings
         Most Optimal
         AB AC CD
         EF EG GH
         least optimal
         AB CD EF
         GH IJ LM
        
         day 1
         AB 
         AC or BC or CD
         CD or CD or DE or EF
        
         */
        //umpiring schedule
        /*
         Most Optimal
         3 2
         and
         3 1 1
            
         Make sure every team gets a triple header
         Some teams will get another double header
         Other teams will get two singles
         */
    }

}
