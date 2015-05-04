/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Julia;

import java.util.*;

/**
 *
 * @author 12bcookj
 */
public class MergeTest {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int times;
        System.out.println("Enter your name: ");
        name = in.nextLine();
        // Takes the user's name
        System.out.println("How many times?");
        times = Integer.parseInt(in.nextLine());
        
        for (int i=0; i<times; i++) {
            System.out.println(name);
        }
    }
    
}
