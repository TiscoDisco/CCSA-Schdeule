package classes;

/**
 *
 * @author TonyChen
 */

//COMMENT THIS

public class Match {

    private Team teamA;
    private Team teamB;
    private Team umpire = null;
    private boolean scheduled = false;
    private int slot;

    public Match(Team a, Team b) { //constructor
        teamA = a;
        teamB = b;
    }
    
    public void setUmpire(Team t){
        
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

    public boolean equals(Match m) { //tells if the match is the same
        return hasTeam(m.getTeamA()) && hasTeam(m.getTeamB());
    }

    public boolean isScheduled() {
        return scheduled;
    }

    public boolean hasTeam(Team t) {
        return (t.equals(teamB) || t.equals(teamA));
    }
}
