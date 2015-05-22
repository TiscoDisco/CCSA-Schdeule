package classes;

/**
 *
 * @author TonyChen
 */
public class Match {

    private Team teamA;
    private Team teamB;
    private SoftDate play = null;
    private int slot;

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
    
    public int getSlot(){
        return slot;
    }
    
    public void setDate(int s, SoftDate d){
        slot = s;
        play = d;
    }

    public boolean equals(Match m) { //tells if the match is the same
        return hasTeam(m.getTeamA()) && hasTeam(m.getTeamB());
    }

    public boolean isScheduled() {
        return play != null;
    }

    public boolean hasTeam(Team t) {
        return (t.equals(teamB) || t.equals(teamA));
    }
}
