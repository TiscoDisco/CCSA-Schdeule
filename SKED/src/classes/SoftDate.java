
package classes;

/**
 *
 * @author TonyChen
 */
import java.util.*;

public class SoftDate extends Date {
    
    private int weekNum;
    private Match match1;
    private Match match2;
    private Match match3;
    
    
    public SoftDate(int w, long t) {
        super(t);
        weekNum = w;
    }
    public boolean equals(SoftDate d){
        if(weekNum == d.weekNum &&){
            
        }
        return false;
    }
    
    public int getWeek(){
        return weekNum;
    }
    
}
