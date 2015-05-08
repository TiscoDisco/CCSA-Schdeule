/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
