/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IInfoController;
import database.transactions.AccountInfo;
import database.transactions.UserApplication;
import gui.settings.ActionSettings;
import gui.settings.ButtonSettings;
import gui.settings.Dialogs;
import gui.settings.IRegulator;
import gui.settings.TextSettings;
import java.awt.Color;

/**
 *
 * @author Karaarslan
 */
public class ApplyScreen extends javax.swing.JFrame implements IRegulator, IInfoController {
    
    private UserApplication userAppObject = null;
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        ApplyScreenPanel.setFocusable(true);
        TextSettings.setOnlyAlphabetic(NameSurnameText);
        TextSettings.setOnlyNumber(IDNumberText);
        TextSettings.setOnlyNumber(TelefonNumberText);
        TextSettings.setMaxLimit(IDNumberText, 11);
        TextSettings.setMaxLimit(TelefonNumberText, 11);
        
    }

    /**
     * Creates new form ApplyScreen
     */
    public ApplyScreen() {
        initComponents();
        getEdits();
    }
    
    public UserApplication getUserAppObject() {
        if (this.userAppObject == null) {
            userAppObject = new UserApplication();
        }
        return userAppObject;
    }
    
    @Override
    public boolean isInfoValid() {
        return TextSettings.isTextPlacesFull(ApplyScreenPanel);
    }
    
    @Override
    public AccountInfo getAccountInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ApplyScreenPanel = new javax.swing.JPanel();
        PersonalInfosLabel = new javax.swing.JLabel();
        NameSurnameText = new javax.swing.JTextField();
        NameSurnameLabel1 = new javax.swing.JLabel();
        TelefonNumberText = new javax.swing.JTextField();
        TelefonNumberLabel = new javax.swing.JLabel();
        IDNumberLabel = new javax.swing.JLabel();
        IDNumberText = new javax.swing.JTextField();
        SecurityInfosLabel = new javax.swing.JLabel();
        SecurityQuestionLabel = new javax.swing.JLabel();
        SecurityQuestion = new javax.swing.JComboBox<>();
        AnswerLabel = new javax.swing.JLabel();
        AnswerText = new javax.swing.JTextField();
        ApplyButton = new javax.swing.JButton();
        BackIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Apply Screen");

        ApplyScreenPanel.setBackground(new java.awt.Color(255, 255, 153));

        PersonalInfosLabel.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        PersonalInfosLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PersonalInfosLabel.setText("Personal Informations");

        NameSurnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameSurnameTextActionPerformed(evt);
            }
        });

        NameSurnameLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        NameSurnameLabel1.setText("Name Surname:");

        TelefonNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonNumberTextActionPerformed(evt);
            }
        });

        TelefonNumberLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        TelefonNumberLabel.setText("Telefon Number:");

        IDNumberLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        IDNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDNumberLabel.setText("    ID Number :");

        IDNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDNumberTextActionPerformed(evt);
            }
        });

        SecurityInfosLabel.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        SecurityInfosLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SecurityInfosLabel.setText("Security Informations");

        SecurityQuestionLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        SecurityQuestionLabel.setText("Security Question:");

        SecurityQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your pet?", "What is your favourite color?", "What is the name of your primary school teacher?", "Where do you wanna live most?", "Or put a random sentence(recommendend)." }));

        AnswerLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        AnswerLabel.setText("Answer:");

        AnswerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerTextActionPerformed(evt);
            }
        });

        ApplyButton.setBackground(new java.awt.Color(255, 204, 204));
        ApplyButton.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        ApplyButton.setText("Apply");
        ApplyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ApplyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApplyButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ApplyButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ApplyButtonMouseExited(evt);
            }
        });
        ApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyButtonActionPerformed(evt);
            }
        });

        BackIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/previousIcon.png"))); // NOI18N
        BackIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ApplyScreenPanelLayout = new javax.swing.GroupLayout(ApplyScreenPanel);
        ApplyScreenPanel.setLayout(ApplyScreenPanelLayout);
        ApplyScreenPanelLayout.setHorizontalGroup(
            ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApplyScreenPanelLayout.createSequentialGroup()
                .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ApplyScreenPanelLayout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IDNumberLabel)
                                    .addComponent(TelefonNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TelefonNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ApplyScreenPanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SecurityInfosLabel)
                                    .addComponent(PersonalInfosLabel)))
                            .addGroup(ApplyScreenPanelLayout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(SecurityQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SecurityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ApplyScreenPanelLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(AnswerLabel)
                            .addGap(18, 18, 18)
                            .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AnswerText, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ApplyScreenPanelLayout.createSequentialGroup()
                                    .addComponent(ApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(92, 92, 92)))))
                    .addGroup(ApplyScreenPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackIcon)))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ApplyScreenPanelLayout.createSequentialGroup()
                    .addGap(179, 179, 179)
                    .addComponent(NameSurnameLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(NameSurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(267, Short.MAX_VALUE)))
        );

        ApplyScreenPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AnswerText, SecurityQuestion});

        ApplyScreenPanelLayout.setVerticalGroup(
            ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApplyScreenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackIcon)
                .addGap(4, 4, 4)
                .addComponent(PersonalInfosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDNumberLabel)
                    .addComponent(IDNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TelefonNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(TelefonNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(SecurityInfosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SecurityQuestionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SecurityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnswerText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ApplyScreenPanelLayout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addGroup(ApplyScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NameSurnameLabel1)
                        .addComponent(NameSurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(430, Short.MAX_VALUE)))
        );

        ApplyScreenPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AnswerText, SecurityQuestion});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ApplyScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ApplyScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameSurnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameSurnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameSurnameTextActionPerformed

    private void TelefonNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonNumberTextActionPerformed

    private void IDNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDNumberTextActionPerformed

    private void AnswerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerTextActionPerformed

    private void ApplyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApplyButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ApplyButtonMouseClicked

    private void ApplyButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApplyButtonMouseEntered
        ButtonSettings.setBgFg(ApplyButton, Color.black, Color.white);
    }//GEN-LAST:event_ApplyButtonMouseEntered

    private void ApplyButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApplyButtonMouseExited
        ButtonSettings.setOriginalBgFg(ApplyButton);
    }//GEN-LAST:event_ApplyButtonMouseExited

    private void ApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyButtonActionPerformed
        if (this.isInfoValid()) {
            
            this.doApplication();
        } else {
            
            Dialogs.notEmptyMessage(this);
        }

    }//GEN-LAST:event_ApplyButtonActionPerformed

    private void doApplication()
    {
        //Personal Infos
        this.getUserAppObject().setNameSurname(this.NameSurnameText.getText().trim());
        this.getUserAppObject().setIdNumber(this.IDNumberText.getText());
        this.getUserAppObject().setPhoneNumber(this.TelefonNumberText.getText());
        
        //Security Infos
        this.getUserAppObject().setSecurityQuestion(String.valueOf(this.SecurityQuestion.getSelectedItem()));
        this.getUserAppObject().setSecurityAnswer(this.AnswerText.getText().trim());
        
        //The infos which given by system
        this.getUserAppObject().setCustomNo(this.randomCustomNo());
        this.getUserAppObject().setPassword(this.randomPassword());
        
        
        if(this.getUserAppObject().isApplicationApproved())
        {
         Dialogs.specialMessage(this, "Your application has been accepted!\n"
                 + "Your custom Number:"+ this.getUserAppObject().getCustomNo()
                 + "\nYour password :"+ this.getUserAppObject().getPassword());
         ActionSettings.setVisible(this, new LoginScreen());
        }
        else
        {
            Dialogs.specialMessage(this, "Your application has been not accepted.\n"
            + "Please check your informations!");
        }
    }
   
    
    private String randomCustomNo()
    {
        String customNo;
        do{
        customNo = String.valueOf(1000000 + (int)(Math.random()*9000000));
        }
        while(this.getUserAppObject().isCustomNoInTabel());
        return customNo;
    }
    
    private String randomPassword()
    {
        String password ;
        password = String.valueOf(1000 + (int)(Math.random() * 9000));
        return password;
    }
    
    private void BackIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackIconMouseClicked
        ActionSettings.setVisible(this, new AccountScreen());
    }//GEN-LAST:event_BackIconMouseClicked

    
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
            java.util.logging.Logger.getLogger(ApplyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplyScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnswerLabel;
    private javax.swing.JTextField AnswerText;
    private javax.swing.JButton ApplyButton;
    private javax.swing.JPanel ApplyScreenPanel;
    private javax.swing.JLabel BackIcon;
    private javax.swing.JLabel IDNumberLabel;
    private javax.swing.JTextField IDNumberText;
    private javax.swing.JLabel NameSurnameLabel1;
    private javax.swing.JTextField NameSurnameText;
    private javax.swing.JLabel PersonalInfosLabel;
    private javax.swing.JLabel SecurityInfosLabel;
    private javax.swing.JComboBox<String> SecurityQuestion;
    private javax.swing.JLabel SecurityQuestionLabel;
    private javax.swing.JLabel TelefonNumberLabel;
    private javax.swing.JTextField TelefonNumberText;
    // End of variables declaration//GEN-END:variables

}
