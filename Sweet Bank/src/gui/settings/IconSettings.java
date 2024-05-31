
package gui.settings;

import java.io.File;
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
        
            File file = new File("src/gui/icons/"+fileName+".png");
            if(!file.exists())
            {
                System.out.println("File can not found!");
                System.out.println(file.getAbsolutePath());
                return;
            }
            
           
     label.setIcon(new ImageIcon("src/gui/icons/"+fileName+".png"));
        
    }
}
