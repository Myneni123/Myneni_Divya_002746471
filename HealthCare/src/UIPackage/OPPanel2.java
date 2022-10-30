/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIPackage;

import healthcare.System1;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mynenidivya
 */
public class OPPanel2 extends javax.swing.JPanel {

    /**
     * Creates new form OPPanel2
     */
    private System1 system;
    private JPanel displayJPanel;
    public OPPanel2(JPanel displayJPanel,System1 system) {
        initComponents();
        this.displayJPanel=displayJPanel;
        this.system = system;
    }
      String regxPatientName = "^[a-zA-Z\\s]+$";
    String regxAge = "^[0-9]{0,2}+\\.?[0-9]{0,2}$";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtgender = new javax.swing.JComboBox<>();
        Gender = new javax.swing.JLabel();
        lblpersonname = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        txtpatientname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Consultation = new javax.swing.JLabel();
        fee = new javax.swing.JComboBox<>();
        Illness = new javax.swing.JLabel();
        txtilliness = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Married = new javax.swing.JLabel();
        Emergency = new javax.swing.JLabel();
        marry = new javax.swing.JComboBox<>();
        em = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 204, 204));

        txtgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));

        Gender.setText("Gender : ");

        lblpersonname.setText(" Name : ");

        lblage.setText("Age :");

        txtpatientname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpatientnameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("    Please fill the form:");

        Consultation.setText("Consultation Fee");

        fee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Debit card", "Credit card" }));
        fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeActionPerformed(evt);
            }
        });

        Illness.setText("Illness");

        txtilliness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtillinessActionPerformed(evt);
            }
        });

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Married.setText("Married");

        Emergency.setText("Emergency");

        marry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Married", "Single", "Widow" }));

        em.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gender)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblpersonname)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(112, 112, 112)
                                            .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtpatientname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Consultation)
                                                .addComponent(lblage)
                                                .addComponent(Illness)
                                                .addComponent(Married)
                                                .addComponent(Emergency))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(Save)
                                            .addGap(47, 47, 47)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtage)
                                        .addComponent(fee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtilliness)
                                        .addComponent(marry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(em, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpersonname, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpatientname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblage, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consultation)
                    .addComponent(fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Illness)
                    .addComponent(txtilliness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Married)
                    .addComponent(marry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Emergency))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(Save)
                        .addGap(97, 97, 97))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtpatientnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpatientnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpatientnameActionPerformed

    private void feeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feeActionPerformed

    private void txtillinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtillinessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtillinessActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
      
        String Name=txtpatientname.getText();
        String Age=txtage.getText();
        String Illness=txtilliness.getText();
        Gender.setText(txtgender.getSelectedItem().toString());
        Consultation.setText(fee.getSelectedItem().toString());
        Emergency.setText(em.getSelectedItem().toString());
        Married.setText(marry.getSelectedItem().toString());
        JOptionPane.showMessageDialog(this, "Patient Name: "+Name+"\nAge: "+Age+"\nIllness: "+Illness+"\nRegistration form submitted");
        
    }//GEN-LAST:event_SaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Consultation;
    private javax.swing.JLabel Emergency;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Illness;
    private javax.swing.JLabel Married;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> em;
    private javax.swing.JComboBox<String> fee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblpersonname;
    private javax.swing.JComboBox<String> marry;
    private javax.swing.JTextField txtage;
    private javax.swing.JComboBox<String> txtgender;
    private javax.swing.JTextField txtilliness;
    private javax.swing.JTextField txtpatientname;
    // End of variables declaration//GEN-END:variables
}