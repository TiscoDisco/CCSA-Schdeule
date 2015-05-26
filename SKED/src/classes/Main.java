package classes;

/**
 *
 * @author TonyChen
 */
import java.io.*;
import java.util.*;

public class Main {

    static int year;
    static SoftDate startDate;
    static SoftDate endDate;

    ArrayList<Division> juniorDivs = new ArrayList<>();
    ArrayList<Division> seniorDivs = new ArrayList<>();
    ArrayList<Division> varsityDivs = new ArrayList<>();
    ArrayList<Park> juniorParkList = new ArrayList<>();
    ArrayList<Park> seniorParkList = new ArrayList<>();
    ArrayList<Park> varsityParkList = new ArrayList<>();

    public static void main(String[] args) {
        //list of playable day
        
    }
    public void blankInit(int year){
        Calendar juniorCal = Calendar.getInstance();
        juniorCal.clear();
        juniorCal.set(Calendar.YEAR, year);
        juniorCal.set(Calendar.MONTH, Calendar.JULY);
        juniorCal.set(Calendar.DAY_OF_MONTH, 1);
        juniorCal.add(Calendar.DAY_OF_YEAR, -7);
        Calendar seniorCal = Calendar.getInstance();
        seniorCal.set(Calendar.YEAR, year);
        seniorCal.set(Calendar.MONTH, Calendar.JUNE);
        seniorCal.set(Calendar.DAY_OF_MONTH, 1);
        seniorCal.add(Calendar.DAY_OF_YEAR, -7);
        Calendar varsityCal = Calendar.getInstance();
        varsityCal.set(Calendar.YEAR, year);
        varsityCal.set(Calendar.MONTH, Calendar.JULY);
        varsityCal.set(Calendar.DAY_OF_MONTH, 1);
        varsityCal.add(Calendar.DAY_OF_YEAR, -7);
        Calendar endCal = Calendar.getInstance();
        endCal.clear();
        endCal.set(Calendar.YEAR, year);
        endCal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        endCal.set(Calendar.WEEK_OF_MONTH, 1);
        endCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
    }
    
    public void fileInit(String parent){
        File index = new File(parent,".index.dat");
        //park lists
        File jParks = new File(parent,"junior\\parkList.dat");
        File sParks = new File(parent,"senior\\parkList.dat");
        File vParks = new File(parent,"varsity\\parkList.dat");
        //division lists
        File jDivs = new File(parent,"junior\\divList.dat");
        File sDivs = new File(parent,"senior\\divList.dat");
        File vDivs = new File(parent,"varsity\\divList.dat");
        //
        
        
        
    }

    public void addDivision(String l, String dc) {
        switch (l) {
            case "j":
                juniorDivs.add(new Division(dc));
                break;
            case "s":
                seniorDivs.add(new Division(dc));
                break;
            case "v":
                varsityDivs.add(new Division(dc));
                break;
        }
    }
}
