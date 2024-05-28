
package gui.settings;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Karaarslan
 */
public class IconSettings {
    
    private static Icon originalIcon;
    
    public static void changeIcon(JLabel label, String fileName)
    {
        originalIcon = label.getIcon();
        label.setIcon(new ImageIcon(Package.getPackages().getClass().getResource("/gui/icons/"+fileName)));
    }
}
