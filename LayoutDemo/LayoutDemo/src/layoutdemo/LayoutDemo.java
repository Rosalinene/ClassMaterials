
package layoutdemo;

import GuiInterface.*;
import javax.swing.*;

public class LayoutDemo 
{

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Layout Manager Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTabbedPane tp = new JTabbedPane();
        
        tp.addTab("Intro", new IntroPanel());
        tp.addTab("Flow", new FlowLayoutPanel());
        tp.addTab("Border", new BorderPanel());
        tp.addTab("Grid", new GridManager());
        tp.addTab("Microwave", new MicrowavePanel());        
        
        
        frame.getContentPane().add(tp);
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
