/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.settings;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Karaarslan
 */
public class ButtonSettings {
    
    private static Color originalBgColor;
    private static Color originalFgColor;
    /**
     * Background and Textcolor Settings
     * @param button
     * @param bgColor
     * @param fgColor 
     */
    public static void setBgFg(JButton button, Color bgColor,Color fgColor)
    {
        originalBgColor = button.getBackground();
        originalFgColor = button.getForeground();
        button.setBackground(bgColor);
        button.setForeground(fgColor);
    }
    
    public static void setOriginalBgFg(JButton button)
    {
        button.setBackground(originalBgColor);
        button.setForeground(originalFgColor);
    }
}
