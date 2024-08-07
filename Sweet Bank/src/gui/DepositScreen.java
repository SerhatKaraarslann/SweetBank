/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IInfoController;
import database.transactions.AccountInfo;
import database.transactions.Deposit;
import gui.settings.ActionSettings;
import gui.settings.Dialogs;
import gui.settings.IRegulator;
import gui.settings.TextSettings;
import javax.swing.JOptionPane;

/**
 *
 * @author Karaarslan
 */
public class DepositScreen extends javax.swing.JFrame implements IRegulator,IInfoController{

    private Deposit depositObject = null;
    
    
    private int depositAmount = 0;
    
    /**
     * Creates new form DepositScreen
     */
    public DepositScreen() {
        initComponents();
        getEdits();
    }
    
     @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        DepositPanel.setFocusable(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
         TextSettings.setOnlyNumber(DepositText);
         TextSettings.setMaxLimit(DepositText, 5);
         this.UsernameSurnameLabel.setText("Dear " + this.getAccountInfo().getName_Surname());
         this.TotalBalanceLabel.setText(String.valueOf(this.getAccountInfo().getBalance()));
    }

    @Override
    public boolean isInfoValid() {
        return !(this.DepositText.getText().equals(""));
    }

    @Override
    public AccountInfo getAccountInfo() {
        return AccountInfo.getInstance();
    }

    public Deposit getDepositObject() {
        if(depositObject == null)
        {
            depositObject = new Deposit();
        }
        
        return depositObject;
    }

    

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DepositPanel = new javax.swing.JPanel();
        UsernameSurnameLabel = new javax.swing.JLabel();
        TotalBalanceLabel = new javax.swing.JLabel();
        LimitLabel = new javax.swing.JLabel();
        DepositAmountLabel = new javax.swing.JLabel();
        BalanceLabel = new javax.swing.JLabel();
        DepositText = new javax.swing.JTextField();
        DepositButton = new javax.swing.JButton();
        BackIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deposit Screen");

        DepositPanel.setBackground(new java.awt.Color(153, 153, 255));

        UsernameSurnameLabel.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        UsernameSurnameLabel.setForeground(new java.awt.Color(255, 0, 0));
        UsernameSurnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsernameSurnameLabel.setText("Dear [USERNAME AND SURNAME]");

        TotalBalanceLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        TotalBalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TotalBalanceLabel.setText("Total Balance :");

        LimitLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        LimitLabel.setText("You can deposit 40.000 Euros or less at a time!");

        DepositAmountLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        DepositAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DepositAmountLabel.setText("Amount to Deposit:");

        BalanceLabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        BalanceLabel.setText("Balance");

        DepositText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositTextActionPerformed(evt);
            }
        });
        DepositText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DepositTextKeyReleased(evt);
            }
        });

        DepositButton.setBackground(new java.awt.Color(153, 153, 153));
        DepositButton.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        DepositButton.setText("Deposit");
        DepositButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositButtonActionPerformed(evt);
            }
        });

        BackIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/previousIcon.png"))); // NOI18N
        BackIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DepositPanelLayout = new javax.swing.GroupLayout(DepositPanel);
        DepositPanel.setLayout(DepositPanelLayout);
        DepositPanelLayout.setHorizontalGroup(
            DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositPanelLayout.createSequentialGroup()
                .addGroup(DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DepositPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UsernameSurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DepositPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TotalBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DepositAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BalanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(DepositText))))
                .addGap(33, 33, 33))
            .addGroup(DepositPanelLayout.createSequentialGroup()
                .addGroup(DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DepositPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(LimitLabel))
                    .addGroup(DepositPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BackIcon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DepositPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DepositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        DepositPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BalanceLabel, DepositText, TotalBalanceLabel});

        DepositPanelLayout.setVerticalGroup(
            DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BackIcon)
                .addGap(29, 29, 29)
                .addComponent(UsernameSurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(LimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalBalanceLabel))
                .addGap(37, 37, 37)
                .addGroup(DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepositText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(DepositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        DepositPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BalanceLabel, DepositText, TotalBalanceLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DepositPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DepositPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DepositTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositTextActionPerformed

    private void DepositTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DepositTextKeyReleased
        this.depositAmount = TextSettings.checkTheTextKeyReleased(DepositText, 40000);
    }//GEN-LAST:event_DepositTextKeyReleased

    private void DepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositButtonActionPerformed
        if(this.isInfoValid())
        {
            this.deposit();
        }
        else
        {
            Dialogs.notEmptyMessage(this);
        }
    }//GEN-LAST:event_DepositButtonActionPerformed
        
    private void deposit()
    {
        this.getDepositObject().setDepositAmount(depositAmount);
       
       if(getDepositObject().isDepositComplete())
       {
           Dialogs.specialMessage(this, "Deposit is complete.\n"
           + "Deposit Amount: "+this.depositAmount+ " Euro");
           ActionSettings.setVisible(this,new AccountScreen());
       }
       
       else
       {
           Dialogs.specialMessage(this, "Check your infos!");
       }
       
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
            java.util.logging.Logger.getLogger(DepositScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackIcon;
    private javax.swing.JLabel BalanceLabel;
    private javax.swing.JLabel DepositAmountLabel;
    private javax.swing.JButton DepositButton;
    private javax.swing.JPanel DepositPanel;
    private javax.swing.JTextField DepositText;
    private javax.swing.JLabel LimitLabel;
    private javax.swing.JLabel TotalBalanceLabel;
    private javax.swing.JLabel UsernameSurnameLabel;
    // End of variables declaration//GEN-END:variables

    

   
}
