/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIPackage;

import healthcare.Encounter;
import healthcare.EncounterHistory;
import healthcare.Person;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import healthcare.VitalSigns;
import healthcare.System;


/**
 *
 * @author mynenidivya
 */
public class EncountersPanel extends javax.swing.JPanel {
    
    private JPanel displayJPanel;
    private Person person;
    

    /**
     * Creates new form EncountersPanel
     */
    public EncountersPanel(JPanel displayJPanel, Person person) {
        initComponents();
        this.displayJPanel=displayJPanel;
        this.person=person;
        initComponents();
        populateEncounterHistoryTable();
        java.lang.System.out.println("Inside EncountersPanel");
    }
      private String formateDate(Date date) {
       String Formate="yyyy-mm-dd hh:mm:ss";
       
       SimpleDateFormat Simple=new SimpleDateFormat(Formate);
       return Simple.format(date);
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        encounterHistoryJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        encounterHistoryJLabel = new javax.swing.JLabel();
        deleteJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        view = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        encounterHistoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Weight", "Age", "BP Systolic", "BP Diastolic", "Height", "Created ", "Updated "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(encounterHistoryJTable);

        backJButton.setFont(new java.awt.Font("STIXGeneral", 1, 14)); // NOI18N
        backJButton.setText("Previous");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        encounterHistoryJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        encounterHistoryJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encounterHistoryJLabel.setText(" Encounters History");

        deleteJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIPackage/delete.png"))); // NOI18N
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        addJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIPackage/Save.png"))); // NOI18N
        addJButton.setText("Add New Signs");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIPackage/edit.png"))); // NOI18N
        view.setText("View/Update");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(encounterHistoryJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encounterHistoryJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addJButton)
                .addGap(18, 18, 18)
                .addComponent(view)
                .addGap(18, 18, 18)
                .addComponent(deleteJButton)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        CardLayout cardLayout =  (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:

        int selectedIndex  = encounterHistoryJTable.getSelectedRow();
        if(selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to Delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) encounterHistoryJTable.getModel();
        VitalSignsPanel vitalSignsToDelete = (VitalSignsPanel) model.getValueAt(selectedIndex, 0);

        EncounterHistory encounterHistory = person.getPatient().getEncounterhistory();
        List<Encounter> encounters = encounterHistory.getEncounters();
        encounters.remove(selectedIndex);
        refreshView();
    }
    private void refreshView() {
        
        encounterHistoryJTable.setRowSelectionInterval(0,0);
        populateEncounterHistoryTable();
    

    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        AddingNewVitals vitalSignsAddJPanel = new AddingNewVitals(displayJPanel, person);
        displayJPanel.add("AddVitalSigns", vitalSignsAddJPanel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }
    
    private void navigateToVitalSignView(VitalSigns vitalSigns)
    {
    VitalSignsPanel vitalSignsJPanel = new VitalSignsPanel(displayJPanel, vitalSigns);
        displayJPanel.add("ViewVitalSigns",vitalSignsJPanel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }
    
    public void populateEncounterHistoryTable() {
        java.lang.System.out.println("Inside populateEncounterHistoryTable()");
        
        DefaultTableModel model = (DefaultTableModel) encounterHistoryJTable.getModel();
        model.setRowCount(0);
        
        EncounterHistory encounterHistory = person.getPatient().getEncounterhistory();
        List<Encounter> encounters = encounterHistory.getEncounters();
        
        for(Encounter encounter:encounters) {
            
            Object[] row = new Object[7];
            row[0]=encounter.getVitalSigns();
            row[1] = person.getAge();
            row[2]=encounter.getVitalSigns().getSystolic();
            row[3]=encounter.getVitalSigns().getDiastolic();
            row[4]=encounter.getVitalSigns().getHeight();
            row[5]=encounter.getVitalSigns().getCreated();
            row[6]=encounter.getVitalSigns().getUpdated();
            
            
            model.addRow(row);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        int selectedIndex  = encounterHistoryJTable.getSelectedRow();
        if(selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to View/Update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) encounterHistoryJTable.getModel();
        VitalSigns vitalSignsToUpdate = (VitalSigns) model.getValueAt(selectedIndex, 0);
        navigateToVitalSignView(vitalSignsToUpdate);
    }//GEN-LAST:event_viewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JLabel encounterHistoryJLabel;
    private javax.swing.JTable encounterHistoryJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
