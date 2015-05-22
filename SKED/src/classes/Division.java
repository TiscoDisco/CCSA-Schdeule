package classes;

/**
 *
 * @author TonyChen
 */
/*teams,match, league, parks, 
 */
import static classes.MatchingPrototype.churchList;
import java.util.*;

public class Division {

    private SoftDate startDate;
    private SoftDate endDate;
    private ArrayList<Team> teamList = new ArrayList<>();
    private ArrayList<Match> matchList = new ArrayList<>();
    private ArrayList<Park> parkList = new ArrayList<>();
    private ArrayList<SoftDate> dateList = new ArrayList<>();
    private ArrayList<String> churchList = new ArrayList<>();
    static ArrayList<String> newChurchList = new ArrayList<>();
    static ArrayList<Team> newTeamList = new ArrayList<>();
    static ArrayList<Team> sortedTeamList = new ArrayList<>();
    static ArrayList<Match> noPlayList = new ArrayList<>();
    
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
    
    public void matching(){
        Random rand = new Random(); //randomize list of churches that are in the churchList array. The randomized churches are put into a new array called newChurchList
        while (!churchList.isEmpty()) {
            int i = rand.nextInt(churchList.size());
            newChurchList.add(churchList.get(i));
            churchList.remove(i);
        }

        while (teamList.size() > 0) { //randomize list of teams that are in the teamList array. The randomized teams are put into a new array called newTeamList
            int i = rand.nextInt(teamList.size());
            newTeamList.add(teamList.get(i));
            teamList.remove(i);
        }

        for (String thisChurch : newChurchList) { //sort teams from the same church to ensure that they will not play eachother
            for (Team thisTeam : newTeamList) {
                if (thisTeam.getChurch().equals(thisChurch)) {
                    sortedTeamList.add(thisTeam); //Puts the sorted teams into a new array called sortedTeamList
                }
            }
        }

        for (int i = 0; i < sortedTeamList.size(); i++) { // create an array including all possible match ups. The match ups are put into the playList array
            for (int j = i + 1; j < sortedTeamList.size(); j++) {
                playList.add(new Match(sortedTeamList.get(i), sortedTeamList.get(j)));
            }
        }

//        for (Match show : playList) {
//            System.out.println(show.getTeamA().getName() + " v " + show.getTeamB().getName());// used for testing purposes. Displays all possible matches.
//        }

        for (int i = 0; i < sortedTeamList.size(); i++) { //create an array of match ups that will not be played
            for (int j = 1; j <= noplay / 2; j++) {//count the match ups not played in the forwards direction of the array
                int pick = i + j;
                if (pick >= sortedTeamList.size()) {
                    pick -= sortedTeamList.size();
                }
                
                //Match ups for a league with an even number of teams
                
                Match currentMatch = new Match(sortedTeamList.get(i), sortedTeamList.get(pick));
                boolean contains = false;
                for (Match checkMatch : noPlayList) {
                    if (checkMatch.equals(currentMatch)) {//testing if the current match is in the noPlayList. If it is, the variable, contains, is changed to true
                        contains = true;
                    }
                }
                if (!contains) {
                    noPlayList.add(currentMatch); //if the match is not already in the array then it is added to the noPlayList array
                }
            }
            for (int k = 1; k <= noplay / 2; k++) {//count the match ups not played in the backwards direction of the array
                int pick = i - k;
                if (pick < 0) {
                    pick += sortedTeamList.size();
                }
                Match currentMatch = new Match(sortedTeamList.get(i), sortedTeamList.get(pick)); //testing if the current match is in the noPlayList. If it is, the variable, contains, is changed to true
                boolean contains = false;
                for (Match checkMatch : noPlayList) {
                    if (checkMatch.equals(currentMatch)) {
                        contains = true;
                    }
                }
                if (!contains) {
                    noPlayList.add(currentMatch); //if the match is not already in the array then it is added to the noPlayList array
                }
            }
            
            //Match ups for a league with an odd number of teams
            
            if (noplay % 2 > 0) { // creates matches for a league with an odd number of teams
                int pick;
                if (i % 2 > 0) {
                    pick = i + (noplay / 2) + 1;
                } else {
                    pick = i - (noplay / 2) - 1;
                }
                if (pick < 0) {
                    pick += sortedTeamList.size();
                }
                if (pick >= sortedTeamList.size()) {
                    pick -= sortedTeamList.size();
                }
                Match currentMatch = new Match(sortedTeamList.get(i), sortedTeamList.get(pick));//testing if the current match is in the noPlayList. If it is, the variable, contains, is changed to true
                boolean contains = false;
                for (Match checkMatch : noPlayList) {
                    if (checkMatch.equals(currentMatch)) {
                        contains = true;
                    }
                }
                if (!contains) {
                    noPlayList.add(currentMatch);//if the match is not already in the array then it is added to the noPlayList array
                }
            }
        }

        for (int i = 0; i < playList.size(); i++) { //checking if an index of the noPlayList array is equal to an index of the playList array
            boolean contains = false;
            for (int j = 0; j < noPlayList.size(); j++) {
                if (playList.get(i).equals(noPlayList.get(j))) {
                    contains = true;
                }
            }
            if (contains) {
                playList.remove(i);//if they are the same at a certain index then remove that match up from the playList array
                i--;
            }
        }
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
