
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BorderPanel extends JPanel
{
    public BorderPanel()
    {
        BorderLayout bl = new BorderLayout();
        //bl.setVgap(50);
       // bl.setHgap(100);
        this.setLayout(bl);
        this.setBackground(Color.GREEN);
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        this.add(new PushCounterPanel(), BorderLayout.CENTER);
        this.add(new LeftRightPanel(), BorderLayout.NORTH);
        this.add(new SlideColorPanel(), BorderLayout.SOUTH);
        this.add(new TextBoxPanel(), BorderLayout.EAST);
        this.add(new PushCounterPanel(), BorderLayout.WEST);

    }
}
