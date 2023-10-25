package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class LeftRightPanel extends JPanel
{
    private JButton left, right;
    private JLabel label;
    private JPanel buttonPanel;

    public LeftRightPanel() 
    {
        left = new JButton("Left");
        right = new JButton("Right");
        
        ButtonListener listener = new ButtonListener();
        left.addActionListener(listener);
        right.addActionListener(listener);
        
        label = new JLabel("Push a Button");
        
        buttonPanel = new JPanel();
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.setBackground(Color.BLUE);
        buttonPanel.setPreferredSize(new Dimension(200, 40));
        
        this.add(label);
        this.add(buttonPanel);
        
        this.setBackground(Color.CYAN);
        this.setPreferredSize(new Dimension(200, 80));
                
    }
    
    private class ButtonListener implements 
                                        ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {           
            if(e.getSource() == left)
                label.setText("Left");
            else
                label.setText("Right");
        }
        
    }
}
