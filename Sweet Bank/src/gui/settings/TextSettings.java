/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.settings;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Karaarslan
 */
public class TextSettings {
    
    private static String originalText;
    private static Color originalFgColor;
    /**
     * Text Focus settings
     * @param textField
     * @param org 
     */
    public static void checkTheTextFocusGained(JTextField textField,String org)
    {
        originalText = org;
        if(textField.getText().trim().equals(org))
        {
            originalFgColor = textField.getForeground();
            textField.setText("");
        }
        
        textField.setForeground(Color.BLUE);
    }
    
    public static void checkTheTextFocusLost(JTextField textField)
    {
        if(textField.getText().trim().equals(""))
        {
            textField.setText(originalText);
            textField.setForeground(originalFgColor);
        }
        else
        {
            textField.setForeground(Color.BLACK);
        }
    }
    
    /**
     * Key Settings
    */
    public static void setOnlyNumber(JTextField textField)
    {
        textField.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isDigit(c))
                {
                    e.consume();
                }
            }
            
        });
    }
    
     public static void setOnlyAlphabetic(JTextField textField)
    {
        textField.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isAlphabetic(c) && c!= KeyEvent.VK_SPACE)
                {
                    e.consume();
                }
            }
            
        });
    }
     
     /*
     *Limit Settings
     */
     private static int limit;
     public static void setMaxLimit(JTextField textField,int lim)
     {
         limit = lim;
         textField.setDocument(new PlainDocument()
         {
             @Override
             public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                 if(str == null)
                     return;
                 if((getLength()+ str.length()<= limit))
                 super.insertString(offs, str, a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
             }
             
         });
     }
     
     
     public static boolean isLengthLessThan(int length, String str)
     {
         return (str.length() < length);
     }
     
     
     /**
      * Amount of Money Settings 
      */
     public static int checkTheTextKeyReleased(JTextField textField, int moneyLimit)
     {
        String text = textField.getText();
        if(!text.equals(""))
        {
        int amount = Integer.valueOf(text);
        if(amount > moneyLimit)
        {
            amount = moneyLimit;
            textField.setText(String.valueOf(amount));
        }
            return amount;
        }
        
             return 0;
        
     }
     
     /**
      * Text places settings
     * @param panel
     * @return 
      */
     
     public static boolean isTextPlacesFull(JPanel panel)
     {
         Component [] componenets = panel.getComponents();
         for(Component c : componenets)
         {
             if(c instanceof JTextField)
             {
                 JTextField textField = (JTextField) c;
                 if(textField.getText().trim().equals("") && textField.isEnabled())
                 {
                     return false;
                 }
             }
         }
         return true;
     }
}
