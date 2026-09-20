/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.User;


/**
 *
 * @author Serge B
 */
public class UserProfile extends javax.swing.JFrame {

    /**
     * Creates new form UserProfile
     */
   
      private String loggedInUser;
    public UserProfile(String username ) {
        
         initComponents(); // Initializes components like labels, buttons, etc.
        this.loggedInUser = username;
        // Set the logged-in user label here
        loggedUserLabel.setText("" + username);
        
        loadUserProfile( );
        
       
    }

   

   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstTxt = new javax.swing.JTextField();
        lastTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loggedUserLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RemoveAccount = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("         BELAIRLINES  ");

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/map.jpg"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 430));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 0));
        jLabel2.setText("FirstName");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, 22));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 0));
        jLabel4.setText("PhoneNumber");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 110, 26));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 0));
        jLabel5.setText("LastName");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 110, 26));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 0));
        jLabel6.setText("UserName");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 110, 20));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 0));
        jLabel7.setText("Address");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 110, 26));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 0));
        jLabel8.setText("PassWord");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 110, 26));
        jPanel3.add(firstTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, -1));
        jPanel3.add(lastTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 170, -1));
        jPanel3.add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 170, -1));
        jPanel3.add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 170, -1));

        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });
        jPanel3.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 170, -1));
        jPanel3.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 280, 170, 30));

        Update.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(102, 153, 0));
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/add.png"))); // NOI18N
        Update.setText("Edit");
        Update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel3.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 110, -1));

        cancel.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(102, 153, 0));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/cancel.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/user.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 40, 50));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 0));
        jLabel1.setText("User  Profile");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 190, 29));

        loggedUserLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        loggedUserLabel.setForeground(new java.awt.Color(102, 153, 0));
        loggedUserLabel.setText("Serge");
        jPanel3.add(loggedUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/profile.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RemoveAccount.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        RemoveAccount.setForeground(new java.awt.Color(102, 153, 0));
        RemoveAccount.setText("REMOVE  YOUR ACCOUNT");
        RemoveAccount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RemoveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveAccountActionPerformed(evt);
            }
        });
        jPanel3.add(RemoveAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 240, 30));

        backbtn.setBackground(new java.awt.Color(255, 255, 153));
        backbtn.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        backbtn.setForeground(new java.awt.Color(0, 102, 0));
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/back.png"))); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel3.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 160, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_usernameTxtActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
       // Check if any field is empty
    if (firstTxt.getText().isEmpty() || lastTxt.getText().isEmpty() || phoneTxt.getText().isEmpty() ||
        addressTxt.getText().isEmpty() || usernameTxt.getText().isEmpty() || passTxt.getText().isEmpty()) {

        setCustomDialogStyle();
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

    // Validation: First Name (minimum 2 characters)
    if (firstTxt.getText().length() < 2) {
        JOptionPane.showMessageDialog(this, "First Name must be at least 2 characters long.");
        return;
    }

    // Validation: Last Name (minimum 2 characters)
    if (lastTxt.getText().length() < 2) {
        JOptionPane.showMessageDialog(this, "Last Name must be at least 2 characters long.");
        return;
    }

    // Validation: Phone Number
    String phonePattern = "^[+]?[0-9]{10}$";
    if (!phoneTxt.getText().matches(phonePattern)) {
        JOptionPane.showMessageDialog(this, "Please enter a valid phone number (10 digits).");
        return;
    }

    // Validation: Address
    if (addressTxt.getText().length() < 10) {
        JOptionPane.showMessageDialog(this, "Address must be at least 10 characters long.");
        return;
    }

    // Validation: Password
    if (passTxt.getText().length() < 6) {
        JOptionPane.showMessageDialog(this, "Password must be at least 6 characters long.");
        return;
    }

    // Set updated user model
    User updatedUser = new User();
    updatedUser.setFirstName(firstTxt.getText());
    updatedUser.setLastName(lastTxt.getText());
    updatedUser.setPhoneNumber(phoneTxt.getText());
    updatedUser.setAddress(addressTxt.getText());
    updatedUser.setUserName(usernameTxt.getText()); 
    updatedUser.setPassword(passTxt.getText());

    boolean success = false; try { success = controller.ClientController.getUserService().updateUser(updatedUser); } catch (java.rmi.RemoteException e) { e.printStackTrace(); }


    if (success) {
        JOptionPane.showMessageDialog(this, "Profile updated successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to update profile. Please try again.");
    }
    }//GEN-LAST:event_UpdateActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:

        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());

          String username=loggedUserLabel.getText();
        Booking booking; 
              booking = new Booking(username);
         
            new Booking(username).setVisible(true);

        currentFrame.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void RemoveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAccountActionPerformed
      
        String username = loggedUserLabel.getText(); 

    if (username.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a username to delete.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this account?", "Confirm", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        boolean deleted = false; try { deleted = controller.ClientController.getUserService().deleteUser(username); } catch (java.rmi.RemoteException e) { e.printStackTrace(); }


        if (deleted) {
            JOptionPane.showMessageDialog(this, "Account deleted successfully.");
           
                   
         JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
        
         Airplane home = new Airplane();
         home.setVisible(true);
         
         currentFrame.dispose();
            
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete account. Please try again.");
        }
    
}
      
   
        
        
        
    }//GEN-LAST:event_RemoveAccountActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
            String username = loggedUserLabel.getText(); 
        // TODO add your handling code here:
        
          new Booking(username).setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              // new UserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoveAccount;
    private javax.swing.JButton Update;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField firstTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastTxt;
    private javax.swing.JLabel loggedUserLabel;
    private javax.swing.JTextField passTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables

    private void setCustomDialogStyle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void clearusr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   private void loadUserProfile() {
    String loggedInUsername = loggedUserLabel.getText(); // Ensure this label is already set

    User user = null; try { user = controller.ClientController.getUserService().getUserByUsername(loggedInUsername); } catch (java.rmi.RemoteException e) { e.printStackTrace(); }


    if (user != null) {
        firstTxt.setText(user.getFirstName());
        lastTxt.setText(user.getLastName());
        phoneTxt.setText(user.getPhoneNumber());
        addressTxt.setText(user.getAddress());
        usernameTxt.setText(user.getUserName());
        usernameTxt.setText(user.getUserName());

    } else {
        JOptionPane.showMessageDialog(this, "User not found!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


}
