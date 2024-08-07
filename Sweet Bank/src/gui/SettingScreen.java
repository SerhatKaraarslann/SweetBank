/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IInfoController;
import database.transactions.AccountInfo;
import database.transactions.ChangePhoneNumber;
import gui.settings.ActionSettings;
import gui.settings.Dialogs;
import gui.settings.IRegulator;
import gui.settings.IconSettings;
import gui.settings.TextSettings;
import java.awt.Dialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Karaarslan
 */
public class SettingScreen extends javax.swing.JFrame implements IRegulator,IInfoController{

    private String oldPhoneNumber = null;
    
    private ChangePhoneNumber changePhoneNumberObj = null;

    /**
     * Creates new form SettingScreen
     */
    public SettingScreen() {
        initComponents();
        getEdits();
    }
    
    @Override
    public void getEdits() {
       this.setLocationRelativeTo(null);
       SettingsScreenPanel.setFocusable(true);
        TextSettings.setOnlyNumber(PhoneNumberText);
        TextSettings.setMaxLimit(PhoneNumberText, 12);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.PhoneNumberText.setText(getAccountInfo().getPhone_Number());
        this.oldPhoneNumber = PhoneNumberText.getText();
        this.UsernameSurnameLabel.setText("Dear "+getAccountInfo().getName_Surname());
        
    }

    public ChangePhoneNumber getChangePhoneNumberObj() {
        if(this.changePhoneNumberObj == null)
        {
            changePhoneNumberObj = new ChangePhoneNumber();
        }
        return changePhoneNumberObj;
    }
    

    @Override
    public boolean isInfoValid() {
        return !(this.PhoneNumberText.getText().equals(""));
    }

    @Override
    public AccountInfo getAccountInfo() {
       return AccountInfo.getInstance();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SettingsScreenPanel = new javax.swing.JPanel();
        BackIcon = new javax.swing.JLabel();
        UsernameSurnameLabel = new javax.swing.JLabel();
        PhoneNumberLabel = new javax.swing.JLabel();
        PhoneNumberText = new javax.swing.JTextField();
        PhoneNumberChangeIcon = new javax.swing.JLabel();
        PasswortLabel = new javax.swing.JLabel();
        PasswordText = new javax.swing.JTextField();
        PasswordChangeIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Settings Screen");

        SettingsScreenPanel.setBackground(new java.awt.Color(204, 255, 204));

        BackIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/previousIcon.png"))); // NOI18N
        BackIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackIconMouseClicked(evt);
            }
        });

        UsernameSurnameLabel.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        UsernameSurnameLabel.setForeground(new java.awt.Color(255, 0, 0));
        UsernameSurnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsernameSurnameLabel.setText("Dear [USERNAME AND SURNAME]");

        PhoneNumberLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        PhoneNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PhoneNumberLabel.setText("Phone Number:");

        PhoneNumberText.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        PhoneNumberText.setEnabled(false);
        PhoneNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberTextActionPerformed(evt);
            }
        });

        PhoneNumberChangeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/updateTelIcon.png"))); // NOI18N
        PhoneNumberChangeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PhoneNumberChangeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhoneNumberChangeIconMouseClicked(evt);
            }
        });

        PasswortLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        PasswortLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PasswortLabel.setText("Password:");

        PasswordText.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        PasswordText.setText("*****************");
        PasswordText.setEnabled(false);
        PasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextActionPerformed(evt);
            }
        });

        PasswordChangeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/updateTelIcon.png"))); // NOI18N
        PasswordChangeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PasswordChangeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordChangeIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SettingsScreenPanelLayout = new javax.swing.GroupLayout(SettingsScreenPanel);
        SettingsScreenPanel.setLayout(SettingsScreenPanelLayout);
        SettingsScreenPanelLayout.setHorizontalGroup(
            SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SettingsScreenPanelLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(UsernameSurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(SettingsScreenPanelLayout.createSequentialGroup()
                .addGroup(SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SettingsScreenPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BackIcon))
                    .addGroup(SettingsScreenPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SettingsScreenPanelLayout.createSequentialGroup()
                                .addComponent(PasswortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(PasswordChangeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SettingsScreenPanelLayout.createSequentialGroup()
                                .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(PhoneNumberChangeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SettingsScreenPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {PasswordText, PhoneNumberText});

        SettingsScreenPanelLayout.setVerticalGroup(
            SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsScreenPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BackIcon)
                .addGap(18, 18, 18)
                .addComponent(UsernameSurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberChangeIcon))
                .addGap(48, 48, 48)
                .addGroup(SettingsScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordChangeIcon))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        SettingsScreenPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {PasswordText, PhoneNumberLabel, PhoneNumberText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SettingsScreenPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SettingsScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackIconMouseClicked
        ActionSettings.setVisible(this, new AccountScreen());
    }//GEN-LAST:event_BackIconMouseClicked

    private void PhoneNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberTextActionPerformed
        
    }//GEN-LAST:event_PhoneNumberTextActionPerformed

    private void PasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextActionPerformed
        
    }//GEN-LAST:event_PasswordTextActionPerformed

    private int clickCounter = 0;
    
    private void PhoneNumberChangeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhoneNumberChangeIconMouseClicked
        if(this.clickCounter == 0)
        {
        PhoneNumberText.setEnabled(true);
        IconSettings.changeIcon(PhoneNumberChangeIcon, "updateTelIcon2");
        clickCounter++;
        }
        else
        {
            PhoneNumberText.setEnabled(false);
            this.changePhoneNumber();
            IconSettings.changeIcon(PhoneNumberChangeIcon, "updateTelIcon");
            clickCounter = 0;
        }
    }//GEN-LAST:event_PhoneNumberChangeIconMouseClicked

    private void changePhoneNumber()
    {
        if(this.isInfoValid())
        {
            String newPhoneNumber = this.PhoneNumberText.getText().trim();
            getChangePhoneNumberObj().setPhoneNumber(newPhoneNumber);
            
            if(getChangePhoneNumberObj().isPhoneNumberChanged())
            {
                Dialogs.specialMessage(this, "Your phone number has been successfully changed!\n"
                +"Your new phone number : "+newPhoneNumber);
            }
            else
            {
                Dialogs.specialMessage(this, "This operation is unsuccesful. Please check your infos!");
                this.PhoneNumberText.setText(this.oldPhoneNumber);
            }
        }
        else
        {
            Dialogs.notEmptyMessage(this);
            this.PhoneNumberText.setText(this.oldPhoneNumber);
        }
    }
    
    
    private void PasswordChangeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordChangeIconMouseClicked
        ActionSettings.setVisible(this, new PasswortChangeScreen());
    }//GEN-LAST:event_PasswordChangeIconMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(SettingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackIcon;
    private javax.swing.JLabel PasswordChangeIcon;
    private javax.swing.JTextField PasswordText;
    private javax.swing.JLabel PasswortLabel;
    private javax.swing.JLabel PhoneNumberChangeIcon;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JTextField PhoneNumberText;
    private javax.swing.JPanel SettingsScreenPanel;
    private javax.swing.JLabel UsernameSurnameLabel;
    // End of variables declaration//GEN-END:variables
}
