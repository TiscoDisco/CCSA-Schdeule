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
public class Division {
    Team[] teamList;
    Match[] matchList;
    String league;
    Park[] parkList;
    
    public Division(Team[] a, Match[] b, Park[] c, String d){
        teamList = a;
        matchList = b;
        league = d;
        parkList = c;
    }
    public Team[] getTeamList(){
        return teamList;
    }
    public Match[] getMatchList(){
        return matchList;
    }
    public Park[] getParkList(){
        return parkList;
    }
    public String getLeague(){
        return league;
    }
    
}
