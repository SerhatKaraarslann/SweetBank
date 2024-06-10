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
}
