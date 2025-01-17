/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Users;
import service.UsersInterface;

/**
 *
 * @author ZIPTECH LTD
 */
public class UsersInfo extends javax.swing.JInternalFrame {
private DefaultTableModel tableModel = new DefaultTableModel();
    /**
     * Creates new form UsersInfo
     */
    public UsersInfo() {
        initComponents();
        AddBookColumnTable();
        addBookDataToTable();
    }
    
    private void AddBookColumnTable() {
    tableModel.addColumn("User ID");
    tableModel.addColumn("First Name");
    tableModel.addColumn("Last Name");
    tableModel.addColumn("Email");
    tableModel.addColumn("Role");

    Userstable.setModel(tableModel);
}
    
    @SuppressWarnings("empty-statement")
    private void addBookDataToTable() {
    try {
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
        UsersInterface intrf = (UsersInterface) registry.lookup("Users");
        tableModel.setRowCount(0);
        List<Users> userList = intrf.getAllUsers();
        
        for (Users user : userList) {
            tableModel.addRow(new Object[]{
                user.getUser_id(),
                user.getFirstname(),
                user.getLastname(),
                user.getEmail(),
                user.getRole()
            });
        }
        
        Userstable.setModel(tableModel);
    } catch (Exception ex) {
        // Handle exception
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Userstable = new javax.swing.JTable();
        deletetxt = new javax.swing.JTextField();
        deletebtn = new javax.swing.JButton();
        updatefield = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        Userstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Userstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Userstable);

        deletetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletetxtActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updatefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatefieldActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(142, 166, 125));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("User Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(376, 376, 376))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel2.setText("Delete User");

        jLabel3.setText("Update The Users Role");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deletebtn)
                        .addGap(76, 76, 76)
                        .addComponent(deletetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Update)
                        .addGap(70, 70, 70)
                        .addComponent(updatefield, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)))
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(jLabel3)
                    .addContainerGap(1031, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deletetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebtn))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Update))
                            .addComponent(updatefield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(484, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(140, 140, 140)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserstableMouseClicked
     
    }//GEN-LAST:event_UserstableMouseClicked

    private void deletetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletetxtActionPerformed
       
    }//GEN-LAST:event_deletetxtActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        try {
            if (deletetxt.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please provide a book ID", "Data Required", JOptionPane.WARNING_MESSAGE);
            } else {
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this book?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000); 
                    UsersInterface intrf = (UsersInterface)registry.lookup("Users");

                    String bookId = deletetxt.getText();
                    String feedback = intrf.deleteUser(bookId);

                    if (feedback.equals("success")) {
                        JOptionPane.showMessageDialog(this, "User deleted successfully", "Delete Successful", JOptionPane.INFORMATION_MESSAGE);
                        //clearFields(); // Optional: Clear the input fields after successful deletion
                    } else {
                        JOptionPane.showMessageDialog(this, feedback, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
      try {
    String userId = updatefield.getText(); // Retrieve the user ID from the input field

    Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
    UsersInterface intrf = (UsersInterface) registry.lookup("Users");

    // Update the user's role to "admin"
    String feedback = intrf.updateUser(userId, "Admin");

    // Handle success or display a message to the user
    if (feedback.equals("Data Updated Successfully")) {
        // Display a success message or perform any necessary actions
        // ...
        // Refresh the table or UI to reflect the updated role
        addBookDataToTable();
    } else {
        // Display an error message or handle the failure case
        // ...
    }
} catch (Exception ex) {
    ex.printStackTrace();
}
    }//GEN-LAST:event_UpdateActionPerformed

    private void updatefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatefieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_updatefieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JTable Userstable;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField deletetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField updatefield;
    // End of variables declaration//GEN-END:variables
}
