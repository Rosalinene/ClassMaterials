package GUI;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame
{
    private JTabbedPane tabPane;
    
    public MainFrame()
    {
        this.setTitle("Layout Managers");
        tabPane = new JTabbedPane();
        
        tabPane.addTab("Intro", new IntroPanel());
        tabPane.addTab("Flow", new FlowPanel());
        tabPane.addTab("Border", new BorderPanel());
        tabPane.addTab("Grid", new GridPanel());
        tabPane.addTab("Box", new BoxPanel());
        
        this.getContentPane().add(tabPane);
        this.setPreferredSize(new Dimension(500, 500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
