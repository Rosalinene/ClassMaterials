package GuiInterface;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame
{
    private JPanel mainPanel;
    public MainFrame(String string)
    {
        super(string);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new JPanel();
               
        this.setTitle("Flow Layout");
        this.setPreferredSize(new Dimension(200, 200));
        this.setLocationRelativeTo(null);
        
        //mainPanel.setLayout(new GridLayout(2,2,5,5));
        //mainPanel.add(new FlowLayoutPanel());
        //mainPanel.add(new GridManager());
        //mainPanel.add(new BorderPanel());
        
        //mainPanel.add(new GridManager());
        //mainPanel.add(new FlowLayoutPanel());
        
        //this.getContentPane().add(new FlowLayoutPanel());
        //this.getContentPane().add(new GridManager());
        //this.getContentPane().add(mainPanel);
        //this.getContentPane().add(new BorderPanel());
        this.getContentPane().add(new MicrowavePanel());
        
        this.pack();
        this.setVisible(true);
    }
    
}
