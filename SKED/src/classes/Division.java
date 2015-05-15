/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author TonyChen
 */
/*teams,match, league, parks, 
 */
import java.util.*;

public class Division {
    
    ArrayList<Team> teamList = new ArrayList<>();
    ArrayList<Match> matchList = new ArrayList<>();
    ArrayList<Park> parkList = new ArrayList<>();
    String league;
    
    public Division(String d) {
        league = d;
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
    
    public String getLeague() {
        return league;
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
