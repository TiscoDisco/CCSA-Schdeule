
package classes;

/**
 *
 * @author TonyChen
 */
import java.util.*;

public class Park {
    private Division division;
    private String name;
    private ArrayList<Date> noPlays = new ArrayList<>();
    
    public Park(String n, Division m) {
        name = n;
        division = m;
    }
    public void addNoPlay(Date d){
        
    }
    public String getName(){
        return name;
    }
    public Division getDivision(){
        return division;
    }
    
    
}
