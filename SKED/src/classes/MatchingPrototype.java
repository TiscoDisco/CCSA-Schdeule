/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.*;

/**
 *
 * @author TonyChen
 * comments by Trent and Naomi
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
        numTeams = Integer.parseInt(in.nextLine());
        System.out.println("How many games are played by each team?");
        play = Integer.parseInt(in.nextLine());
        noplay = numTeams - play - 1;
        for (int i = 0; i < numTeams; i++) { //store list of churches
            System.out.println("Church name " + i);
            String church = in.nextLine();
            if (!churchList.contains(church)) {
                churchList.add(church);
            }
            System.out.println("Team name " + i); //store list of teams 
            String team = in.nextLine();
            teamList.add(new Team(team, church));
        }
//        for(Team thisTeam:teamList){
//            System.out.println(thisTeam.name);
//        }

        Random rand = new Random(); //randomize list of churches
        while (!churchList.isEmpty()) {
            int i = rand.nextInt(churchList.size());
            newChurchList.add(churchList.get(i));
            churchList.remove(i);
        }

        while (teamList.size() > 0) { //randomize list of teams
            int i = rand.nextInt(teamList.size());
            newTeamList.add(teamList.get(i));
            teamList.remove(i);
        }

        for (String thisChurch : newChurchList) { //sort teams from the same church together
            for (Team thisTeam : newTeamList) {
                if (thisTeam.getChurch().equals(thisChurch)) {
                    sortedTeamList.add(thisTeam);
                }
            }
        }

        for (int i = 0; i < sortedTeamList.size(); i++) { // create an array including all possible match ups
            for (int j = i + 1; j < sortedTeamList.size(); j++) {
                playList.add(new Match(sortedTeamList.get(i), sortedTeamList.get(j)));
            }
        }

        for (Match show : playList) {
            System.out.println(show.getTeamA().getName() + " v " + show.getTeamB().getName());
        }

        for (int i = 0; i < sortedTeamList.size(); i++) { //create an array of match ups that will not be played
            for (int j = 1; j <= noplay / 2; j++) {//count the match ups not played forwards in the array
                int pick = i + j;
                if (pick >= sortedTeamList.size()) {
                    pick -= sortedTeamList.size();
                }
                Match currentMatch = new Match(sortedTeamList.get(i), sortedTeamList.get(pick));
                boolean contains = false;
                for (Match checkMatch : noPlayList) {
                    if (checkMatch.equals(currentMatch)) {
                        contains = true;
                    }
                }
                if (!contains) {
                    noPlayList.add(currentMatch);
                }
            }
            for (int k = 1; k <= noplay / 2; k++) {//count the match ups not played backwards in the array
                int pick = i - k;
                if (pick < 0) {
                    pick += sortedTeamList.size();
                }
                Match currentMatch = new Match(sortedTeamList.get(i), sortedTeamList.get(pick)); //test possible match up
                boolean contains = false;
                for (Match checkMatch : noPlayList) {
                    if (checkMatch.equals(currentMatch)) {
                        contains = true;
                    }
                }
                if (!contains) {
                    noPlayList.add(currentMatch); //if false, add match up to noPlayList array
                }
            }
            if (noplay % 2 > 0) { //matches the odd match
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
                Match currentMatch = new Match(sortedTeamList.get(i), sortedTeamList.get(pick));
                boolean contains = false;
                for (Match checkMatch : noPlayList) {
                    if (checkMatch.equals(currentMatch)) {
                        contains = true;
                    }
                }
                if (!contains) {
                    noPlayList.add(currentMatch);
                }
            }
        }

        for (int i = 0; i < playList.size(); i++) { //remove matches not to be played
            boolean contains = false;
            for (int j = 0; j < noPlayList.size(); j++) {
                if (playList.get(i).equals(noPlayList.get(j))) {
                    contains = true;
                }
            }
            if (contains) {
                playList.remove(i);
                i--;
            }
        }
        
        for (Match show : playList) {
            System.out.println(show.getTeamA().getName() + " vs " + show.getTeamB().getName());
        }
        
    }
}
