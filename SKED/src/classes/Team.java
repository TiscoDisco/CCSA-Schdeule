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
    private String divisionCode;
    private String teamCode;
    //private String league;
    private ArrayList<SoftDate> noPlays;

    public Team(String n, String c, String dc, String tc, ArrayList<SoftDate> np) { // constructor
        name = n;
        church = c;
        teamCode = tc;
        divisionCode = dc;
        noPlays = np;
    }

    public String getChurch() { // return church name
        return church;
    }

    public String getName() { // return team name
        return name;
    }

    public String getCode() {
        return teamCode;
    }

    public boolean equals(Team t) { // tells if the teams are the same
        return t.getCode().equals(teamCode);
    }
    
    public void setNoPlay(ArrayList<SoftDate> np){
        noPlays.clear();
        noPlays.addAll(np);
    }

    public boolean hasPlayDate(SoftDate d) {
        for (SoftDate a : noPlays) {
            if (a.equals(d)) {
                return false;
            }
        }
        return true;
    }

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
