
package classes;

/**
 *
 * @author TonyChen
 */
import java.util.*;

public class Park {
    private SoftDate startDate;
    private SoftDate endDate;
    private ArrayList<SoftDate> dateList = new ArrayList<>();
    private String name;
    private ArrayList<SoftDate> noPlays = new ArrayList<>();
    
    
    public Park(String n, SoftDate s, SoftDate e) {
        name = n;
        startDate = s;
        endDate = e;
        
    }
    
    public void addNoPlay(SoftDate d){
        noPlays.add(d);
    }
    
    public String getName(){
        return name;
    }
    
    
}
