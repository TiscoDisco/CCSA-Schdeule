package classes;

/**
 *
 * @author TonyChen
 */
public class Match {

    Team teamA;
    Team teamB;
    SoftDate play = null;
    int slot;

    public Match(Team a, Team b) { //constructor
        teamA = a;
        teamB = b;
    }

    public Team getTeamA() { // return team A 
        return teamA;
    }

    public Team getTeamB() { // return team B
        return teamB;
    }

    public boolean equals(Match m) { //tells if the match is the same
        if (hasTeam(m.getTeamA()) && hasTeam(m.getTeamB())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isScheduled() {
        if (play == null) {
            return false;
        }
        return true;
    }

    public boolean hasTeam(Team t) {

        return true;
    }
}
