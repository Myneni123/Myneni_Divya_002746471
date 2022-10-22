/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIPackage;

import healthcare.City;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import healthcare.Community;
import healthcare.House;
import healthcare.Person;
import healthcare.System;

/**
 *
 * @author mynenidivya
 */
public class CommunityPanel extends javax.swing.JPanel {

    /**
     * Creates new form Community
     */
      
    private System system;
    private JPanel displayJPanel;
    private String selectedCity;
    private City City;
    public CommunityPanel(JPanel displayJPanel, System system, String selectedCity) {
        
        java.lang.System.out.println("Inside the communityJpanel : " + selectedCity);
        this.displayJPanel=displayJPanel;
        this.system=system;
        this.selectedCity=selectedCity;
        initComponents();
        populateTable();
    }
    
    String regxCommunityName = "^[a-zA-Z\\s]+$";
    String regxPopulation = "^[0-9]*$";
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addJButton = new javax.swing.JButton();
        updateJButton = new javax.swing.JButton();
        lblcommunityName1 = new javax.swing.JLabel();
        lblpopulation = new javax.swing.JLabel();
        txtcommunityname = new javax.swing.JTextField();
        communitiesJLabel = new javax.swing.JLabel();
        txtpopulation = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        communityJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        goJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        lblcommunityName1.setText("Community Name : ");

        lblpopulation.setText("Population :");

        communitiesJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        communitiesJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        communitiesJLabel.setText("Communities Present");

        communityJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Community Name", "Population"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        communityJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                communityJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(communityJTable);

        backJButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        backJButton.setText("Pervious");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        goJButton.setText("Open");
        goJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goJButtonActionPerformed(evt);
            }
        });

        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(goJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addJButton)
                            .addComponent(deleteJButton)
                            .addComponent(updateJButton))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcommunityName1)
                            .addComponent(lblpopulation))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcommunityname, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(communitiesJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(communitiesJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addJButton)
                            .addComponent(txtcommunityname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcommunityName1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(deleteJButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblpopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(updateJButton)))))
                .addGap(18, 18, 18)
                .addComponent(goJButton)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        AddNewCommunity addCommunityJPanel = new AddNewCommunity(displayJPanel, City);
        displayJPanel.add("AddCommunityScreen", addCommunityJPanel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }//GEN-LAST:event_addJButtonActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        int selectedRowIndex = communityJTable.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) communityJTable.getModel();
        Community community = (Community) model.getValueAt(selectedRowIndex, 0);

        if (community.getCommunityName().equals(txtcommunityname.getText()) && String.valueOf(community.getPopulation()).equals(txtpopulation.getText())){
            JOptionPane.showMessageDialog(this, "No new values entered\nPlease enter a new community name");
            return;
        }else{
            if (txtcommunityname.getText().matches(regxCommunityName) && txtpopulation.getText().matches(regxPopulation)){
                long population = txtpopulation.getText().isEmpty()?0:Long.parseLong(txtpopulation.getText());
                community.setCommunityName(txtcommunityname.getText());
                community.setPopulation(population);

                JOptionPane.showMessageDialog(this, "Community updated successfully");
                populateTable();

                txtcommunityname.setText("");
                txtpopulation.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "Enter a valid details\nOnly alphabets and spaces allowed for Community Name\nOnly numbers allowed for Population");
            }
        }
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void communityJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_communityJTableMouseClicked
        int selectedRowIndex = communityJTable.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) communityJTable.getModel();
        Community community = (Community) model.getValueAt(selectedRowIndex, 0);

        txtcommunityname.setText(community.getCommunityName());
        txtpopulation.setText(String.valueOf(community.getPopulation()));
    }
        private void showHousesInCommunity(int selectedRow) {
        
        DefaultTableModel model = (DefaultTableModel) communityJTable.getModel();
        Community community = (Community) model.getValueAt(selectedRow, 0);
        navigateToHouses(community);
    }
    
    private void navigateToHouses(Community community){
        
        HousePanel House = new HousePanel(displayJPanel,system,community);
        displayJPanel.add("Info of House", House);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }
    
    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) communityJTable.getModel();
        model.setRowCount(0);
        
        for(City city:system.getCities()) {
            if(city.getCityName().equalsIgnoreCase(selectedCity)){
                this.City=city;
                for(Community community:city.getCommunities()){
                    Object[] row = new Object[2];
                    row[0]=community;
                    row[1]=community.getPopulation();
                    
                    model.addRow(row);
                }
            }
        }
        
        java.lang.System.out.println(model.getRowCount());
    
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_communityJTableMouseClicked

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        CardLayout cardLayout =  (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }
        
    private String formateDate(Date date) {
       String Formate="yyyy-mm-dd hh:mm:ss";
       
       SimpleDateFormat Simple=new SimpleDateFormat(Formate);
       return Simple.format(date);
    
    }//GEN-LAST:event_backJButtonActionPerformed

    private void goJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = communityJTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(this, "Please Select any Community to View the Houses");
            return;
        }

        showHousesInCommunity(selectedRow);
    }//GEN-LAST:event_goJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        int selectedRowIndex = communityJTable.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) communityJTable.getModel();
        Community community = (Community) model.getValueAt(selectedRowIndex, 0);

        City.getCommunities().remove(community);

        txtcommunityname.setText("");
        txtpopulation.setText("");

        JOptionPane.showMessageDialog(this, "Community deleted ");
        populateTable();

    }//GEN-LAST:event_deleteJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel communitiesJLabel;
    private javax.swing.JTable communityJTable;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JButton goJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcommunityName1;
    private javax.swing.JLabel lblpopulation;
    private javax.swing.JTextField txtcommunityname;
    private javax.swing.JTextField txtpopulation;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}
