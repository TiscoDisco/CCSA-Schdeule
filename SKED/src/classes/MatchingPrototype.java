
package classes;

import java.util.*;

/**
 *
 * @author TonyChen
 * 
 */
public class MatchingPrototype {

    /**
     * @param args the command line arguments
     */
    static int numTeams;
    static ArrayList<Team> teamList = new ArrayList<>();
    static ArrayList<String> churchList = new ArrayList<>();
    static ArrayList<String> newChurchList = new ArrayList<>();
    static ArrayList<Team> newTeamList = new ArrayList<>();
    static ArrayList<Team> sortedTeamList = new ArrayList<>();
    static ArrayList<Match> playList = new ArrayList<>();
    static ArrayList<Match> noPlayList = new ArrayList<>();
    static int play;
    static int noplay;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many teams?");
        numTeams = Integer.parseInt(in.nextLine()); //get user input, for testing purposes
        System.out.println("How many games are played by each team?");
        play = Integer.parseInt(in.nextLine()); //get user input, for testing purposes
        noplay = numTeams - play - 1;
        for (int i = 0; i < numTeams; i++) { //store list of churches in churchList
            System.out.println("Church name " + i);
            String church = in.nextLine();
            if (!churchList.contains(church)) {
                churchList.add(church);
            }
            System.out.println("Team name " + i); //store list of teams in teamList
            String team = in.nextLine();
            teamList.add(new Team(team, church));
        }
//        for(Team thisTeam:teamList){
//            System.out.println(thisTeam.name);
//        }

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

        for (Match show : playList) {
            System.out.println(show.getTeamA().getName() + " vs " + show.getTeamB().getName());
        }

    }
}
