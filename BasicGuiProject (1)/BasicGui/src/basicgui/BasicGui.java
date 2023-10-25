package basicgui;

import GUI.LeftRightPanel;
import GUI.PushCounterPanel;
import GUI.SlideColorPanel;
import GUI.TextBoxPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BasicGui 
{

    private static JFrame frame;
    private static JPanel panel1;

    
    public static void main(String[] args) 
    {
        frame = new JFrame("Push Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel1 = new JPanel();
        //panel1.add(new PushCounterPanel());
        //panel1.add(new LeftRightPanel());
        //panel1.add(new TextBoxPanel());
        panel1.add(new SlideColorPanel());
        //panel1 = new PushCounterPanel();
        //panel1 = new LeftRightPanel();
        //panel1 = new TextBoxPanel();
        
        frame.getContentPane().add(panel1);
        frame.pack();
        frame.setVisible(true);
    }
    

}
