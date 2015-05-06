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

    String name;
    ArrayList<Date> noPlays = new ArrayList<>();

    public Park(String n) {
        name = n;
    }
}
