
package classes;

/**
 *
 * @author TonyChen
 */
import java.util.*;

public class SoftDate extends Date {
    
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
    
    public boolean equals(SoftDate d){
        return(d.getTime()==this.getTime());
    }
    
    public int getWeek(){
        return weekNum;
    }
    
    public boolean hasTeam(Team t){
        return(slot1.hasTeam(t)||slot2.hasTeam(t)||slot3.hasTeam(t));
    }
    
    public boolean hasTeam(Team t, int s){
        switch (s){
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
    
    public int getDayOfWeek(){
        Calendar thisCal = Calendar.getInstance();
        thisCal.setTime(this);
        return thisCal.get(Calendar.DAY_OF_WEEK);
        
    }
    
}
