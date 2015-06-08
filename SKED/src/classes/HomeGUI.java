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
import java.io.*;
import java.util.*;
import javax.swing.*;

public class HomeGUI extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    int year;

    SoftDate juniorStartDate;
    SoftDate seniorStartDate;
    SoftDate varsityStartDate;

    SoftDate juniorEndDate;
    SoftDate seniorEndDate;
    SoftDate varsityEndDate;

    ArrayList<Division> juniorDivs = new ArrayList<>();
    ArrayList<Division> seniorDivs = new ArrayList<>();
    ArrayList<Division> varsityDivs = new ArrayList<>();

    ArrayList<Park> juniorParks = new ArrayList<>();
    ArrayList<Park> seniorParks = new ArrayList<>();
    ArrayList<Park> varsityParks = new ArrayList<>();

    ArrayList<SoftDate> juniorDates = new ArrayList<>();

    public HomeGUI() {
        initComponents();
    }

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
        btnYear = new javax.swing.JButton();
        txtYear = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SFTBLSKDLR");
        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(255, 255, 204));
        setResizable(false);

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

        btnYear.setText("Select Year");
        btnYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnParks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblParks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                            .addComponent(lblSked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnYear)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnYear)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if (year > 0) {
            TeamsGUI t = new TeamsGUI(year, juniorDivs, seniorDivs, varsityDivs);
            t.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "YEAR IS NOT SPECIFIED");
        }

        //This code creates the team window and allows it to pop up upon command

    }//GEN-LAST:event_btnTeamActionPerformed

    private void btnParksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParksActionPerformed
        if (year > 0) {
            ParksGUI p = new ParksGUI(year, juniorStartDate, seniorStartDate, varsityStartDate,
                    juniorEndDate, seniorEndDate, varsityEndDate,
                    juniorParks, seniorParks, varsityParks);
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "YEAR IS NOT SPECIFIED");
        }
    }//GEN-LAST:event_btnParksActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (year > 0) {
            
//          match
//          schedule
        } else {
            JOptionPane.showMessageDialog(null, "YEAR IS NOT SPECIFIED");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearActionPerformed
        if (Integer.parseInt(txtYear.getText()) > 0) {
//            year = Integer.parseInt(txtYear.getText());
//            Calendar juniorCal = Calendar.getInstance();
//            juniorCal.clear();
//            juniorCal.set(Calendar.YEAR, year);
//            juniorCal.set(Calendar.MONTH, Calendar.JULY);
//            juniorCal.set(Calendar.DAY_OF_MONTH, 1);
//            juniorCal.add(Calendar.DAY_OF_YEAR, -7);
//            juniorStartDate = new SoftDate(juniorCal.getTimeInMillis());
//
//            Calendar seniorCal = Calendar.getInstance();
//            seniorCal.set(Calendar.YEAR, year);
//            seniorCal.set(Calendar.MONTH, Calendar.JUNE);
//            seniorCal.set(Calendar.DAY_OF_MONTH, 1);
//            seniorCal.add(Calendar.DAY_OF_YEAR, -7);
//            seniorStartDate = new SoftDate(seniorCal.getTimeInMillis());
//
//            Calendar varsityCal = Calendar.getInstance();
//            varsityCal.set(Calendar.YEAR, year);
//            varsityCal.set(Calendar.MONTH, Calendar.JULY);
//            varsityCal.set(Calendar.DAY_OF_MONTH, 1);
//            varsityCal.add(Calendar.DAY_OF_YEAR, -7);
//            varsityStartDate = new SoftDate(varsityCal.getTimeInMillis());

        } else {
            JOptionPane.showMessageDialog(null, "YEAR IS NOT VALID");
        }
    }//GEN-LAST:event_btnYearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
            @Override
            public void run() {
                new HomeGUI().setVisible(true);
            }
        });
        //list of playable days

    }
    //this class generates the schedule for all of the teams based on all of the factors inputed by the convener
    //This class adds a division when needed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnParks;
    private javax.swing.JButton btnTeam;
    private javax.swing.JButton btnYear;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblLine1;
    private javax.swing.JLabel lblParks;
    private javax.swing.JLabel lblSked;
    private javax.swing.JLabel lblTeams;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

}
