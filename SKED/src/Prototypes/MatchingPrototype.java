/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototypes;

import java.util.*;

/**
 *
 * @author TonyChen
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
        for (int i = 0; i < numTeams; i++) { //add and churches to the list
            System.out.println("Church name " + i);
            String church = in.nextLine();
            if (churchList.contains(church)) {
                churchList.add(church);
            }
            System.out.println("Team name " + i);
            String team = in.nextLine();
            teamList.add(new Team(team, church));
        }
        for(Team thisTeam:teamList){
            System.out.println(thisTeam.name);
        }

        Random rand = new Random(); //randomize churches list
        while (!churchList.isEmpty()) {
            String selectedChurch = churchList.get(rand.nextInt(churchList.size()));
            newChurchList.add(selectedChurch);
            churchList.remove(selectedChurch);
        }

        while (teamList.size() > 0) { //randomize team list
            Team selectedTeam = teamList.get(rand.nextInt(teamList.size()));
            newTeamList.add(selectedTeam);
            teamList.remove(selectedTeam);
        }
        for (String thisChurch : newChurchList) {
            for (Team thisTeam : newTeamList) {
                if (thisTeam.getChurch().equals(thisChurch)) {
                    sortedTeamList.add(thisTeam);
                }
            }
        }

        for (int i = 0; i < sortedTeamList.size(); i++) {
            for (int j = i + 1; j < sortedTeamList.size(); j++) {
                playList.add(new Match(sortedTeamList.get(i), sortedTeamList.get(j)));
            }
        }

        for (Match show : playList) {
            System.out.println(show.getTeamA().getName() + "vs" + show.getTeamB().getName());
        }

        for (int i = 0; i < sortedTeamList.size(); i++) {
            for (int j = 1; j <= (noplay / 2); j++) {
                Match currentMatch = new Match(sortedTeamList.get(i), sortedTeamList.get(j));
                if (!noPlayList.contains(currentMatch)) {
                    noPlayList.add(currentMatch);
                }
                noPlayList.add(currentMatch);
            }
            for (int k = -1; k >= (-noplay / 2); k--) {
                int pick = i + k;
                if (pick < 0) {
                    pick += sortedTeamList.size();
                }
                Match currentMatch = new Match(sortedTeamList.get(i), sortedTeamList.get(pick));
                if (!noPlayList.contains(currentMatch)) {
                    noPlayList.add(currentMatch);
                }
            }
            if (noplay % 2 > 0) {
                int pick;
                if (i % 2 > 0) {
                    pick = i + (noplay / 2) + 1;
                } else {
                    pick = i - (noplay / 2) - 1;
                }
                if (pick < 0) {
                    pick += sortedTeamList.size();
                }
                Match currentMatch = new Match(sortedTeamList.get(i), sortedTeamList.get(pick));
                if (!noPlayList.contains(currentMatch)) {
                    noPlayList.add(currentMatch);
                }
            }
        }

        //remove overlaps
        for (Match clear : noPlayList) {
            playList.remove(clear);
        }
        for (Match show : playList) {
            System.out.println(show.getTeamA().getName() + show.getTeamB().getName());
        }
    }
}
