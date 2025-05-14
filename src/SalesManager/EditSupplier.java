
package SalesManager;

import java.io.IOException;
import javax.swing.JOptionPane;


public class EditSupplier extends javax.swing.JFrame {
    private String currentSupplierID;
    
    public EditSupplier() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Add this line
    }

    public EditSupplier(String supplierID) {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.currentSupplierID = supplierID;
        loadSupplierForEditing();
    }
    
    // Modify your loadSupplierForEditing method
    private void loadSupplierForEditing() {
        System.out.println("Loading supplier with ID: " + currentSupplierID);
        if (currentSupplierID == null) {
            System.out.println("Current supplier ID is null!");
            return;
        }

        try {
            Supplier supplier = FileHandler.getSupplierById(currentSupplierID);
            System.out.println("Loaded supplier: " + supplier); // This will tell us if the supplier is found

            if (supplier != null) {
                supplierName.setText(supplier.getSupplierName());
                contactNo.setText(supplier.getContactNo());
                isActive.setSelected(supplier.isActive());

                // Make sure fields are editable (add these lines)
                supplierName.setEditable(true);
                contactNo.setEditable(true);
                supplierName.setEnabled(true);
                contactNo.setEnabled(true);

                // Change button text to indicate editing
                updateButton.setText("Update");
            } else {
                System.out.println("Supplier not found for ID: " + currentSupplierID);
                JOptionPane.showMessageDialog(this, 
                    "Supplier not found!", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                this.dispose();
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                "Error loading supplier: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        supplierNameLabel = new javax.swing.JLabel();
        contactNoLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        contactNo = new javax.swing.JTextField();
        activeLabel = new javax.swing.JLabel();
        isActive = new javax.swing.JCheckBox();
        updateButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        supplierName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusableWindowState(false);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(246, 246, 226));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        supplierNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        supplierNameLabel.setText("Name");

        contactNoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        contactNoLabel.setText("Contact No (+60)");

        clearButton.setBackground(new java.awt.Color(255, 204, 204));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        contactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNoActionPerformed(evt);
            }
        });

        activeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        activeLabel.setText("Active?");

        isActive.setText("Active");
        isActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isActiveActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(204, 255, 204));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel40.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabel40.setText("Supplier Entry");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel40)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        supplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactNoLabel)
                    .addComponent(supplierNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isActive, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(contactNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addComponent(supplierName, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierNameLabel)
                    .addComponent(supplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNoLabel)
                    .addComponent(contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isActive)
                    .addComponent(activeLabel))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        System.out.println("Updating supplier with ID: " + currentSupplierID);
        String newName = supplierName.getText().trim(); // Add trim() to remove whitespace
        String newContactNo = contactNo.getText().trim(); // Add trim() to remove whitespace
        boolean newIsActive = isActive.isSelected();

        // Debug - check what values were retrieved from fields
        System.out.println("Retrieved values from fields - Name: [" + newName + "], Contact: [" + newContactNo + "], Active: [" + newIsActive + "]");

        // Validate inputs
        if (newName.isEmpty() || newContactNo.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please fill in all fields.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Check for duplicate supplier name (excluding the current supplier)
            if (FileHandler.isSupplierNameDuplicate(newName, currentSupplierID)) {
                JOptionPane.showMessageDialog(this,
                    "Supplier name already exists!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Create updated supplier object
            Supplier updatedSupplier = new Supplier(currentSupplierID, newName, newContactNo, newIsActive);
            System.out.println("Created updated supplier object: " + updatedSupplier);

            // Update in FileHandler
            FileHandler.updateSupplier(
                updatedSupplier.getSupplierID(),
                updatedSupplier.getSupplierName(),
                updatedSupplier.getContactNo(),
                updatedSupplier.isActive()
            );

            System.out.println("Supplier updated successfully in FileHandler");

            // Show success message and close the form
            JOptionPane.showMessageDialog(this, "Supplier updated successfully!");
            this.dispose();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                "Error updating supplier: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void isActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isActiveActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        supplierName.setText("");
        contactNo.setText("");
        isActive.setSelected(false);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void supplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierNameActionPerformed

    private void contactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNoActionPerformed

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
            java.util.logging.Logger.getLogger(EditSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activeLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField contactNo;
    private javax.swing.JLabel contactNoLabel;
    private javax.swing.JCheckBox isActive;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField supplierName;
    private javax.swing.JLabel supplierNameLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
