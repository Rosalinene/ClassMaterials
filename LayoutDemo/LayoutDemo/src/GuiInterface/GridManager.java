package GuiInterface;

import java.awt.GridLayout;
import javax.swing.*;

public class GridManager extends JPanel
{

    public GridManager() 
    {
        this.setLayout(new GridLayout(3, 2, 5, 5));
        this.add(new JLabel("First Name"));
        this.add(new JTextField(8));
        this.add(new JLabel("MI"));
        this.add(new JTextField(1));
        this.add(new JLabel("Last Name"));
        this.add(new JTextField(8));
    }

}
