
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
        if(d.toString().equals(super.toString())){
            return true;
        }
        return false;
    }
    
    public int getWeek(){
        return weekNum;
    }
    
}
