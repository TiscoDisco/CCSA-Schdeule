
package classes;

/**
 *
 * @author 12akimr
 */
import java.util.*;
public class Team {

    String church;
    String name;
    ArrayList<Date> noPlays = new ArrayList<>();

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
        if (t.getChurch().equals(church) && t.getName().equals(name)) {
            return true;
        } else {
            return false;
        }
    }
}
