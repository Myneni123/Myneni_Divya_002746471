/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIPackage;

import healthcare.City;
import healthcare.Community;
import healthcare.House;
import healthcare.Person;
import java.util.List;
import javax.swing.JPanel;
import healthcare.System;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mynenidivya
 */
public class SearchPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchPanel
     */
    private JPanel displayJpanel;
    private System system;
    private City city;
    private Community community;
    public SearchPanel(JPanel displayJpanel,System system) {
        initComponents();
        this.displayJpanel = displayJpanel;
        this.system = system;
        initializeCities();
        initializeCommunities();
    }
    private void initializeCities() {
        
        List<City> cities = system.getCities();
        for(City city:cities){
            cityJComboBox.addItem(city.getCityName());
        }
    }
    
    private void initializeCommunities() {
        communityJComboBox.removeAllItems();
        String selectedCityName = (String) cityJComboBox.getSelectedItem();
        for(City city : system.getCities()) {
            if(city.getCityName().equalsIgnoreCase(selectedCityName)){
                this.city = city;                
                for(Community community : city.getCommunities()){
                    communityJComboBox.addItem(community.getCommunityName());
                    
                }
            }
        }
        initializeHouses();
    }
    
    private void initializeHouses() {
        houseJComboBox.removeAllItems();
        String selectedCommunityName = (String) communityJComboBox.getSelectedItem();
        for(Community community : this.city.getCommunities()) {
            if(community.getCommunityName().equalsIgnoreCase(selectedCommunityName)){
                this.community = community;
                
                for(House house : community.getHouses()){
                    houseJComboBox.addItem(house.getHouseName());
                }
            }
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        houseJComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstandardBPvalues = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        abnormalpatients = new javax.swing.JTable();
        lblchoosecity = new javax.swing.JLabel();
        cityJComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblcommunity = new javax.swing.JLabel();
        communityJComboBox = new javax.swing.JComboBox<>();
        lblhouse = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        houseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseJComboBoxActionPerformed(evt);
            }
        });

        tblstandardBPvalues.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"21-30", "122.5 - 118.5", "80.5 - 76.5"},
                {"31-40", "116.5 - 112.5", "77.5 - 73.5"},
                {"41-50", "117.5 - 113.5", "80.5 - 76.5"},
                {"51-60", "127.5 - 123.5", "82.5 - 78.5"}
            },
            new String [] {
                "Person Age", "Systolic BP range", "Diastolic BP range"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblstandardBPvalues);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("People With Abnormal Blood Pressure");

        abnormalpatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "City", "Person", "Systole BP", "Diastole BP"
            }
        ));
        jScrollPane2.setViewportView(abnormalpatients);
        if (abnormalpatients.getColumnModel().getColumnCount() > 0) {
            abnormalpatients.getColumnModel().getColumn(0).setResizable(false);
        }

        lblchoosecity.setText("City :");

        cityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("         Standard BP Values");

        lblcommunity.setText("Community :");

        communityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityJComboBoxActionPerformed(evt);
            }
        });

        lblhouse.setText("House :");

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1)
                        .addContainerGap(436, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblcommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblchoosecity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cityJComboBox, 0, 120, Short.MAX_VALUE)
                                        .addComponent(communityJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblhouse, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(houseJComboBox, 0, 118, Short.MAX_VALUE)))
                            .addComponent(jButton1))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(116, 116, 116)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblchoosecity, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(communityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblhouse, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(houseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void houseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseJComboBoxActionPerformed

    private void cityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJComboBoxActionPerformed
        initializeCommunities();
    }//GEN-LAST:event_cityJComboBoxActionPerformed

    private void communityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityJComboBoxActionPerformed
        initializeHouses();
    }//GEN-LAST:event_communityJComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String selectedCityName = (String) cityJComboBox.getSelectedItem();
        String selectedCommunityName = (String) communityJComboBox.getSelectedItem();
        String selectedHouseName = (String) houseJComboBox.getSelectedItem();
        City selectedCity = null;
        Community selectedCommunity = null;
        House selectedHouse = null;
        for (City city : system.getCities()){
            if (city.getCityName().equalsIgnoreCase(selectedCityName)){
                 selectedCity = city;
            }
        }      
        for (Community community : selectedCity.getCommunities()){
            if (community.getCommunityName().equalsIgnoreCase(selectedCommunityName)){
                selectedCommunity = community;
            }
        }
        
        for (House house : selectedCommunity.getHouses()){
            if (house.getHouseName().equalsIgnoreCase(selectedHouseName)){
                selectedHouse = house;
            }
        }
        double sbp=0;
        double dbp=0;
        DefaultTableModel model = (DefaultTableModel) abnormalpatients.getModel();
        model.setRowCount(0);
        
        for (Person person : selectedHouse.getPersons()){
                for(int i=0; i<person.getPatient().getEncounterhistory().getEncounters().size(); i++){
                    sbp = person.getPatient().getEncounterhistory().getEncounters().get(i).getVitalSigns().getSystolic();
                    dbp = person.getPatient().getEncounterhistory().getEncounters().get(i).getVitalSigns().getDiastolic();
                    
                    if (AbnormalPerson(person, sbp, dbp)){
                        Object[] row = new Object[4];
                        row[0]=selectedCityName;
                        row[1]=person;
                        row[2]=sbp;
                        row[3]=dbp;

                        model.addRow(row);
                    }
                }
            }
    }
    
        private boolean AbnormalPerson(Person person, double syst, double diab){
            if(Double.compare(person.getAge(),21) < 0 || Double.compare(person.getAge(),60) > 0){
            return false;
        }
        
        if(Double.compare(person.getAge(),21) >= 0 && Double.compare(person.getAge(),30) <= 0){
            if(Double.compare(syst,122.5) < 0 && Double.compare(syst,118.5) > 0 && Double.compare(diab,80.5) < 0 && Double.compare(diab,76.5) > 0){
                return false;
            }else{
                return true;
            }
        }
        if(Double.compare(person.getAge(),31) >= 0 && Double.compare(person.getAge(),40) <= 0){
            if(Double.compare(syst,116.5) < 0 && Double.compare(syst,112.5) > 0 && Double.compare(diab,77.5) < 0 && Double.compare(diab,73.5) > 0){
                return false;
            }else{
                return true;
            }
        }
        if(Double.compare(person.getAge(),41) >= 0 && Double.compare(person.getAge(),50) <= 0){
            if(Double.compare(syst,117.5) < 0 && Double.compare(syst,113.5) > 0 && Double.compare(diab,80.5) < 0 && Double.compare(diab,76.5) > 0){
                return false;
            }else{
                return true;
            }
        }
        if(Double.compare(person.getAge(),51) >= 0 && Double.compare(person.getAge(),60) <= 0){
            if(Double.compare(syst,127.5) < 0 && Double.compare(syst,123.5) > 0 && Double.compare(diab,82.5) < 0 && Double.compare(diab,78.5) > 0){
                return false;
            }else{
                return true;
            }
        }return false;        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable abnormalpatients;
    private javax.swing.JComboBox<String> cityJComboBox;
    private javax.swing.JComboBox<String> communityJComboBox;
    private javax.swing.JComboBox<String> houseJComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblchoosecity;
    private javax.swing.JLabel lblcommunity;
    private javax.swing.JLabel lblhouse;
    private javax.swing.JTable tblstandardBPvalues;
    // End of variables declaration//GEN-END:variables
}