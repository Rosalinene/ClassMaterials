package GUIInterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author speciosr
 */
public class TextBoxPanel extends JPanel
{
    private JLabel lblFirst, lblLast, lblFullname;
    private JTextField txtFirst, txtLast;
    private JButton btGo;
    private JCheckBox chkBold, chkItalic;
    private JRadioButton optSize12, optSize48;
    private ButtonGroup group; 
    private JComboBox ddMessage;
  
    public TextBoxPanel() 
    {
        lblFirst = new JLabel("First Name");
        lblLast = new JLabel("Last Name");
        lblFullname = new JLabel("");
        chkBold = new JCheckBox("Bold");
        chkItalic = new JCheckBox("Italic");
                
        txtFirst = new JTextField(10);
        txtLast = new JTextField(10);
        
        btGo = new JButton("Go");
        
        optSize12 = new JRadioButton("Font Size 12", true);
        optSize48 = new JRadioButton("Font Size 48");
        optSize48.setBackground(Color.yellow);
        
        group = new ButtonGroup();
        group.add(optSize12);
        group.add(optSize48);
        
        String [] data = {"Brave New World", "Welcome to the Jungle"};
        ddMessage = new JComboBox(data);
        ddMessage.addItem("Hello World");;
        
        ButtonListener eventListener = new ButtonListener();
        StyleListener styleListener = new StyleListener();
        
        
        btGo.addActionListener(eventListener);
        txtFirst.addActionListener(eventListener);
        txtLast.addActionListener(eventListener);
        this.chkBold.addItemListener(styleListener);
        this.chkItalic.addItemListener(styleListener);
        this.optSize12.addActionListener(eventListener);
        this.optSize48.addActionListener(eventListener);
        this.ddMessage.addActionListener(eventListener);
        
        this.add(lblFirst);
        this.add(txtFirst);
        this.add(lblLast);
        this.add(txtLast);
        this.add(btGo);
        this.add(lblFullname);
        this.add(chkBold);
        this.add(chkItalic);
        this.add(optSize12);
        this.add(optSize48);
        this.add(ddMessage);
        
        this.setBackground(Color.YELLOW);
        this.setPreferredSize(new Dimension(300, 120));
    }
    
    private class StyleListener implements ItemListener
    {

        @Override
        public void itemStateChanged(ItemEvent e) 
        {
            int style=0;
            
            if (chkBold.isSelected()) 
            {
                style = Font.BOLD;
            }

            if (chkItalic.isSelected()) 
            {
                style += Font.ITALIC;
            }

            lblFullname.setFont(new Font("Helvetic", style, 20));
        }
        
    }
    private class ButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            int style = 0;
            Object source  = e.getSource();
            
            if(source == btGo)
            {
                if(chkBold.isSelected())
                    style = Font.BOLD;
                
                if(chkItalic.isSelected())
                    style += Font.ITALIC;
                
                lblFullname.setFont(new Font("Helvetic", style, 36));
                
                lblFullname.setText(txtFirst.getText() + " " + txtLast.getText());
            }
            else if(source == txtFirst)
            {
                lblFullname.setFont(new Font("Helvetic", style, 10));
                lblFullname.setText("Hello " + txtFirst.getText() + " " 
                        + txtLast.getText());
            }
            else if(source == txtLast)
                lblFullname.setText("Welcome " + txtFirst.getText() + " " 
                        + txtLast.getText());
            else if(source == optSize12)
                lblFullname.setFont(new Font("Helvetic", style, 12));
            else if(source == optSize48)
                lblFullname.setFont(new Font("Helvetic", style, 48));
            else if(source == ddMessage)
            {
                String temp = (String)ddMessage.getSelectedItem();
                lblFullname.setText(temp);
            }
        }
    }
    
}
