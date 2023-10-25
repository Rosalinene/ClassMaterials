package GuiInterface;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutPanel extends JPanel
{

    public FlowLayoutPanel() 
    {
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        this.add(new JLabel("First Name"));
        this.add(new JTextField(8));
        this.add(new JLabel("MI"));
        this.add(new JTextField(1));
        this.add(new JLabel("Lastname"));
        this.add(new JTextField(8));
        
    }
    
}
