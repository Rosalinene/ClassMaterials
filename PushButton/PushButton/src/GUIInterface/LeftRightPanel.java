package GUIInterface;

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
public class LeftRightPanel extends JPanel
{
    private JButton btLeft, btRight;
    private JLabel lblLabel;
    private JPanel buttonPanel;
    
    public LeftRightPanel() 
    {
        btLeft = new JButton("Left");
        btRight = new JButton("Right");
        ButtonListener btListener = new ButtonListener();
        btLeft.addActionListener(btListener);
        btRight.addActionListener(btListener);
        
        lblLabel = new JLabel("Push a Button");
        
        buttonPanel = new JPanel();
        buttonPanel.add(btLeft);
        buttonPanel.add(btRight);
        buttonPanel.setBackground(Color.BLUE);
        buttonPanel.setPreferredSize(new Dimension(200, 40));
        
        setBackground(Color.CYAN);
        this.setPreferredSize(new Dimension(200, 80));
        
        add(lblLabel);
        add(buttonPanel);        
    }
    
    private class ButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource() == btLeft)
                lblLabel.setText("Left");
            else
                lblLabel.setText("Right");
        }
        
    }
}
