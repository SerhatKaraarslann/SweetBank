/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.settings;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Karaarslan
 */
public class TextSettings {
    
    private static String originalText;
    private static Color originalFgColor;
    
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
}
