
package GUI;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IntroPanel extends JPanel
{

    public IntroPanel() 
    {
        this.setBackground(Color.GREEN);
        JLabel l1 = new JLabel("Layout Manager Demostraction");
        JLabel l2 = new JLabel("Choose a tab to see an example of a layout manager.");
        
        this.add(new JLabel("Layout Manager Demostraction"));
        this.add(l2);
        
    }
    
}
