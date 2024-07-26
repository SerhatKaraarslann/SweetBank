/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.settings;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Karaarslan
 */
public class Dialogs {
    
    public static void notEmptyMessage(JFrame frame)
    {
        JOptionPane.showMessageDialog(frame, "All places should be full!");
    }
    public static void specialMessage(JFrame frame, String message)
    {
        JOptionPane.showMessageDialog(frame, message);
    }

    public static int confirmMessage(JFrame frame, String message)
    {
        int optionTyp = JOptionPane.YES_NO_OPTION;
        int selected = JOptionPane.showConfirmDialog(frame, message,"WARNING",optionTyp);
        if(optionTyp == selected)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    
    
}


