/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author tim
 */
import static classes.Main.startDate;
import java.io.*;
import java.util.*;

public class HomeGUI extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public HomeGUI() {
        initComponents();
    }
    private ArrayList<Division> jDivs;
    private ArrayList<Division> sDivs;
    private ArrayList<Division> vDivs;
    
     // This method is called from within the constructor to initialize the form.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        btnTeam = new javax.swing.JButton();
        btnParks = new javax.swing.JButton();
        lblTeams = new javax.swing.JLabel();
        lblParks = new javax.swing.JLabel();
        lblSked = new javax.swing.JLabel();
        lblLine1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SFTBLSKDLR");
        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(255, 255, 204));

        btnTeam.setText("Teams");
        btnTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeamActionPerformed(evt);
            }
        });

        btnParks.setText("Parks");
        btnParks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParksActionPerformed(evt);
            }
        });

        lblTeams.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeams.setText("Teams");

        lblParks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParks.setText("Parks");

        lblSked.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSked.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSked.setText("SKED");

        lblLine1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLine1.setText("_________________________________________________________");

        btnCreate.setText("Create Schedule");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                            .addComponent(lblSked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnParks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblParks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSked)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLine1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParks)
                    .addComponent(lblTeams))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParks, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeamActionPerformed
        TeamsGUI t = new TeamsGUI();
        t.main(null);
        //This code creates the team window and allows it to pop up upon command

    }//GEN-LAST:event_btnTeamActionPerformed

    private void btnParksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParksActionPerformed
        ParksGUI p = new ParksGUI();
        p.main(null);
        //This code creates the parks window and allows it to pop up upon command

    }//GEN-LAST:event_btnParksActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
    }//GEN-LAST:event_btnCreateActionPerformed

    /**
     * @param args the command line arguments
     */
    static int year;
    static SoftDate startDate;
    static SoftDate endDate;
    static ArrayList<SoftDate> dateList = new ArrayList<>();
    ArrayList<Division> juniorDivs = new ArrayList<>();
    ArrayList<Division> seniorDivs = new ArrayList<>();
    ArrayList<Division> varsityDivs = new ArrayList<>();
    ArrayList<Park> juniorParks = new ArrayList<>();
    ArrayList<Park> seniorParks = new ArrayList<>();
    ArrayList<Park> varsityParks = new ArrayList<>();

    public void main(String[] args) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGUI().setVisible(true);
            }
        });
        //list of playable days
        Scanner in = new Scanner(System.in);
        System.out.println("file or blank");
        String select = in.nextLine();
        switch (select.charAt(0)) {
            case 'f':
                System.out.println("What is the path to index.dat?");
                fileInit(in.nextLine());
                break;
            case 'b':
                System.out.println("What is the year?");
                year = Integer.parseInt(in.nextLine());
                blankInit(year);
                break;
        }
    }
    //this class generates the schedule for all of the teams based on all of the factors inputed by the convener
    public void blankInit(int year) {
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
        Calendar doCal = Calendar.getInstance();
        doCal.clear();
        doCal.setTime(startDate);
        while (doCal.getTime().compareTo(endDate) <= 0) {
            if (doCal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || doCal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                dateList.add(new SoftDate(doCal.getTime().getTime()));
            }
        }
    }

    public void fileInit(String parent) throws FileNotFoundException, IOException {
        //Takes the schedule generated by the program and makes that into a file for the user
        File index = new File(parent, ".index.dat");
        //division lists
        File jDivs = new File(parent, "junior\\divList.dat");
        File sDivs = new File(parent, "senior\\divList.dat");
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

        //Saving the list of parks into a data file to be used by for the schedule
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
    //This class adds a division when needed
    public void addDivision(String l, String dc) {
        
        switch (l) {
            case "j":
                juniorDivs.add(new Division(dc, startDate, endDate));
                break;
            case "s":
                seniorDivs.add(new Division(dc, startDate, endDate));
                break;
            case "v":
                varsityDivs.add(new Division(dc, startDate, endDate));
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnParks;
    private javax.swing.JButton btnTeam;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblLine1;
    private javax.swing.JLabel lblParks;
    private javax.swing.JLabel lblSked;
    private javax.swing.JLabel lblTeams;
    // End of variables declaration//GEN-END:variables

}
