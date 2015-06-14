package classes;

/**
 *
 * @author TonyChen
 */

import java.util.*;

public class SoftDate extends Date {
    // declaring variables
    private int weekNum;
    private Match slot1;
    private Match slot2;
    private Match slot3;

    private boolean play1 = true;
    private boolean play2 = true;
    private boolean play3 = true;

    public SoftDate(long t) {
        super(t);
    }

    public boolean equals(SoftDate d) { // this code returns the time of the game
        return (d.getTime() == this.getTime());
    }

    public boolean getPlay(int s) { // this code determines if the team is in play 1, 2 or 3
        switch (s) {
            case 1:
                return play1;
            case 2:
                return play2;
            case 3:
                return play3;

        }
        return false;
    }

    public int getWeek() { // this code gets the week
        return weekNum;
    }

    public boolean hasTeam(Team t) { // this checks to see if team t is playing in slot 1, 2, or 3
        return (slot1.hasTeam(t) || slot2.hasTeam(t) || slot3.hasTeam(t));
    }

    public boolean hasTeam(Match m) {
        return (hasTeam(m.getTeamA()) || hasTeam(m.getTeamB()));
    }

    public Match getMatch(int s) { // this code determines which time slot the match will be in 
        switch (s) {
            case 1:
                return slot1;
            case 2:
                return slot2;
            case 3:
                return slot3;

        }
        return null;
    }

    public void setMatch(int s, Match m) { // this sets the match 
        switch (s) {
            case 1:
                slot1 = m;
                play1 = true;
                break;
            case 2:
                slot2 = m;
                play2 = true;
                break;
            case 3:
                slot3 = m;
                play3 = true;
                break;
        }
    }

    public boolean hasTeam(Team t, int s) { 
        switch (s) {
            case 1:
                return slot1.hasTeam(t);
            case 2:
                return slot2.hasTeam(t);
            case 3:
                return slot3.hasTeam(t);
            default:
                return false;
        }
    }

    public int getDayOfWeek() { // this code gets the day of the week
        Calendar thisCal = Calendar.getInstance();
        thisCal.setTime(this);
        return thisCal.get(Calendar.DAY_OF_WEEK);

    }

}
