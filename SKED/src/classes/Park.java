
package classes;

/**
 *
 * @author TonyChen
 */
import java.util.*;

public class Park {
    Division division;
    String name;
    ArrayList<Date> noPlays = new ArrayList<>();
    
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
