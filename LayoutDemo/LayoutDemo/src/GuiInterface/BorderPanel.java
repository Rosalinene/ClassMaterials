
package GuiInterface;

import java.awt.BorderLayout;
import javax.swing.*;

public class BorderPanel extends JPanel
{

    public BorderPanel() 
    {
        this.setLayout(new BorderLayout(5, 10));
        this.add(new JButton("East"), BorderLayout.EAST);
        this.add(new JButton("West"), BorderLayout.WEST);
        this.add(new JButton("North"), BorderLayout.NORTH);
        this.add(new JButton("South"), BorderLayout.SOUTH);
        this.add(new JButton("Center"), BorderLayout.CENTER);        
        //this.add(new GridManager(), BorderLayout.CENTER);        
    }
    
}
