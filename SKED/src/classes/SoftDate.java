
package classes;

/**
 *
 * @author TonyChen
 */
import java.util.*;

public class SoftDate extends Date {
    
    private int weekNum;
    
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
