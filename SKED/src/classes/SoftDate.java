
package classes;

/**
 *
 * @author TonyChen
 */
import java.util.*;

public class SoftDate extends Date {
    
    private int weekNum;
    
    
    public SoftDate(int w, long t) {
        super(t);
        weekNum = w;
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
