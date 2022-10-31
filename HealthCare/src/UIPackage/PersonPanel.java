/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import healthcare.House;
import healthcare.Patient;
import healthcare.Person;
import healthcare.System;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author mynenidivya
 */
public class PersonPanel extends javax.swing.JPanel {
    

    private System System;
    private House house;
    private JPanel displayJPanel;
    /**
     * Creates new form Person
     */
    public PersonPanel(JPanel displayJPanel, House house) {
        initComponents();
        this.displayJPanel=displayJPanel;
        //this.system=system;
        this.house=house;
        initComponents();
        populateTable();
        java.lang.System.out.println("Inside PersonPanel");
    }
    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) personsJTable.getModel();
        model.setRowCount(0);
        
        for(Person person:house.getPersons()){
            Object[] row = new Object[4];
            row[0]=person;
            row[1]=person.getAge();
            row[2]=person.getGender();
            row[3]=person.isMarried();
            
            model.addRow(row);
        }
    }
    
    String regxPersonName = "^[a-zA-Z\\s]+$";
    String regxAge = "^[0-9]{0,2}+\\.?[0-9]{0,2}$";
    
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

        chkbxmarried = new javax.swing.JCheckBox();
        txtgender = new javax.swing.JComboBox<>();
        backJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        lblcommunityName = new javax.swing.JLabel();
        lblpersonname = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        txtpersonname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        updateJButton = new javax.swing.JButton();
        personsJLabel = new javax.swing.JLabel();
        deleteJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personsJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 204));

        chkbxmarried.setText("Married ?");

        txtgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        txtgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgenderActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        backJButton.setText("previous");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIPackage/Save.png"))); // NOI18N
        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        lblcommunityName.setText("Gender : ");

        lblpersonname.setText("Person Name : ");

        lblage.setText("Age :");

        txtpersonname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpersonnameActionPerformed(evt);
            }
        });

        updateJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIPackage/edit.png"))); // NOI18N
        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        personsJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        personsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personsJLabel.setText("Persons Present");

        deleteJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIPackage/delete.png"))); // NOI18N
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        personsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Person Name", "Age", "Gender", "Married?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        personsJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personsJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personsJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcommunityName)
                            .addComponent(lblpersonname))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpersonname, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtgender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkbxmarried)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblage)
                                .addGap(18, 18, 18)
                                .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(personsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtpersonname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblpersonname, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblcommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblage, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(chkbxmarried))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(deleteJButton)
                        .addGap(31, 31, 31)
                        .addComponent(addJButton)
                        .addGap(26, 26, 26)
                        .addComponent(updateJButton)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        CardLayout cardLayout =  (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        if (txtpersonname.getText().isBlank() && txtage.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Please enter valid details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) personsJTable.getModel();

        for(Person person:house.getPersons()){
            if (txtpersonname.getText().equals(person.getName())){
                JOptionPane.showMessageDialog(this, "Person name already exists\nPlease enter a different person name");
                return;
            }
        }
        String gender = (String) txtgender.getSelectedItem();
        if (gender.equals("Select")){
            gender = "";
        }

        if (txtpersonname.getText().matches(regxPersonName) && txtage.getText().matches(regxAge)){
            double age = txtage.getText().isBlank()?0:Double.parseDouble(txtage.getText());

            Person person = new Person(txtpersonname.getText(), age, gender, chkbxmarried.isSelected(),new Patient());
            house.getPersons().add(person);
            populateTable();

            txtpersonname.setText("");
            txtgender.setSelectedIndex(0);
            txtage.setText("");
            chkbxmarried.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(this, "Please enter valid details");
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void txtpersonnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpersonnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpersonnameActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        int selectedRowIndex = personsJTable.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) personsJTable.getModel();
        Person person = (Person) model.getValueAt(selectedRowIndex, 0);

        if (person.getName().equals(txtpersonname.getText()) && String.valueOf(person.getAge()).equals(txtage.getText()) && person.getGender().equals(((String) txtgender.getSelectedItem())) && person.isMarried()==chkbxmarried.isSelected()) {
            JOptionPane.showMessageDialog(this, "No new values entered\nPlease enter a new details of the person");
            return;
        }else if (txtpersonname.getText().equals("") || txtage.getText().equals("")){
            JOptionPane.showMessageDialog(this, "House Name is blank\nPlease enter a valid person name");
            return;
        }
        else{
            if (txtpersonname.getText().matches(regxPersonName) && txtage.getText().matches(regxAge)){
                person.setName(txtpersonname.getText());
                person.setAge(Double.parseDouble(txtage.getText()));
                person.setGender((String) txtgender.getSelectedItem());
                person.setMarried(chkbxmarried.isSelected());

                JOptionPane.showMessageDialog(this, "Person updated successfully");
                populateTable();

                txtpersonname.setText("");
                txtgender.setSelectedIndex(0);
                txtage.setText("");
                chkbxmarried.setSelected(false);
            }else{
                JOptionPane.showMessageDialog(this, "Enter valid details\nOnly alphabets and spaces allowed for Person Name\nOnly numbers(<100) allowed for Age");
            }
        }
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        int selectedRowIndex = personsJTable.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) personsJTable.getModel();
        Person person = (Person) model.getValueAt(selectedRowIndex, 0);

        house.getPersons().remove(person);

        txtpersonname.setText("");
        txtgender.setSelectedIndex(0);
        txtage.setText("");
        chkbxmarried.setSelected(false);

        JOptionPane.showMessageDialog(this, "Person deleted successfully");
        populateTable();
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void personsJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personsJTableMouseClicked
        int selectedRowIndex = personsJTable.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) personsJTable.getModel();
        Person person = (Person) model.getValueAt(selectedRowIndex, 0);

        txtpersonname.setText(person.getName());
        txtgender.setSelectedItem(person.getGender());
        txtage.setText(String.valueOf(person.getAge()));
        chkbxmarried.setSelected(person.isMarried());
    }//GEN-LAST:event_personsJTableMouseClicked

    private void txtgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgenderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JCheckBox chkbxmarried;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblcommunityName;
    private javax.swing.JLabel lblpersonname;
    private javax.swing.JLabel personsJLabel;
    private javax.swing.JTable personsJTable;
    private javax.swing.JTextField txtage;
    private javax.swing.JComboBox<String> txtgender;
    private javax.swing.JTextField txtpersonname;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}
