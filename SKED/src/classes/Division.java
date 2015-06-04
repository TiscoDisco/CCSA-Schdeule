package classes;

/**
 *
 * @author TonyChen comments made by Trent and Naomi
 */
/*teams,match, league, parks, 
 */
import java.io.*;
import java.util.*;

public class Division {

    private SoftDate startDate;
    private SoftDate endDate;
    private String divisionCode;
    private ArrayList<Team> teamList = new ArrayList<>();
    private ArrayList<Match> matchList = new ArrayList<>();

    public Division(String dc, SoftDate s, SoftDate e) {
        divisionCode = dc;
        startDate = s;
        endDate = e;
    }

//    public Division(String path) throws FileNotFoundException, IOException {
//        FileReader indexRead = new FileReader(index);
//        BufferedReader indexBuff = new BufferedReader(indexRead);
//        divisionCode = indexBuff.readLine();
//        startDate = new SoftDate(Long.parseLong(indexBuff.readLine()));
//        endDate = new SoftDate(Long.parseLong(indexBuff.readLine()));
//        String[] tList = indexBuff.readLine().split(",");
//        for (String tPath : tList) {
//            teamList.add(new Team(String.valueOf(y) + "\\teams\\" + indexBuff.readLine()));
//        }
//        int numMatches = Integer.parseInt(indexBuff.readLine());
//        for (int i = 0; i < numMatches; i++) {
//            String[] m = new String[2];
//            m = (indexBuff.readLine().split(","));
//            matchList.add(new Match(teamList.get(Integer.parseInt(m[0])), teamList.get(Integer.parseInt(m[1]))));
//        }
//
//    }
    
    public Division(int y) throws FileNotFoundException, IOException{
        File index = new File(String.valueOf(y), "index.dat");
        FileReader indexRead = new FileReader(index);
        BufferedReader indexBuff = new BufferedReader(indexRead);
        divisionCode = indexBuff.readLine();
        startDate = new SoftDate(Long.parseLong(indexBuff.readLine()));
        endDate = new SoftDate(Long.parseLong(indexBuff.readLine()));
        String[] tList = indexBuff.readLine().split(",");
        for (String tPath : tList) {
            teamList.add(new Team(String.valueOf(y) + "\\teams\\" + indexBuff.readLine()));
        }
        int numMatches = Integer.parseInt(indexBuff.readLine());
        for (int i = 0; i < numMatches; i++) {
            String[] m = new String[2];
            m = (indexBuff.readLine().split(","));
            matchList.add(new Match(teamList.get(Integer.parseInt(m[0])), teamList.get(Integer.parseInt(m[1]))));
        }
    }
//    public Division(){}

    public void addTeam(String n, String c, ArrayList<SoftDate> np) {
        String name = String.valueOf(teamList.size());
        if (name.length() < 2) {
            name = "0" + name;
        }
        teamList.add(new Team(n, c, divisionCode, name, np));
    }

    public ArrayList<Team> getTeamList() {
        return teamList;
    }

    public ArrayList<Match> getMatchList() {
        return matchList;
    }

    public void matching() {
        ArrayList<Team> matchTeamList = new ArrayList<>();
        matchTeamList.addAll(teamList);
        ArrayList<String> churchList = new ArrayList<>();
        for (Team t : matchTeamList) {
            churchList.add(t.getChurch());
        }
        ArrayList<Match> matchMatchList = new ArrayList<>();
        ArrayList<String> newChurchList = new ArrayList<>();
        ArrayList<Team> newTeamList = new ArrayList<>();
        ArrayList<Team> sortedTeamList = new ArrayList<>();
        ArrayList<Match> noPlayList = new ArrayList<>();
        int noplay = teamList.size() - 11;
        Random rand = new Random(); //randomize list of churches that are in the churchList array. The randomized churches are put into a new array called newChurchList

        while (!churchList.isEmpty()) {
            int i = rand.nextInt(churchList.size());
            newChurchList.add(churchList.get(i));
            churchList.remove(i);
        }

        while (teamList.size() > 0) {
            //randomize list of teams that are in the teamList array. The randomized teams are put into a new array called newTeamList
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

        for (int i = 0;
                i < sortedTeamList.size();
                i++) { // create an array including all possible match ups. The match ups are put into the playList array
            for (int j = i + 1; j < sortedTeamList.size(); j++) {
                matchMatchList.add(new Match(sortedTeamList.get(i), sortedTeamList.get(j)));
            }
        }

//        for (Match show : playList) {
//            System.out.println(show.getTeamA().getName() + " v " + show.getTeamB().getName());// used for testing purposes. Displays all possible matches.
//        }
        for (int i = 0;
                i < sortedTeamList.size();
                i++) { //create an array of match ups that will not be played
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

        for (int i = 0;
                i < matchMatchList.size();
                i++) { //checking if an index of the noPlayList array is equal to an index of the playList array
            boolean contains = false;
            for (Match check : noPlayList) {
                if (matchMatchList.get(i).equals(check)) {
                    contains = true;
                }
            }
            if (contains) {
                matchMatchList.remove(i);//if they are the same at a certain index then remove that match up from the playList array
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

    public void schedule(ArrayList<Park> pList, int numDates) {
        int p = 0;
        ArrayList<Match> tempMatchList = new ArrayList();
        ArrayList<Match> tempGameList = new ArrayList();
        tempMatchList.addAll(matchList);
        Team teamA1, teamA2, teamA3;
        Team teamB1, teamB2, teamB3;
        Boolean skipSaturday = false;
        int j = 0;
        int lol = 0;

        while (hasNotScheduled()) {
            Day:
            for (int i = 0; i < numDates; i++) {
                Park:
                for (Park assignPark : pList) {

                    if (assignPark.getDateList().get(i).getDayOfWeek() == Calendar.SATURDAY) {
                        for (int k = 0; k < tempMatchList.size(); k++) {
                            if (tempMatchList.get(k).getTeamA().canPlay(assignPark.getDateList().get(i), pList, assignPark)
                                    && (tempMatchList.get(k).getTeamB().canPlay(assignPark.getDateList().get(i), pList, assignPark))) {
                                p = k;

                                break;

                            }
                            if (k == tempMatchList.size() - 1) {
                                //assignPark.getDateList().get(i).setDayOfWeek() = Calendar.SUNDAY;
                                skipSaturday = true;
                                continue Park;

                            }

                        }

                        if (assignPark.getDateList().get(i).getPlay(1)) {
                            assignPark.getDateList().get(i).setMatch(1, tempMatchList.get(0));
                            tempGameList.add(tempMatchList.get(p));
                            teamA1 = tempMatchList.get(p).getTeamA();
                            teamB1 = tempMatchList.get(p).getTeamB();
                            tempMatchList.remove(p);
                            if (assignPark.getDateList().get(i).getPlay(2)) {
                                for (int k = 0; k < tempMatchList.size(); k++) {
                                    if ((tempMatchList.get(k).getTeamA().equals(teamA1) && !(tempMatchList.get(k).getTeamB().equals(teamB1)))
                                            || (tempMatchList.get(k).getTeamB().equals(teamB1)) && !(tempMatchList.get(k).getTeamA().equals(teamA1))
                                            && k < tempMatchList.size()) {
                                        tempGameList.add(tempMatchList.get(k));
                                        teamA2 = tempMatchList.get(k).getTeamA();
                                        teamB2 = tempMatchList.get(k).getTeamB();
                                        tempMatchList.remove(k);
                                        lol = 0;
                                        break;

                                    } else {
                                        for (int t = 0; t < tempMatchList.size(); t++) {
                                            if (!(tempMatchList.get(t).getTeamA().equals(teamA1)) && !(tempMatchList.get(t).getTeamB().equals(teamB1))) {
                                                tempGameList.add(tempMatchList.get(t));
                                                teamA2 = tempMatchList.get(k).getTeamA();
                                                teamB2 = tempMatchList.get(k).getTeamB();
                                                tempMatchList.remove(k);
                                                lol = 1;
                                                break;
                                            }

                                        }
                                    }

                                }

                                if (assignPark.getDateList().get(i).getPlay(3)) {
                                    if (lol == 0) {
                                        for (int k = 0; k < tempMatchList.size(); k++) {
                                            if (teamA1.equals(teamA2) || teamA1.equals(teamB2)) {

                                            }
                                        }
                                    } else {
                                        for (int k = 0; k < tempMatchList.size(); k++) {

                                        }
                                    }

                                }

                                //while (hasTeam(, 1)) {
                            }

                        }

                    }

                    if (assignPark.getDateList().get(i).getDayOfWeek() == Calendar.SUNDAY) {
                        for (int k = 0; k < tempMatchList.size(); k++) {
                            if (tempMatchList.get(k).getTeamA().canPlay(assignPark.getDateList().get(i), pList, assignPark)
                                    && (tempMatchList.get(k).getTeamB().canPlay(assignPark.getDateList().get(i), pList, assignPark))) {
                                p = k;

                                break;

                            }
                        }
                        for (int k = 0; k < tempMatchList.size(); k++) {
                            if (skipSaturday == false) {
                                while (tempMatchList.get(k).getTeamA().equals(teamA1) || tempMatchList.get(k).getTeamA().equals(teamA2) || tempMatchList.get(k).getTeamA().equals(teamA3)
                                        || tempMatchList.get(k).getTeamA().equals(teamB1) || tempMatchList.get(k).getTeamA().equals(teamB2) || tempMatchList.get(k).getTeamA().equals(teamB3)) {
                                    
                                }
                            }

                        }
                        if (assignPark.getDateList().get(i).getPlay(1)) {
                            assignPark.getDateList().get(i).setMatch(1, tempMatchList.get(0));
                            tempGameList.add(tempMatchList.get(p));
                            teamA1 = tempMatchList.get(p).getTeamA();
                            teamB1 = tempMatchList.get(p).getTeamB();
                            tempMatchList.remove(p);
                            if (assignPark.getDateList().get(i).getPlay(2)) {
                                for (int k = 0; k < tempMatchList.size(); k++) {
                                    if ((tempMatchList.get(k).getTeamA().equals(teamA1) && !(tempMatchList.get(k).getTeamB().equals(teamB1)))
                                            || (tempMatchList.get(k).getTeamB().equals(teamB1)) && !(tempMatchList.get(k).getTeamA().equals(teamA1))
                                            && k < tempMatchList.size()) {
                                        tempGameList.add(tempMatchList.get(k));
                                        teamA2 = tempMatchList.get(k).getTeamA();
                                        teamB2 = tempMatchList.get(k).getTeamB();
                                        tempMatchList.remove(k);
                                        lol = 0;
                                        break;

                                    } else {
                                        for (int t = 0; t < tempMatchList.size(); t++) {
                                            if (!(tempMatchList.get(t).getTeamA().equals(teamA1)) && !(tempMatchList.get(t).getTeamB().equals(teamB1))) {
                                                tempGameList.add(tempMatchList.get(t));
                                                teamA2 = tempMatchList.get(k).getTeamA();
                                                teamB2 = tempMatchList.get(k).getTeamB();
                                                tempMatchList.remove(k);
                                                lol = 1;
                                                break;
                                            }

                                        }
                                    }

                                }

                                if (assignPark.getDateList().get(i).getPlay(3)) {
                                    if (lol == 0) {
                                        for (int k = 0; k < tempMatchList.size(); k++) {
                                            if (teamA1.equals(teamA2) || teamA1.equals(teamB2)) {

                                            }
                                        }
                                    } else {
                                        for (int k = 0; k < tempMatchList.size(); k++) {

                                        }
                                    }

                                }

                                //while (hasTeam(, 1)) {
                            }

                        }
                    }
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
//        Scanner in = new Scanner(System.in);
//        int numTeams = teamList.size();
//        int lenArray = 0;
//        int days = 0;
//        int h = 0;
//        for (int i = 1; i <= numTeams; i++) {
//            lenArray += i;
//        }
//        if (lenArray % 3 > 0) {
//            days = lenArray / 3 + 1;
//        } else {
//            days = lenArray / 3;
//        }
//        //String[] teams = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "a"};
//        String[] games = new String[lenArray];
//        ArrayList<String> games1 = new ArrayList(lenArray);
//        ArrayList<String> scheduleArray = new ArrayList(lenArray);
//
//        for (int i = 0; i < numTeams; i++) {
//            for (int j = i + 1; j < numTeams; j++) {
//
//            }
//        }
//        scheduleArray.add(games[0]);
//        while (!games1.isEmpty()) {
//            for (int i = 0; i < days; i++) {
//                for (int j = 0; j < 6; j++) {
//                    if (j == 0) {
//                        scheduleArray.add(games[j]);
//                    }
//                    if (j == 1) {
//                        for (int k = 0; k < games.length; i++) {
//                            h = 0;
//                            while ((games[0].substring(0, 0) == games[h].substring(0, 0) || games[0].substring(0, 0) == games[h].substring(1, 1)) && (games[0].substring(1, 1) != games[h].substring(0, 0) || games[0].substring(1, 1) != games[h].substring(1, 1))) {
//                                h += 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//        }
//
//    }
//}
