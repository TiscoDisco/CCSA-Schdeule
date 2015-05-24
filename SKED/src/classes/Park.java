
package classes;

/**
 *
 * @author TonyChen
 */
import java.util.*;

public class Park {
    private String name;
    private ArrayList<SoftDate> noPlays = new ArrayList<>();
    
    public Park(String n, Division m) {
        name = n;
    }
    
    public void addNoPlay(SoftDate d){
        noPlays.add(d);
    }
    
    public String getName(){
        return name;
    }
    
    
}
