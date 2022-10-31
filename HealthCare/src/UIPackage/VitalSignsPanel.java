/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIPackage;

import javax.swing.JPanel;
import healthcare.Encounter;
import healthcare.EncounterHistory;
import healthcare.VitalSigns;
import healthcare.System;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author mynenidivya
 */
public class VitalSignsPanel extends javax.swing.JPanel {

    /**
     * Creates new form VitalSignsPanel
     */
    private JPanel displayJPanel;
    private VitalSigns vitalSigns;
    public VitalSignsPanel(JPanel displayJPanel, VitalSigns vitalSigns) 
    {
        
        this.displayJPanel=displayJPanel;
        this.vitalSigns=vitalSigns;
        initComponents();
        displayData(vitalSigns);
    }
    private void displayData(VitalSigns vitalSigns){
        
        txtweight.setText(String.valueOf(vitalSigns.getWeight()));
        Systolic.setText(String.valueOf(vitalSigns.getSystolic()));
        Diastolic.setText(String.valueOf(vitalSigns.getDiastolic()));
        txtheight.setText(String.valueOf(vitalSigns.getHeight()));
        Temperature.setText(String.valueOf(vitalSigns.getTemperature()));
        txtpulseRate.setText(String.valueOf(vitalSigns.getPulseRate()));
        txtrespirationRate.setText(String.valueOf(vitalSigns.getRespirationRate()));
        lblupdatedonOUT.setText(vitalSigns.getUpdated());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcreatedon = new javax.swing.JLabel();
        lblcreatedonOUT = new javax.swing.JLabel();
        txtheight = new javax.swing.JTextField();
        lblupdatedon = new javax.swing.JLabel();
        vitalSignsJLabel = new javax.swing.JLabel();
        Temperature = new javax.swing.JTextField();
        lblupdatedonOUT = new javax.swing.JLabel();
        weightJLabel = new javax.swing.JLabel();
        txtpulseRate = new javax.swing.JTextField();
        txtweight = new javax.swing.JTextField();
        txtrespirationRate = new javax.swing.JTextField();
        bloodPressureSystolicJLabel = new javax.swing.JLabel();
        Systolic = new javax.swing.JTextField();
        updateJButton = new javax.swing.JButton();
        heightJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        bodyTemperatureJLabel = new javax.swing.JLabel();
        Diastolic = new javax.swing.JTextField();
        pulseRateJLabel = new javax.swing.JLabel();
        bloodPressureDiastolicJLabel = new javax.swing.JLabel();
        respirationRateJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        lblcreatedon.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblcreatedon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblupdatedon.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblupdatedon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblupdatedon.setText("Updated On :");

        vitalSignsJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        vitalSignsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vitalSignsJLabel.setText("Vital Signs");

        weightJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        weightJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        weightJLabel.setText("Weight :");

        bloodPressureSystolicJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bloodPressureSystolicJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bloodPressureSystolicJLabel.setText("Blood Pressure Systolic :");

        updateJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIPackage/edit.png"))); // NOI18N
        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        heightJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        heightJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        heightJLabel.setText("Height :");

        backJButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        backJButton.setText("previous");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        bodyTemperatureJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bodyTemperatureJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bodyTemperatureJLabel.setText("Body Temperature :");

        pulseRateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        pulseRateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pulseRateJLabel.setText("Pulse Rate :");

        bloodPressureDiastolicJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bloodPressureDiastolicJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bloodPressureDiastolicJLabel.setText("Blood Pressure Diastolic :");

        respirationRateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        respirationRateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        respirationRateJLabel.setText("Respiration Rate :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backJButton)
                        .addGap(61, 61, 61)
                        .addComponent(vitalSignsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblupdatedon)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(93, 93, 93)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(heightJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pulseRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(respirationRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(86, 86, 86)
                                            .addComponent(bodyTemperatureJLabel))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(137, 137, 137)
                                            .addComponent(lblcreatedon))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblupdatedonOUT)
                                            .addComponent(lblcreatedonOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtrespirationRate, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                            .addComponent(txtpulseRate)
                                            .addComponent(Temperature)
                                            .addComponent(txtheight)
                                            .addComponent(Diastolic)
                                            .addComponent(Systolic)
                                            .addComponent(txtweight)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(168, 168, 168)
                                    .addComponent(updateJButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(weightJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(224, 224, 224))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(bloodPressureSystolicJLabel)
                                            .addGap(217, 217, 217)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bloodPressureDiastolicJLabel)
                                        .addGap(217, 217, 217)))))))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vitalSignsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodPressureSystolicJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Systolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodPressureDiastolicJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Diastolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtheight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodyTemperatureJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Temperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulseRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respirationRateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcreatedon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcreatedonOUT))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblupdatedon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblupdatedonOUT))
                .addGap(7, 7, 7)
                .addComponent(updateJButton)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        //        VitalSignsPanel vitalSigns = new VitalSignsPanel();
        boolean success = false;
        try {
            double bodyTemperature = Double.parseDouble(Temperature.getText());
            vitalSigns.setTemperature(bodyTemperature);
            success = true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Body Temperature must be a Float decimal number");
            success = false;
        }

        try {
            int pulse = Integer.parseInt(txtpulseRate.getText());
            vitalSigns.setPulseRate(pulse);
            success = true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Pulse Rate must be an Integer");
            success = false;
        }

        try {
            double bloodPressureSystolic = Double.parseDouble(Systolic.getText());
            vitalSigns.setSystolic(bloodPressureSystolic);
            success = true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Systolic BP must be a Float decimal number");
            success = false;
        }

        try {
            double bloodPressureDiastolic = Double.parseDouble(Diastolic.getText());
            vitalSigns.setDiastolic(bloodPressureDiastolic);
            success = true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Diastolic Blood Pressure must be a Float decimal number");
            success = false;
        }

        try {
            int respirationRate = Integer.parseInt(txtrespirationRate.getText());
            vitalSigns.setRespirationRate(respirationRate);
            success = true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Respiration Rate must be an Integer");
            success = false;
        }

        try {
            double height = Double.parseDouble(txtheight.getText());
            vitalSigns.setHeight(height);
            success = true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Height must be a Float decimal number");
            success = false;
        }

        try {
            double weight = Double.parseDouble(txtweight.getText());
            vitalSigns.setWeight(weight);
            success = true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Weight must be a Float decimal number");
            success = false;
        }

        if (success) {
            vitalSigns.setUpdated(formateDate(new Date()));
            vitalSigns.setWeight(Double.valueOf(txtweight.getText()));
            vitalSigns.setSystolic(Double.valueOf(Systolic.getText()));
            vitalSigns.setDiastolic(Double.valueOf(Diastolic.getText()));
            vitalSigns.setHeight(Double.valueOf(txtheight.getText()));
            vitalSigns.setTemperature(Double.valueOf(Temperature.getText()));
            vitalSigns.setPulseRate(Integer.valueOf(txtpulseRate.getText()));
            vitalSigns.setRespirationRate(Integer.valueOf(txtrespirationRate.getText()));
            JOptionPane.showMessageDialog(this, "Successfully updated the Vital Signs");
            resetData();

        }

        //                        Encounter encounter = new Encounter(vitalSigns);
        //
        //            EncounterHistory encounterHistory = person.getPatient().getEncounterHistory();
        //            encounterHistory.getEncounterHistory().add(encounter);
    }
    
    private void resetData(){
        
        Systolic.setText("");
        Diastolic.setText("");
        Temperature.setText("");
        txtheight.setText("");
        txtpulseRate.setText("");
        txtrespirationRate.setText("");
        txtweight.setText("");
        lblcreatedonOUT.setText("");
        lblupdatedonOUT.setText("");
        
    
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        EncountersPanel encounterHistoryJPanel = (EncountersPanel) component;
        encounterHistoryJPanel.populateEncounterHistoryTable();
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }
    
    private String formateDate(Date date) {
       String Formate="yyyy-mm-dd hh:mm:ss";
       
       SimpleDateFormat Simple=new SimpleDateFormat(Formate);
       return Simple.format(date);
    
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Diastolic;
    private javax.swing.JTextField Systolic;
    private javax.swing.JTextField Temperature;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel bloodPressureDiastolicJLabel;
    private javax.swing.JLabel bloodPressureSystolicJLabel;
    private javax.swing.JLabel bodyTemperatureJLabel;
    private javax.swing.JLabel heightJLabel;
    private javax.swing.JLabel lblcreatedon;
    private javax.swing.JLabel lblcreatedonOUT;
    private javax.swing.JLabel lblupdatedon;
    private javax.swing.JLabel lblupdatedonOUT;
    private javax.swing.JLabel pulseRateJLabel;
    private javax.swing.JLabel respirationRateJLabel;
    private javax.swing.JTextField txtheight;
    private javax.swing.JTextField txtpulseRate;
    private javax.swing.JTextField txtrespirationRate;
    private javax.swing.JTextField txtweight;
    private javax.swing.JButton updateJButton;
    private javax.swing.JLabel vitalSignsJLabel;
    private javax.swing.JLabel weightJLabel;
    // End of variables declaration//GEN-END:variables
}
