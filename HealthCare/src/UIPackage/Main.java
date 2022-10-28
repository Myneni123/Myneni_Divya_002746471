/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIPackage;


import healthcare.DataHospital;
import healthcare.DataInitializer;
import healthcare.House;
import java.awt.CardLayout;
import healthcare.System;
import healthcare.Patient;
import healthcare.System1;
/**
 *
 * @author mynenidivya
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private System system;
    private House house;
    private System1 System;
     public Main() {
         initComponents();
        initializeData();
        initialize1Data();
        setDefaultRightComponent();
    }
     private void setDefaultRightComponent() {
        CommunityActionPerformed(null);
    }

    private void initializeData() {
        system = DataInitializer.initializeSystem();
    }
     private void initialize1Data() {
        System = DataHospital.initializeSystem();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        Community = new javax.swing.JButton();
        Hospital = new javax.swing.JButton();
        HOS = new javax.swing.JButton();
        PAT = new javax.swing.JButton();
        displayJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlJPanel.setBackground(new java.awt.Color(255, 204, 204));

        Community.setText("Community");
        Community.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunityActionPerformed(evt);
            }
        });

        Hospital.setText("Doctor");
        Hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalActionPerformed(evt);
            }
        });

        HOS.setText("Hospital");
        HOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOSActionPerformed(evt);
            }
        });

        PAT.setText("Patient");
        PAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PATActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PAT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Hospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Community, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );
        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(Community)
                .addGap(30, 30, 30)
                .addComponent(Hospital)
                .addGap(37, 37, 37)
                .addComponent(HOS)
                .addGap(37, 37, 37)
                .addComponent(PAT)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(controlJPanel);

        displayJPanel.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(displayJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunityActionPerformed
        // TODO add your handling code here:
          SystemPanel sysJPanel = new SystemPanel(displayJPanel,system);
         displayJPanel.add("CitiesInformation",sysJPanel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
                                            
    }//GEN-LAST:event_CommunityActionPerformed

    private void HospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalActionPerformed
        // TODO add your handling code here:
       HospitalLogin hospitalPanel = new HospitalLogin(displayJPanel, system);
         displayJPanel.add("UserLogin",hospitalPanel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }//GEN-LAST:event_HospitalActionPerformed

    private void HOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOSActionPerformed
        // TODO add your handling code here:
        CityPanel Panel = new CityPanel(displayJPanel, System);
         displayJPanel.add("UserLogin",Panel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }//GEN-LAST:event_HOSActionPerformed

    private void PATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PATActionPerformed
        // TODO add your handling code here:
        OPPanel1 Panel = new OPPanel1(displayJPanel, System);
         displayJPanel.add("UserLogin",Panel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }//GEN-LAST:event_PATActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Community;
    private javax.swing.JButton HOS;
    private javax.swing.JButton Hospital;
    private javax.swing.JButton PAT;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JPanel displayJPanel;
    // End of variables declaration//GEN-END:variables
}
