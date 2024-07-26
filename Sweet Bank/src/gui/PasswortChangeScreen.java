/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IInfoController;
import database.transactions.AccountInfo;
import database.transactions.ChangePassword;
import gui.settings.ActionSettings;
import gui.settings.ButtonSettings;
import gui.settings.Dialogs;
import gui.settings.IRegulator;
import gui.settings.TextSettings;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Karaarslan
 */
public class PasswortChangeScreen extends javax.swing.JFrame implements IRegulator,IInfoController{

   
    private ChangePassword changePasswordObj = null;

    /**
     * Creates new form PasswortChangeScreen
     */
    public PasswortChangeScreen() {
        initComponents();
        getEdits();
    }
    
     @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        PasswortChangePanel.setFocusable(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
         TextSettings.setOnlyNumber(IDText);
         TextSettings.setMaxLimit(IDText, 11);
         TextSettings.setOnlyNumber(PhoneNumberText);
         TextSettings.setMaxLimit(PhoneNumberText, 12);
         if(getAccountInfo().getUser_ID() == 0)
         {
             this.OldPasswortText.setEnabled(false);
         }
    }

    public JPasswordField getOldPasswortText() {
        return OldPasswortText;
    }
    
    private boolean isEnabledOldPasswortText()
    {
        return this.getOldPasswortText().isEnabled();
    }

    @Override
    public boolean isInfoValid() {
        return TextSettings.isTextPlacesFull(this.PasswortChangePanel);
    }

    @Override
    public AccountInfo getAccountInfo() {
       return AccountInfo.getInstance();
    }

    public ChangePassword getChangePasswordObj() {
        if(this.changePasswordObj == null)
        {
            changePasswordObj = new ChangePassword();
        }
        
        return changePasswordObj;
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PasswortChangePanel = new javax.swing.JPanel();
        BackIcon = new javax.swing.JLabel();
        PasswortChangeLabel = new javax.swing.JLabel();
        IDNummerLabel = new javax.swing.JLabel();
        IDText = new javax.swing.JTextField();
        PhoneNumberLabel = new javax.swing.JLabel();
        PhoneNumberText = new javax.swing.JTextField();
        AnswerLabel = new javax.swing.JLabel();
        AnswerText = new javax.swing.JTextField();
        OldPasswortLabel = new javax.swing.JLabel();
        NewPasswortLabel = new javax.swing.JLabel();
        NewPasswortAgainLabel = new javax.swing.JLabel();
        OldPasswortText = new javax.swing.JPasswordField();
        NewPasswortAgainText = new javax.swing.JPasswordField();
        NewPasswortText = new javax.swing.JPasswordField();
        PasswortChangeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Passwort Change Screen");

        PasswortChangePanel.setBackground(new java.awt.Color(0, 153, 153));

        BackIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/previousIcon.png"))); // NOI18N
        BackIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackIconMouseClicked(evt);
            }
        });

        PasswortChangeLabel.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        PasswortChangeLabel.setForeground(new java.awt.Color(255, 0, 51));
        PasswortChangeLabel.setText("Passwort Change");

        IDNummerLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        IDNummerLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IDNummerLabel.setText("ID Number : ");

        IDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextActionPerformed(evt);
            }
        });

        PhoneNumberLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        PhoneNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PhoneNumberLabel.setText("Phone Number :");

        AnswerLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        AnswerLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AnswerLabel.setText("Security Question Answer :");

        OldPasswortLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        OldPasswortLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        OldPasswortLabel.setText("Old Passwort :");

        NewPasswortLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        NewPasswortLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NewPasswortLabel.setText("New Passwort :");

        NewPasswortAgainLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        NewPasswortAgainLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NewPasswortAgainLabel.setText("New Passwort (Again) :");

        PasswortChangeButton.setBackground(new java.awt.Color(153, 153, 153));
        PasswortChangeButton.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        PasswortChangeButton.setText("Passwort Change");
        PasswortChangeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PasswortChangeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PasswortChangeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PasswortChangeButtonMouseExited(evt);
            }
        });
        PasswortChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswortChangeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PasswortChangePanelLayout = new javax.swing.GroupLayout(PasswortChangePanel);
        PasswortChangePanel.setLayout(PasswortChangePanelLayout);
        PasswortChangePanelLayout.setHorizontalGroup(
            PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswortChangePanelLayout.createSequentialGroup()
                .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PasswortChangePanelLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(BackIcon))
                        .addGroup(PasswortChangePanelLayout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PasswortChangePanelLayout.createSequentialGroup()
                                    .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(PhoneNumberText))
                                .addGroup(PasswortChangePanelLayout.createSequentialGroup()
                                    .addComponent(IDNummerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(IDText, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswortChangePanelLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PasswortChangePanelLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(OldPasswortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(OldPasswortText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 86, Short.MAX_VALUE))
                                    .addGroup(PasswortChangePanelLayout.createSequentialGroup()
                                        .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(NewPasswortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NewPasswortAgainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NewPasswortAgainText, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                            .addComponent(NewPasswortText))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)))
                                .addGroup(PasswortChangePanelLayout.createSequentialGroup()
                                    .addComponent(AnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(AnswerText, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(67, 67, 67)))))
                    .addGroup(PasswortChangePanelLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(PasswortChangeLabel)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswortChangePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PasswortChangeButton)
                .addGap(141, 141, 141))
        );

        PasswortChangePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AnswerText, OldPasswortText});

        PasswortChangePanelLayout.setVerticalGroup(
            PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswortChangePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BackIcon)
                .addGap(8, 8, 8)
                .addComponent(PasswortChangeLabel)
                .addGap(38, 38, 38)
                .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDNummerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnswerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OldPasswortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OldPasswortText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPasswortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewPasswortText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PasswortChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPasswortAgainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewPasswortAgainText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PasswortChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PasswortChangePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AnswerText, IDNummerLabel, IDText, OldPasswortText, PhoneNumberText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PasswortChangePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PasswortChangePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
    private void BackIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackIconMouseClicked
       if(isEnabledOldPasswortText())
       {
        ActionSettings.setVisible(this, new SettingScreen());
       }
       else
       {
           ActionSettings.setVisible(this, new LoginScreen());
       }
    }//GEN-LAST:event_BackIconMouseClicked

    private void IDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextActionPerformed
        
    }//GEN-LAST:event_IDTextActionPerformed

    private void PasswortChangeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswortChangeButtonMouseEntered
        ButtonSettings.setBgFg(PasswortChangeButton, Color.cyan, Color.red);
    }//GEN-LAST:event_PasswortChangeButtonMouseEntered

    private void PasswortChangeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswortChangeButtonMouseExited
        ButtonSettings.setOriginalBgFg(PasswortChangeButton);
    }//GEN-LAST:event_PasswortChangeButtonMouseExited

    private void PasswortChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswortChangeButtonActionPerformed
       if(this.isInfoValid())
       {
           this.changePassword();
       }
       else
       {
           Dialogs.notEmptyMessage(this);
       }
    }//GEN-LAST:event_PasswortChangeButtonActionPerformed

    private void changePassword()
    {
        String newPassword = String.valueOf(this.NewPasswortText.getPassword());
        String newPasswordAgain = String.valueOf(this.NewPasswortAgainText.getPassword());
    
        if(newPassword.equals(newPasswordAgain))
        {
            this.confirmPassword();
        }
        else
        {
            Dialogs.specialMessage(this, "Your passwords do not match!");
        }
    
    }
    
    private void confirmPassword()
    {
        this.getChangePasswordObj().setId_number(this.IDText.getText());
        this.getChangePasswordObj().setPhone_number(this.PhoneNumberText.getText());
        this.getChangePasswordObj().setSecurity_answer(this.AnswerText.getText());
        
        if(this.isEnabledOldPasswortText())
        {
            this.getChangePasswordObj().setOldPassword(String.valueOf(this.OldPasswortText.getPassword()));
        }
        this.getChangePasswordObj().setNewPassword(String.valueOf(this.NewPasswortText.getPassword()));
         
        if(this.getChangePasswordObj().isPasswordChanged())
        {
            Dialogs.specialMessage(this, "Your password has been succesfully changed!");
            if(this.isEnabledOldPasswortText())
            {
                ActionSettings.setVisible(this, new AccountScreen());
            }
            else
            {
                ActionSettings.setVisible(this, new LoginScreen());
            }
        }
        else
        {
            Dialogs.specialMessage(this, "Your password can not been changed!\n"
                    + "Please check your infos!");
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(PasswortChangeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswortChangeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswortChangeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswortChangeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswortChangeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnswerLabel;
    private javax.swing.JTextField AnswerText;
    private javax.swing.JLabel BackIcon;
    private javax.swing.JLabel IDNummerLabel;
    private javax.swing.JTextField IDText;
    private javax.swing.JLabel NewPasswortAgainLabel;
    private javax.swing.JPasswordField NewPasswortAgainText;
    private javax.swing.JLabel NewPasswortLabel;
    private javax.swing.JPasswordField NewPasswortText;
    private javax.swing.JLabel OldPasswortLabel;
    private javax.swing.JPasswordField OldPasswortText;
    private javax.swing.JButton PasswortChangeButton;
    private javax.swing.JLabel PasswortChangeLabel;
    private javax.swing.JPanel PasswortChangePanel;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JTextField PhoneNumberText;
    // End of variables declaration//GEN-END:variables
}
