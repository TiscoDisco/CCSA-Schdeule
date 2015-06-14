package classes;

/**
 *
 * @author TonyChen
 */

public class Match {

    private Team teamA;
    private Team teamB;
    private Team umpire = null;
    private boolean scheduled = false;
    private int slot;

    public Match(Team a, Team b) { //this is the constructor
        teamA = a;
        teamB = b;
    }
    
    public void setUmpire(Team t){
        
    }

    public Team getTeamA() { // this returns team A, which is one of the teams in the potential matchup being created
        return teamA;
    }

    public Team getTeamB() { // this returns team B, which is one of the teams in the potential matchup being created
        return teamB;
    }
    
    public int getSlot(){ //this determines a slot for the matchup to occur
        return slot;
    }

    public boolean equals(Match m) { // this tells if the match is the same
        return hasTeam(m.getTeamA()) && hasTeam(m.getTeamB());
    }

    public boolean isScheduled() { //this schedules the match
        return scheduled;
    }

    public boolean hasTeam(Team t) { 
        return (t.equals(teamB) || t.equals(teamA));
    }
}
