/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import gui.settings.ButtonSettings;
import gui.settings.IRegulator;
import gui.settings.TextSettings;
import java.awt.Color;

/**
 *
 * @author user
 */
public final class LoginScreen extends javax.swing.JFrame implements IRegulator{

    private final String ID_TEXT_ORIGINAL = "ID No/Customer No";
    private final String PASSWORT_TEXT_ORIGINAL = "***********";
    
    
    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        getEdits();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginScreenPanel = new javax.swing.JPanel();
        WelcomeMessageLabel = new javax.swing.JLabel();
        IdentityText = new javax.swing.JTextField();
        ApplyButton = new javax.swing.JButton();
        PasswortText = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        ApplyQuestionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Login Screen");

        LoginScreenPanel.setBackground(new java.awt.Color(153, 255, 153));

        WelcomeMessageLabel.setFont(new java.awt.Font("Cantarell Light", 1, 24)); // NOI18N
        WelcomeMessageLabel.setForeground(new java.awt.Color(255, 0, 51));
        WelcomeMessageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeMessageLabel.setText("WELCOME TO SWEET BANK!");

        IdentityText.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        IdentityText.setForeground(new java.awt.Color(153, 153, 153));
        IdentityText.setToolTipText("");
        IdentityText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IdentityTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdentityTextFocusLost(evt);
            }
        });

        ApplyButton.setBackground(new java.awt.Color(255, 204, 255));
        ApplyButton.setText("Apply");
        ApplyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ApplyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ApplyButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ApplyButtonMouseExited(evt);
            }
        });

        PasswortText.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        PasswortText.setForeground(new java.awt.Color(153, 153, 153));
        PasswortText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswortTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswortTextFocusLost(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(255, 204, 204));
        LoginButton.setText("Login");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });

        ApplyQuestionLabel.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        ApplyQuestionLabel.setText("Still not our customer?");

        javax.swing.GroupLayout LoginScreenPanelLayout = new javax.swing.GroupLayout(LoginScreenPanel);
        LoginScreenPanel.setLayout(LoginScreenPanelLayout);
        LoginScreenPanelLayout.setHorizontalGroup(
            LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PasswortText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                        .addComponent(ApplyQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IdentityText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WelcomeMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );
        LoginScreenPanelLayout.setVerticalGroup(
            LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(WelcomeMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(IdentityText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswortText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApplyQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        LoginScreenPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ApplyButton, IdentityText, PasswortText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        initComponents();
        this.setLocationRelativeTo(null);
        LoginScreenPanel.setFocusable(true);
        IdentityText.setText(ID_TEXT_ORIGINAL);
        PasswortText.setText(PASSWORT_TEXT_ORIGINAL);
        TextSettings.setOnlyNumber(IdentityText);
    }
    
    
    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        ButtonSettings.setBgFg(LoginButton, Color.cyan,Color.red);
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        ButtonSettings.setOriginalBgFg(LoginButton);
    }//GEN-LAST:event_LoginButtonMouseExited

    private void ApplyButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApplyButtonMouseEntered
        ButtonSettings.setBgFg(ApplyButton, Color.magenta,Color.yellow);
        
    }//GEN-LAST:event_ApplyButtonMouseEntered

    private void ApplyButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApplyButtonMouseExited
        ButtonSettings.setOriginalBgFg(ApplyButton);
    }//GEN-LAST:event_ApplyButtonMouseExited

    private void IdentityTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdentityTextFocusGained
        TextSettings.checkTheTextFocusGained(IdentityText, ID_TEXT_ORIGINAL);
    }//GEN-LAST:event_IdentityTextFocusGained

    private void IdentityTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdentityTextFocusLost
        TextSettings.checkTheTextFocusLost(IdentityText);
    }//GEN-LAST:event_IdentityTextFocusLost

    private void PasswortTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswortTextFocusGained
        TextSettings.checkTheTextFocusGained(PasswortText, PASSWORT_TEXT_ORIGINAL);
    }//GEN-LAST:event_PasswortTextFocusGained

    private void PasswortTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswortTextFocusLost
        TextSettings.checkTheTextFocusLost(PasswortText);
    }//GEN-LAST:event_PasswortTextFocusLost

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApplyButton;
    private javax.swing.JLabel ApplyQuestionLabel;
    private javax.swing.JTextField IdentityText;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginScreenPanel;
    private javax.swing.JPasswordField PasswortText;
    private javax.swing.JLabel WelcomeMessageLabel;
    // End of variables declaration//GEN-END:variables
}
