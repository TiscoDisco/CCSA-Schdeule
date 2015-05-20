
package classes;

/**
 *
 * @author TonyChen
 */
import java.util.*;

public class ScheduleProtoTony {

    public static void main(Division d) {
        //get the list of matches
        ArrayList<Match> matches = new ArrayList(d.matchList);
        ArrayList<Team> teams = new ArrayList(d.teamList);
        //scheduling
        while(d.hasNotScheduled()){
            
        }
        /*check availability after each of the following steps
         pick park
         saturday
         pick match
         pick match with one of the two teams
         pick match with another one of the two teams
         sunday
         pick match
         pick match with one of the two teams
         pick match with another one of the two teams
         */
            
        /*
         Possible Matchings
         Most Optimal
         AB AC CD
         EF EG GH
         least optimal
         AB CD EF
         GH IJ LM
        
        day 1
        AB 
        AC or BC or CD
        CD or CD or DE or EF
        
         */
        //umpiring schedule
        /*
         Most Optimal
         3 2
         and
         3 1 1
            
         Make sure every team gets a triple header
         Some teams will get another double header
         Other teams will get two singles
         */

    }

}
