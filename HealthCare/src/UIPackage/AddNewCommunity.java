/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIPackage;

import healthcare.City;
import healthcare.Community;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mynenidivya
 */
public class AddNewCommunity extends javax.swing.JPanel {

    /**
     * Creates new form AddNewCommunity
     
    
     */
    private JPanel displayJPanel;
    private City city;
    
    public AddNewCommunity(JPanel displayJPanel, City city) {
        initComponents();
        this.displayJPanel=displayJPanel;
        this.city=city;
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

        txtpopulation = new javax.swing.JTextField();
        addCommunityJLabel = new javax.swing.JLabel();
        communityNameJLabel = new javax.swing.JLabel();
        txtcommunityname = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        lblpopulation = new javax.swing.JLabel();

        addCommunityJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addCommunityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addCommunityJLabel.setText("Add New Community");

        communityNameJLabel.setText("Community Name :");

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        backJButton.setText("Previous");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        lblpopulation.setText("Population :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backJButton)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCommunityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(communityNameJLabel)
                                    .addComponent(lblpopulation))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcommunityname, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(txtpopulation)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(addJButton)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCommunityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityNameJLabel)
                    .addComponent(txtcommunityname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(addJButton)
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        if (txtcommunityname.getText().matches(regxCommunityName) && txtpopulation.getText().matches(regxPopulation)){
            java.lang.System.out.println("Inside add button of addcommunity");
            String communityName = txtcommunityname.getText();
            long population = txtpopulation.getText().isEmpty()?0:Long.parseLong(txtpopulation.getText());
            java.lang.System.out.println("1");
            Community community = new Community(communityName, population, new ArrayList<>());
            java.lang.System.out.println(community);
            java.lang.System.out.println(city.getCommunities());
            city.addCommunity(community);
            java.lang.System.out.println("3");
            JOptionPane.showMessageDialog(this, "Successfully Saved");
            txtcommunityname.setText("");
            txtpopulation.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Enter a valid details\nOnly alphabets and spaces allowed for Community Name\nOnly numbers allowed for Population");
        }

    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        CommunityPanel communityJPanel = (CommunityPanel) component;
        communityJPanel.populateTable();
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCommunityJLabel;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel communityNameJLabel;
    private javax.swing.JLabel lblpopulation;
    private javax.swing.JTextField txtcommunityname;
    private javax.swing.JTextField txtpopulation;
    // End of variables declaration//GEN-END:variables
}
