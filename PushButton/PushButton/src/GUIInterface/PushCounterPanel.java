package GUIInterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pushbutton.PushButton;

/**
 *
 * @author speciosr
 */
public class PushCounterPanel extends JPanel
{
    private static JButton push;
    private static JLabel label;
    private static int count = 0;

    public PushCounterPanel() 
    {
        push = new JButton("Push Me");
        push.addActionListener(new ButtonListener());
        
        label = new JLabel("Pushes " + count);
        
        add(push);
        add(label);
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(300, 40));
    }
    
    private static class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            count++;
            label.setText("Pushes: " + count);
        }
        
    }
    
}
