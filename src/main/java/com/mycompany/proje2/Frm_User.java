/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proje2;

import static com.mycompany.proje2.Frm_Admin.tbl_match_model;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nesma
 */
public class Frm_User extends javax.swing.JFrame {

    DefaultTableModel tbl_team_model;
    DefaultTableModel tbl_match_model;

    /**
     * Creates new form Frm_User
     */
    public Frm_User() {
        initComponents();
        tbl_team_model = new DefaultTableModel();//Tablo üzerinde işlem yapabilmek için modeli tanımlanır
        tbl_team_model.setColumnIdentifiers(new Object[]{"ID", "TEAM NAME", "COACH"});
        tbl_teams.setModel(tbl_team_model);
        tbl_match_model = new DefaultTableModel();
        tbl_match_model.setColumnIdentifiers(new Object[]{"ID", "TEAM", "TEAM", "WEEK", "TIME", "SCORE"});
        tbl_match.setModel(tbl_match_model);
        rdmntm_turkish.setSelected(false);
        rdmntm_english.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tppdpane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txt_searchTeam = new javax.swing.JTextField();
        btn_searchTeam = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_teams = new javax.swing.JTable();
        btn_showAllTeams = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_searchMatch = new javax.swing.JButton();
        txt_searchMatchOrWeek = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_match = new javax.swing.JTable();
        btn_showallmatches = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        mn_language = new javax.swing.JMenu();
        rdmntm_english = new javax.swing.JRadioButtonMenuItem();
        rdmntm_turkish = new javax.swing.JRadioButtonMenuItem();
        mntm_exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        txt_searchTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchTeamActionPerformed(evt);
            }
        });

        btn_searchTeam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_searchTeam.setText("SEARCH  TEAM");
        btn_searchTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchTeamActionPerformed(evt);
            }
        });

        tbl_teams.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "TEAM", "COACH"
            }
        ));
        jScrollPane1.setViewportView(tbl_teams);

        btn_showAllTeams.setBackground(new java.awt.Color(204, 204, 255));
        btn_showAllTeams.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_showAllTeams.setText("SHOW ALL TEAMS");
        btn_showAllTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showAllTeamsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(btn_showAllTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_searchTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btn_searchTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_searchTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_searchTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_showAllTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tppdpane.addTab("SHOW TEAMS", jPanel1);

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(700, 581));
        jPanel5.setMinimumSize(new java.awt.Dimension(700, 581));

        btn_searchMatch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_searchMatch.setText("SEARCH");
        btn_searchMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchMatchActionPerformed(evt);
            }
        });

        txt_searchMatchOrWeek.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tbl_match.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "TEAM", "TEAM", "WEEK", "TIME", "SCORE"
            }
        ));
        jScrollPane2.setViewportView(tbl_match);

        btn_showallmatches.setBackground(new java.awt.Color(153, 204, 255));
        btn_showallmatches.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_showallmatches.setText("SHOW ALL MATCHES");
        btn_showallmatches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showallmatchesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_searchMatchOrWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_searchMatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btn_showallmatches, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_searchMatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_searchMatchOrWeek, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_showallmatches, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tppdpane.addTab("SHOW MATCHES", jPanel5);

        getContentPane().add(tppdpane);

        menu.setText("MENU");

        mn_language.setText("LANGUAGE");

        rdmntm_english.setSelected(true);
        rdmntm_english.setText("ENGLISH");
        rdmntm_english.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdmntm_englishActionPerformed(evt);
            }
        });
        mn_language.add(rdmntm_english);

        rdmntm_turkish.setSelected(true);
        rdmntm_turkish.setText("TURKISH");
        rdmntm_turkish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdmntm_turkishActionPerformed(evt);
            }
        });
        mn_language.add(rdmntm_turkish);

        menu.add(mn_language);

        mntm_exit.setText("EXIT");
        mntm_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntm_exitActionPerformed(evt);
            }
        });
        menu.add(mntm_exit);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdmntm_turkishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdmntm_turkishActionPerformed
        if (rdmntm_turkish.isSelected()) {
            btn_searchTeam.setText("TAKIM ARA");
            tbl_team_model.setColumnIdentifiers(new Object[]{"İD", "TAKIM", "TEKNİK DİREKTÖR"});
            btn_showAllTeams.setText("TÜM TAKIMLARI GÖSTER");
            tppdpane.setTitleAt(0, "TAKIMLARI GÖSTER");
            tppdpane.setTitleAt(1, "MAÇLARI GÖSTER");
            menu.setText("MENÜ");
            mn_language.setText("DİL");
            rdmntm_turkish.setText("TÜRKÇE");
            rdmntm_english.setText("İNGİLİZCE");
            mntm_exit.setText("ÇIKIŞ");
            btn_searchMatch.setText("ARA");
            btn_showallmatches.setText("TÜM MAÇLARI GÖSTER");
            tbl_match_model.setColumnIdentifiers(new Object[]{"İD", "TAKIM", "TAKIM", "HAFTA", "SAAT", "SKOR"});
            rdmntm_english.setSelected(false);
        } else {
            rdmntm_turkish.setSelected(true);
        }
    }//GEN-LAST:event_rdmntm_turkishActionPerformed

    private void btn_showAllTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showAllTeamsActionPerformed
        tbl_team_model.setRowCount(0);
        ArrayList<Team> tlist = DB_Team_Management.GetTeams();//Veritabanındaki tüm takımlar getirilir

        for (Team tm1 : tlist) {
            tbl_team_model.addRow(new Object[]{tm1.id, tm1.name, tm1.coach});

        }
    }//GEN-LAST:event_btn_showAllTeamsActionPerformed

    private void mntm_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntm_exitActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to close page?", "Closing", JOptionPane.YES_NO_OPTION);
        switch (option) {
            case JOptionPane.YES_OPTION:
                dispose();
                break;
            case JOptionPane.NO_OPTION:
                break;
        }
    }//GEN-LAST:event_mntm_exitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ArrayList<Team> teams = DB_Team_Management.GetTeams();//Veritabanındaki tüm takımlar getirilir

        for (Team team : teams) {

            tbl_team_model.addRow(new Object[]{team.id, team.name, team.coach});
        }
        ArrayList<Match> matches = DB_Match_Management.GetMatches();//Veritabanındaki tüm maçlar getirilir

        for (Match match : matches) {
            tbl_match_model.addRow(new Object[]{match.id, match.first_team, match.second_team, match.week, match.time, match.score});
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_searchTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchTeamActionPerformed
        String search = txt_searchTeam.getText().toUpperCase();
        boolean isFounded = false;
        boolean isFull = false;

        if (search.compareTo("") == 0) {//Hiçbir şey yazılmamışsa uyarı mesajı verilir
            JOptionPane.showMessageDialog(rootPane, "Please write a team name");
            isFull = true;
        } else {
            tbl_team_model.setRowCount(0);
            ArrayList<Team> tlist = DB_Team_Management.SearchByTeamName(search);
            for (Team tm1 : tlist) {
                tbl_team_model.addRow(new Object[]{tm1.id, tm1.name, tm1.coach});//Aranan özellikteki takımlar tabloya getirilir
                isFounded = true;

            }
        }

        if (!isFounded & !isFull) {//Boş değilse ve aranan özellikte bir takım bulunamadıysa 
            JOptionPane.showMessageDialog(rootPane, "Team not founded");

        }
    }//GEN-LAST:event_btn_searchTeamActionPerformed

    private void btn_searchMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchMatchActionPerformed
        String search = txt_searchMatchOrWeek.getText().toUpperCase();

        boolean isFounded = false;
        boolean isFull = false;
        if (search.compareTo("") == 0) {//Hiçbir şey yazılmamışsa uyarı mesajı verilir
            JOptionPane.showMessageDialog(rootPane, "Please write a team name or match week");
            isFull = true;
        } else {
            tbl_match_model.setRowCount(0);
            ArrayList<Match> mlist = DB_Match_Management.SearchByMatchNameOrWeek(search);
            for (Match m1 : mlist) {
                tbl_match_model.addRow(new Object[]{m1.id, m1.first_team, m1.second_team, m1.week, m1.time, m1.score});//Aranan özellikteki maçlar tabloya getirilir
                isFounded = true;

            }
        }

        if (!isFounded & !isFull) {//Boş değilse ve aranan özellikte bir maç bulunamadıysa
            JOptionPane.showMessageDialog(rootPane, "Match not founded");

        }
    }//GEN-LAST:event_btn_searchMatchActionPerformed

    private void btn_showallmatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showallmatchesActionPerformed
        tbl_match_model.setRowCount(0);
        ArrayList<Match> mlist = DB_Match_Management.GetMatches();//Veritabanındaki tüm maçlar getirilir

        for (Match match : mlist) {
            tbl_match_model.addRow(new Object[]{match.id, match.first_team, match.second_team, match.week, match.time, match.score});
        }
    }//GEN-LAST:event_btn_showallmatchesActionPerformed

    private void rdmntm_englishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdmntm_englishActionPerformed
        if (rdmntm_english.isSelected()) {
            btn_searchTeam.setText("SEARCH TEAM");
            tbl_team_model.setColumnIdentifiers(new Object[]{"ID", "TEAM", "COACH"});
            btn_showAllTeams.setText("SHOW ALL TEAMS");
            tppdpane.setTitleAt(0, "SHOW TEAMS");
            tppdpane.setTitleAt(1, "SHOW MATCHES");
            menu.setText("MENU");
            mn_language.setText("LANGUAGE");
            rdmntm_turkish.setText("TURKISH");
            rdmntm_english.setText("ENGLİSH");
            mntm_exit.setText("EXIT");
            btn_searchMatch.setText("SEARCH");
            btn_showallmatches.setText("SHOW ALL MATCHES");
            tbl_match_model.setColumnIdentifiers(new Object[]{"ID", "TEAM", "TEAM", "WEEK", "TIME", "SCORE"});
            rdmntm_turkish.setSelected(false);
        } else {
            rdmntm_english.setSelected(true);
        }
    }//GEN-LAST:event_rdmntm_englishActionPerformed

    private void txt_searchTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchTeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchTeamActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Frm_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_searchMatch;
    private javax.swing.JButton btn_searchTeam;
    private javax.swing.JButton btn_showAllTeams;
    private javax.swing.JButton btn_showallmatches;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menu;
    private javax.swing.JMenu mn_language;
    private javax.swing.JMenuItem mntm_exit;
    private javax.swing.JRadioButtonMenuItem rdmntm_english;
    private javax.swing.JRadioButtonMenuItem rdmntm_turkish;
    private javax.swing.JTable tbl_match;
    private javax.swing.JTable tbl_teams;
    private javax.swing.JTabbedPane tppdpane;
    private javax.swing.JTextField txt_searchMatchOrWeek;
    private javax.swing.JTextField txt_searchTeam;
    // End of variables declaration//GEN-END:variables
}
