package classes;

/**
 *
 * @author TonyChen
 */
import java.io.*;
import java.util.*;

public class Main {

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

    public void main(String[] args) throws IOException {
        //list of playable day
        Scanner in = new Scanner(System.in);
        year = Integer.parseInt(in.nextLine());
        File yearFile = new File(String.valueOf(year), "index.dat");
        if(yearFile.exists()){
            fileInit(String.valueOf(year));
        }else{
            yearFile.createNewFile();
            blankInit();
        }
        
    }

    public void blankInit() {
        Calendar juniorCal = Calendar.getInstance();
        juniorCal.clear();
        juniorCal.set(Calendar.YEAR, year);
        juniorCal.set(Calendar.MONTH, Calendar.JULY);
        juniorCal.set(Calendar.DAY_OF_MONTH, 1);
        juniorCal.add(Calendar.DAY_OF_YEAR, -7);
        juniorStartDate.setTime(juniorCal.getTimeInMillis());

        Calendar seniorCal = Calendar.getInstance();
        seniorCal.set(Calendar.YEAR, year);
        seniorCal.set(Calendar.MONTH, Calendar.JUNE);
        seniorCal.set(Calendar.DAY_OF_MONTH, 1);
        seniorCal.add(Calendar.DAY_OF_YEAR, -7);
        seniorStartDate.setTime(seniorCal.getTimeInMillis());

        Calendar varsityCal = Calendar.getInstance();
        varsityCal.set(Calendar.YEAR, year);
        varsityCal.set(Calendar.MONTH, Calendar.JULY);
        varsityCal.set(Calendar.DAY_OF_MONTH, 1);
        varsityCal.add(Calendar.DAY_OF_YEAR, -7);
        varsityStartDate.setTime(varsityCal.getTimeInMillis());

        Calendar endCal = Calendar.getInstance();
        endCal.clear();
        endCal.set(Calendar.YEAR, year);
        endCal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        endCal.set(Calendar.WEEK_OF_MONTH, 1);
        endCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        endDate.setTime(endCal.getTimeInMillis());
    }

    public void fileInit(String parent) throws FileNotFoundException, IOException {
        File index = new File(parent, ".index.dat");
        //division lists
        File jDivs = new File(parent, "junior\\index.dat");
        File sDivs = new File(parent, "senior\\index.dat");
        File vDivs = new File(parent, "varsity\\divList.dat");
        FileReader jDivsRead = new FileReader(jDivs);
        FileReader sDivsRead = new FileReader(sDivs);
        FileReader vDivsRead = new FileReader(vDivs);
        BufferedReader jDivsBuff = new BufferedReader(jDivsRead);
        BufferedReader sDivsBuff = new BufferedReader(sDivsRead);
        BufferedReader vDivsBuff = new BufferedReader(vDivsRead);
        int jNumDivs = Integer.parseInt(jDivsBuff.readLine());
        for (int i = 0; i < jNumDivs; i++) {
            juniorDivs.add(new Division(parent + "junior\\divs\\" + jDivsBuff.readLine()));
        }
        int sNumDivs = Integer.parseInt(sDivsBuff.readLine());
        for (int i = 0; i < sNumDivs; i++) {
            seniorDivs.add(new Division(parent + "senior\\divs\\" + jDivsBuff.readLine()));
        }
        int vNumDivs = Integer.parseInt(vDivsBuff.readLine());
        for (int i = 0; i < vNumDivs; i++) {
            varsityDivs.add(new Division(parent + "varsity\\divs\\" + jDivsBuff.readLine()));
        }

        //park lists
        File jParks = new File(parent, "junior\\parkList.dat");
        File sParks = new File(parent, "senior\\parkList.dat");
        File vParks = new File(parent, "varsity\\parkList.dat");
        FileReader jParksRead = new FileReader(jParks);
        FileReader sParksRead = new FileReader(sParks);
        FileReader vParksRead = new FileReader(vParks);
        BufferedReader jParksBuff = new BufferedReader(jParksRead);
        BufferedReader sParksBuff = new BufferedReader(sParksRead);
        BufferedReader vParksBuff = new BufferedReader(vParksRead);
        int jNumParks = Integer.parseInt(jParksBuff.readLine());
        for (int i = 0; i < jNumParks; i++) {
            juniorParks.add(new Park(parent + "junior\\divs\\" + jParksBuff.readLine()));
        }
        int sNumParks = Integer.parseInt(sParksBuff.readLine());
        for (int i = 0; i < sNumParks; i++) {
            seniorParks.add(new Park(parent + "senior\\divs\\" + jParksBuff.readLine()));
        }
        int vNumParks = Integer.parseInt(vParksBuff.readLine());
        for (int i = 0; i < vNumParks; i++) {
            varsityParks.add(new Park(parent + "varsity\\divs\\" + jParksBuff.readLine()));
        }
        //
    }

    public void saveAll() {
        
    }

    public void addDivision(String l, String dc) {
        switch (l) {
            case "j":
                juniorDivs.add(new Division(dc, juniorStartDate, endDate));
                break;
            case "s":
                seniorDivs.add(new Division(dc, seniorStartDate, endDate));
                break;
            case "v":
                varsityDivs.add(new Division(dc, varsityStartDate, endDate));
                break;
        }
    }
}
