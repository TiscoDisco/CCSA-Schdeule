
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
    
    public SoftDate(long t) {
        super(t);
    }
    
    public boolean equals(SoftDate d){
        return d.toString().equals(super.toString());
    }
    
    public int getWeek(){
        return weekNum;
    }
    
}
