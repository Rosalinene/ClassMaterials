package GuiInterface;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class MicrowavePanel extends JPanel
{

    public MicrowavePanel() 
    {
        this.setLayout(new BorderLayout(5, 10));
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(4,3));
        
        for(int i=1; i<=9; i++)
            eastPanel.add(new JButton("" + i));
        
        eastPanel.add(new JButton("" + 0));
        eastPanel.add(new JButton("Start"));
        eastPanel.add(new JButton("Stop"));
        
        this.add(eastPanel, BorderLayout.EAST);
        this.add(new JTextField("Time to be display here"),
                        BorderLayout.WEST);
    }
    
}
