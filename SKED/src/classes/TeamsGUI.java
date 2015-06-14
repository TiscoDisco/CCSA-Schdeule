package classes;

import java.util.*;
import javax.swing.*;

/*
 * @author tim
 */



public class TeamsGUI extends javax.swing.JFrame {

    /*
     * Creates new form Teams
     */
    int year;
// this creates a list of divisions
    ArrayList<Division> juniorDivs;
    ArrayList<Division> seniorDivs;
    ArrayList<Division> varsityDivs;
// this creates a list of no play days
    ArrayList<SoftDate> noPlays = new ArrayList<>();

    public TeamsGUI(int y,
            ArrayList<Division> jd, ArrayList<Division> sd, ArrayList<Division> vd) {
        initComponents();
        year = y;
        juniorDivs = jd;
        seniorDivs = sd;
        varsityDivs = vd;
        display();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        // declaring objects
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        lblJuniorteams = new javax.swing.JLabel();
        lblSeniorteams = new javax.swing.JLabel();
        lblVarsityteams = new javax.swing.JLabel();
        boxJDivs = new javax.swing.JComboBox();
        boxSDivs = new javax.swing.JComboBox();
        boxVDivs = new javax.swing.JComboBox();
        lblAddTeam = new javax.swing.JLabel();
        lblnNoPlayDays = new javax.swing.JLabel();
        lblTeamname = new javax.swing.JLabel();
        lblChurch = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        txtfieldTeamname = new javax.swing.JTextField();
        txtfieldChurch = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        btnCancelteams = new javax.swing.JButton();
        lblTeamCode = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        lblTeams = new javax.swing.JLabel();
        lblJunior = new javax.swing.JLabel();
        lblSenior = new javax.swing.JLabel();
        lblVarsity = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        lblLine3 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        btnNoPlayDate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        // setting the objects
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teams");
        setResizable(false);

        lblJuniorteams.setText("Junior Teams");

        lblSeniorteams.setText("Senior Teams");

        lblVarsityteams.setText("Varsity Teams");

        boxJDivs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxSDivs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxVDivs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAddTeam.setText("Add Team :");

        lblnNoPlayDays.setText("No Play Days :");

        lblTeamname.setText("Team Name:");

        lblChurch.setText("Church Initials:");

        lblMonth.setText("Month");

        lblDay.setText("Day");

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnCancelteams.setText("<-");
        btnCancelteams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelteamsActionPerformed(evt);
            }
        });

        lblTeamCode.setText("Team Code:");

        btnDelete.setText("Delete Team");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTeams.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTeams.setText("Teams");

        lblJunior.setText("Junior");

        lblSenior.setText("Senior");

        lblVarsity.setText("Varsity");

        lblLine3.setText("_____________________________________________________________________");

        btnNoPlayDate.setText("Add No Play Date");
        btnNoPlayDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoPlayDateActionPerformed(evt);
            }
        });

        jLabel3.setText("No Play Dates:");
        //this sets the horizontal layout 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLine3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJuniorteams))
                        .addGap(415, 444, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(boxJDivs, 0, 114, Short.MAX_VALUE)
                                .addComponent(boxSDivs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boxVDivs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblSeniorteams)
                            .addComponent(lblVarsityteams))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDay, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMonth, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 246, Short.MAX_VALUE)
                                        .addComponent(btnCancelteams, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                                    .addComponent(jTextField16))
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnNoPlayDate)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3))))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddTeam)
                                    .addComponent(lblnNoPlayDays)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblChurch)
                                            .addComponent(lblTeamname))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtfieldTeamname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtfieldChurch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTeamCode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnDelete)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblJunior))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(lblSenior))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblVarsity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField14))))
                                .addContainerGap())))))
        );
        // this sets the vertical layout
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelteams))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLine3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblJuniorteams)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddTeam, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boxJDivs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTeamname)
                            .addComponent(txtfieldTeamname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChurch)
                            .addComponent(txtfieldChurch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJunior)
                            .addComponent(lblVarsity)
                            .addComponent(lblSenior))
                        .addGap(7, 7, 7)
                        .addComponent(lblSeniorteams)
                        .addGap(7, 7, 7)
                        .addComponent(boxSDivs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblnNoPlayDays)
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonth)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoPlayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDay)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVarsityteams)
                    .addComponent(lblTeamCode)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(boxVDivs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnEnter))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        //store values of a team inputed by user
        String teamName = txtfieldTeamname.getText();
        String churchName = txtfieldChurch.getText();
        boolean hasDiv = false;
        boolean hasTeam = false;
        String divisionCode = jTextField12.getText() + jTextField14.getText() + jTextField13.getText();
        String teamCode;
        /*
         * generate the team code from the league input and the team name 
         * and display in its appropriate list
         */
        if (!(teamName.length() > 0 && churchName.length() > 0
                && (!jTextField12.getText().isEmpty() ^ !jTextField14.getText().isEmpty() ^ !jTextField13.getText().isEmpty()))) {
            JOptionPane.showMessageDialog(null, "INPUT INCOMPLETE OR INVALID");
        } else {
            if (jTextField12.getText().length() > 0) {
                divisionCode = "JT" + divisionCode;
                for (Division juniorDiv : juniorDivs) {
                    if (juniorDiv.getDivCode().equals(divisionCode)) {
                        hasDiv = true;
                        for (Team checkTeam : juniorDiv.getTeamList()) {
                            if (checkTeam.getName().equals(teamName) && checkTeam.getChurch().equals(churchName)) {
                                hasTeam = true;
                                checkTeam.setNoPlay(noPlays);
                                break;
                            }
                        }
                        if (!hasTeam) {
                            for (int i = 0; i < 100; i++) {
                                if (juniorDiv.codeAvail(i)) {
                                    if (i < 10) {
                                        teamCode = divisionCode + "0" + String.valueOf(juniorDiv.getTeamList().size());
                                    } else {
                                        teamCode = divisionCode + String.valueOf(juniorDiv.getTeamList().size());
                                    }
                                    juniorDiv.addTeam(teamName, churchName, teamCode, noPlays);

                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                if (!hasDiv) {
                    teamCode = divisionCode + "00";
                    juniorDivs.add(new Division(divisionCode));
                    juniorDivs.get(juniorDivs.size() - 1).addTeam(teamName, churchName, teamCode, noPlays);

                }

            } else if (jTextField13.getText().length() > 0) {
                divisionCode = "ST" + divisionCode;
                for (Division seniorDiv : seniorDivs) {
                    if (seniorDiv.getDivCode().equals(divisionCode)) {
                        hasDiv = true;
                        for (Team checkTeam : seniorDiv.getTeamList()) {
                            if (checkTeam.getName().equals(teamName) && checkTeam.getChurch().equals(churchName)) {
                                hasTeam = true;
                                checkTeam.setNoPlay(noPlays);
                                break;
                            }
                        }
                        if (!hasTeam) {
                            for (int i = 0; i < 100; i++) {
                                if (seniorDiv.codeAvail(i)) {
                                    if (i < 10) {
                                        teamCode = divisionCode + "0" + String.valueOf(seniorDiv.getTeamList().size());
                                    } else {
                                        teamCode = divisionCode + String.valueOf(seniorDiv.getTeamList().size());
                                    }
                                    seniorDiv.addTeam(teamName, churchName, teamCode, noPlays);

                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                if (!hasDiv) {
                    teamCode = divisionCode + "00";
                    seniorDivs.add(new Division(divisionCode));
                    seniorDivs.get(seniorDivs.size() - 1).addTeam(teamName, churchName, teamCode, noPlays);

                }
            } else {
                divisionCode = "VT" + divisionCode;
                for (Division varsityDiv : varsityDivs) {
                    if (varsityDiv.getDivCode().equals(divisionCode)) {
                        hasDiv = true;
                        for (Team checkTeam : varsityDiv.getTeamList()) {
                            if (checkTeam.getName().equals(teamName) && checkTeam.getChurch().equals(churchName)) {
                                hasTeam = true;
                                checkTeam.setNoPlay(noPlays);
                                break;
                            }
                        }
                        if (!hasTeam) {
                            for (int i = 0; i < 100; i++) {
                                if (varsityDiv.codeAvail(i)) {
                                    if (i < 10) {
                                        teamCode = divisionCode + "0" + String.valueOf(varsityDiv.getTeamList().size());
                                    } else {
                                        teamCode = divisionCode + String.valueOf(varsityDiv.getTeamList().size());
                                    }
                                    varsityDiv.addTeam(teamName, churchName, teamCode, noPlays);

                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                if (!hasDiv) {
                    teamCode = divisionCode + "00";
                    varsityDivs.add(new Division(divisionCode));
                    varsityDivs.get(varsityDivs.size() - 1).addTeam(teamName, churchName, teamCode, noPlays);
                }
            }
        }
        formClear();
        display();
    }//GEN-LAST:event_btnEnterActionPerformed
//close the team GUI
    private void btnCancelteamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelteamsActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelteamsActionPerformed
    //collect and store the team's no-play date
    private void btnNoPlayDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoPlayDateActionPerformed
        int month = Integer.parseInt(jTextField15.getText()) - 1;
        int day = Integer.parseInt(jTextField16.getText());
        Calendar thisCal = Calendar.getInstance();
        thisCal.clear();
        thisCal.set(year, month, day);
        noPlays.add(new SoftDate(thisCal.getTimeInMillis()));

        display();
    }//GEN-LAST:event_btnNoPlayDateActionPerformed
    //delete a team if its team code appears in any list
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String teamCode = jTextField11.getText();
        if (teamCode.length() < 4) {
            JOptionPane.showMessageDialog(null, "INPUT INCOMPLETE");
        } else {
            if (teamCode.substring(0, 1).equals("J")) {
                for (Division juniorDiv : juniorDivs) {
                    if (juniorDiv.getDivCode().equals(teamCode.substring(0, teamCode.length() - 2))) {
                        for (Team t : juniorDiv.getTeamList()) {
                            if (t.getCode().equals(teamCode)) {
                                juniorDiv.removeTeam(t);
                                break;
                            }
                        }
                    }
                }
            }
            if (teamCode.substring(0, 1).equals("S")) {
                for (Division seniorDiv : seniorDivs) {
                    if (seniorDiv.getDivCode().equals(teamCode.substring(0, teamCode.length() - 2))) {
                        for (Team t : seniorDiv.getTeamList()) {
                            if (t.getCode().equals(teamCode)) {
                                seniorDiv.removeTeam(t);
                                break;
                            }
                        }
                    }
                }
            }
            if (teamCode.substring(0, 1).equals("V")) {
                for (Division varsityDiv : varsityDivs) {
                    if (varsityDiv.getDivCode().equals(teamCode.substring(0, teamCode.length() - 2))) {
                        for (Team t : varsityDiv.getTeamList()) {
                            if (t.getCode().equals(teamCode)) {
                                varsityDiv.removeTeam(t);
                                break;
                            }
                        }
                    }
                }
            }
        }
        formClear();
        display();
    }//GEN-LAST:event_btnDeleteActionPerformed
    // this is the display boxes code
    private void display() {
        boxJDivs.removeAllItems();
        boxSDivs.removeAllItems();
        boxVDivs.removeAllItems();
        for (Division juniorDiv : juniorDivs) {
            for (int j = 0; j < juniorDiv.getTeamList().size(); j++) {
                boxJDivs.addItem(juniorDiv.getTeamList().get(j).getCode() + " " + juniorDiv.getTeamList().get(j).getName());
            }
        }
        for (Division seniorDiv : seniorDivs) {
            for (int j = 0; j < seniorDiv.getTeamList().size(); j++) {
                boxSDivs.addItem(seniorDiv.getTeamList().get(j).getCode() + " " + seniorDiv.getTeamList().get(j).getName());
            }
        }
        for (Division varsityDiv : varsityDivs) {
            for (int j = 0; j < varsityDiv.getTeamList().size(); j++) {
                boxVDivs.addItem(varsityDiv.getTeamList().get(j).getCode() + " " + varsityDiv.getTeamList().get(j).getName());
            }
        }
    }

    private void formClear() { // this clears the form
        noPlays.clear();
        jTextField11.setText(null);
        jTextField12.setText(null);
        jTextField13.setText(null);
        jTextField14.setText(null);
        jTextField15.setText(null);
        jTextField16.setText(null);
        txtfieldChurch.setText(null);
        txtfieldTeamname.setText(null);
    }
    /**
     *
     */
//    public static void main(ArrayList<Division> jd, ArrayList<Division> sd, ArrayList<Division> vd, ArrayList<Park> jp, ArrayList<Division> sp, ArrayList<Division> vp,
//            SoftDate js, SoftDate ss, SoftDate vs, SoftDate ed) {
//
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TeamsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TeamsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TeamsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TeamsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TeamsGUI().setVisible(true);
//            }
//        });
//    }
//<editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxJDivs;
    private javax.swing.JComboBox boxSDivs;
    private javax.swing.JComboBox boxVDivs;
    private javax.swing.JButton btnCancelteams;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnNoPlayDate;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JLabel lblAddTeam;
    private javax.swing.JLabel lblChurch;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblJunior;
    private javax.swing.JLabel lblJuniorteams;
    private javax.swing.JLabel lblLine3;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblSenior;
    private javax.swing.JLabel lblSeniorteams;
    private javax.swing.JLabel lblTeamCode;
    private javax.swing.JLabel lblTeamname;
    private javax.swing.JLabel lblTeams;
    private javax.swing.JLabel lblVarsity;
    private javax.swing.JLabel lblVarsityteams;
    private javax.swing.JLabel lblnNoPlayDays;
    private javax.swing.JTextField txtfieldChurch;
    private javax.swing.JTextField txtfieldTeamname;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
