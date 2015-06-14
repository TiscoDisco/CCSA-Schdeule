package classes;

/**
 *
 * @author 12akimr
 */
import java.util.*;
import java.io.*;



public class Team {

    private String church;
    private String name;
    private String teamCode;
    //private String league;
    private ArrayList<SoftDate> noPlays;

    public Team(String n, String c, String tc, ArrayList<SoftDate> np) { // this is the constructor
        name = n;
        church = c;
        teamCode = tc;

        noPlays = np;
    }

    public String getChurch() { // this returns the church name
        return church;
    }

    public String getName() { // this returns the team name
        return name;
    }

    public String getCode() { // this gets the team code
        return teamCode;
    }

    public boolean equals(Team t) { // this tells if the teams are the same
        return t.getCode().equals(teamCode);
    }

    public void setNoPlay(ArrayList<SoftDate> np) { // this sets the no play days 
        noPlays.clear();
        noPlays.addAll(np);
    }

    public boolean hasPlayDate(SoftDate d) { // this checks to see if the team is available to play based on their no play days
        for (SoftDate a : noPlays) {
            if (a.equals(d)) {
                return false;
            }
        }
        return true;
    }
    // this code checks to see if the team can play
    public boolean canPlay(SoftDate d, ArrayList<Park> pList, Park thisp) {
        if (hasPlayDate(d)) {
            for (Park p : pList) {
                if (!p.equals(thisp)) {
                    for (SoftDate pd : p.getDateList()) {
                        if (pd.equals(d) && !pd.hasTeam(this)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}
