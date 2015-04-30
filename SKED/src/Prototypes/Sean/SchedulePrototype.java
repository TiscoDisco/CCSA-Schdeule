/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototypes.Sean;

/**
 *
 * @author 12akims
 */
import java.util.*;

public class SchedulePrototype {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numTeams = 6;
        int lenArray = 0;
        int days = 0;
        int h = 0;
        for (int i = 1; i <= numTeams; i++) {
            lenArray += i;
        }
        if (lenArray % 3 > 0) {
            days = lenArray / 3 + 1;
        } else {
            days = lenArray / 3;
        }
        String[] teams = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "a"};
        String[] games = new String[lenArray];
        ArrayList<String> games1 = new ArrayList(lenArray);
        ArrayList<String> scheduleArray = new ArrayList(lenArray);
        for (int i = 0; i < numTeams; i++) {
            for (int j = i + 1; j < numTeams; j++) {
                games[j] = teams[i] + teams[j];
                System.out.println(games[j]);
            }
        }

        for (int i = 0; i < numTeams; i++) {
            for (int j = i + 1; j < numTeams; j++) {

            }
        }
        scheduleArray.add(games[0]);
        while (!games1.isEmpty()) {
            for (int i = 0; i < days; i++) {
                for (int j = 0; j < 6; j++) {
                    if (j == 0) {
                        scheduleArray.add(games[j]);
                    }
                    if (j == 1) {
                        for (int k = 0; k < games.length; i++) {
                            h = 0;
                            while ((games[0].substring(0, 0) == games[h].substring(0, 0) || games[0].substring(0, 0) == games[h].substring(1, 1)) && (games[0].substring(1, 1) != games[h].substring(0, 0) || games[0].substring(1, 1) != games[h].substring(1, 1))) {
                                h += 1;
                            }
                        }
                    }
                }
            }
        }
    }
}
