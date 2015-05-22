package classes;

/**
 *
 * @author 12akimr
 */
import java.util.*;

public class Team {

    private String church;
    private String name;
    private ArrayList<SoftDate> noPlays = new ArrayList<>();

    public Team(String n, String c) { // constructor
        name = n;
        church = c;
    }

    public String getChurch() { // return church name
        return church;
    }

    public String getName() { // return team name
        return name;
    }

    public boolean equals(Team t) { // tells if the teams are the same
        return t.getChurch().equals(church) && t.getName().equals(name);
    }

    public boolean hasPlayDate(SoftDate d) {
        for (SoftDate a : noPlays) {
            if (a.equals(d)) {
                return false;
            }
        }
        return true;
    }
}
