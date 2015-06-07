 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.*;

/**
 *
 * @author tim
 */
public class GUI {

    int year;

    SoftDate juniorStartDate;
    SoftDate seniorStartDate;
    SoftDate varsityStartDate;
    SoftDate endDate;

    ArrayList<Division> juniorDivs = new ArrayList<>();
    ArrayList<Division> seniorDivs = new ArrayList<>();
    ArrayList<Division> varsityDivs = new ArrayList<>();
    ArrayList<Park> juniorParks = new ArrayList<>();
    ArrayList<Park> seniorParks = new ArrayList<>();
    ArrayList<Park> varsityParks = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        HomeGUI form = new HomeGUI(year, juniorStartDate, seniorStartDate, varsityStartDate, endDate, juniorDivs, seniorDivs, varsityDivs, juniorParks, seniorParks, varsityParks);
        form.setVisible(true);
    }

}
