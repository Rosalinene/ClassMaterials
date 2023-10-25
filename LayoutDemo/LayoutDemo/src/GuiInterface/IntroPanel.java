
package GuiInterface;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IntroPanel extends JPanel
{

    public IntroPanel() 
    {
        this.setBackground(Color.green);
        
        JLabel l1 = new JLabel("Layout Manager Demo");
        JLabel l2 = new JLabel("Choose a tab");
        
        this.add(l1);
        this.add(l2);
        
    }
    
}
