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
    //private ArrayList<Park> parkList = new ArrayList<>();
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
        Scanner in = new Scanner(System.in);
        int numTeams = teamList.size();
        int lenArray = 0;
        int days = 0;
        int h = 0;
        for (int i = 1; i <= numTeams; i++) {
            lenArray += i;
        }
        if (lenArray % 3 > 0) {
            days = lenArray / 3 + 1;
        } else {
            days = lenArray / 3;
        }
        //String[] teams = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "a"};
        String[] games = new String[lenArray];
        ArrayList<String> games1 = new ArrayList(lenArray);
        ArrayList<String> scheduleArray = new ArrayList(lenArray);

        for (int i = 0; i < numTeams; i++) {
            for (int j = i + 1; j < numTeams; j++) {

            }
        }
        scheduleArray.add(games[0]);
        while (!games1.isEmpty()) {
            for (int i = 0; i < days; i++) {
                for (int j = 0; j < 6; j++) {
                    if (j == 0) {
                        scheduleArray.add(games[j]);
                    }
                    if (j == 1) {
                        for (int k = 0; k < games.length; i++) {
                            h = 0;
                            while ((games[0].substring(0, 0) == games[h].substring(0, 0) || games[0].substring(0, 0) == games[h].substring(1, 1)) && (games[0].substring(1, 1) != games[h].substring(0, 0) || games[0].substring(1, 1) != games[h].substring(1, 1))) {
                                h += 1;
                            }
                        }
                    }
                }
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
}
