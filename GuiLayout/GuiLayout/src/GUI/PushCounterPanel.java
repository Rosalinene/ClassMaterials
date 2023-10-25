package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author speciosr
 */
public class PushCounterPanel extends JPanel
{
    private int count = 0;
    private JLabel label;
    private JButton push;

    public PushCounterPanel() 
    {
        label = new JLabel("Pushes: " + count);
        push = new JButton("Push Me!");
        push.addActionListener(new ButtonListener());
        
        this.add(push);
        this.add(label);
        this.setBackground(Color.CYAN);
        this.setPreferredSize(new Dimension(300, 100));

    }
    
    private class ButtonListener implements 
                                        ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            count++;
            label.setText("Pushes: " + count);
        }
        
    }
    
}
