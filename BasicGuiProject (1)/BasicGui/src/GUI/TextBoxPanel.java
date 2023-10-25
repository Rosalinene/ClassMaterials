package GUI;

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

public class TextBoxPanel extends JPanel
{
    private JLabel lblFirst, lblLast, lblFullName;
    private JTextField txtFirst, txtLast;
    private JButton cmdGo;
    private JCheckBox chkBold, chkItalic;
    private JRadioButton optSize12, optSize48;
    private JComboBox ddMessage;
    private ButtonGroup group;
    
    private int style;
    private String [] data = {"Brave New World", 
                                "Welcome to the Jungle"};
    
    public TextBoxPanel()
    {
        lblFirst = new JLabel("First Name");
        lblLast = new JLabel("Last Name");
        lblFullName = new JLabel();
        
        txtFirst = new JTextField(10);
        txtLast = new JTextField(10);
        
        cmdGo = new JButton("GO");
        ButtonListener listener = new ButtonListener();
        cmdGo.addActionListener(listener);
        txtFirst.addActionListener(listener);
        txtLast.addActionListener(listener);
        
        chkBold = new JCheckBox("Bold");
        chkItalic = new JCheckBox("Italic");
        chkBold.setBackground(Color.YELLOW);
        chkItalic.setBackground(Color.YELLOW);
        StyleListener sListener = new StyleListener();
        chkBold.addItemListener(sListener);
        chkItalic.addItemListener(sListener);
        
        group = new ButtonGroup();
        optSize12 = new JRadioButton("Font Size 12", true);
        optSize48 = new JRadioButton("Font Size 48");
        optSize12.setBackground(Color.YELLOW);
        optSize48.setBackground(Color.YELLOW);
        optSize12.addActionListener(listener);
        optSize48.addActionListener(listener);
        group.add(optSize12);
        group.add(optSize48);

        ddMessage = new JComboBox(data);
        ddMessage.addItem("Hello World");
        ddMessage.addActionListener(listener);
        
        this.add(lblFirst);
        this.add(txtFirst);
        this.add(lblLast);
        this.add(txtLast);
        this.add(cmdGo);
        this.add(chkBold);
        this.add(chkItalic);
        this.add(optSize12);
        this.add(optSize48);
        this.add(ddMessage);
        this.add(lblFullName);

        
        this.setBackground(Color.YELLOW);
        this.setPreferredSize(new Dimension(200, 300));
    }
    
    private class StyleListener implements ItemListener
    {

        @Override
        public void itemStateChanged(ItemEvent e) 
        {
            style = Font.PLAIN;
            
            if(chkBold.isSelected())
                style = Font.BOLD;
            
            if(chkItalic.isSelected())
                style += Font.ITALIC;
            
            lblFullName.setFont(new Font("Helvetica", style, 36));

            
        }
        
    }
    private class ButtonListener implements 
                                        ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {    
            Object source = e.getSource();
            
            
            if(source == cmdGo)
            {
                lblFullName.setText(txtFirst.getText() + " " +
                    txtLast.getText());
            }
            else if(source == txtFirst)
            {
                lblFullName.setText("Hello " + 
                        txtFirst.getText() + " " +
                        txtLast.getText());
            }
            else if(source == txtLast)
            {
                lblFullName.setText("Welcome " +
                        txtFirst.getText() + " " +
                        txtLast.getText());
            }
            else if(source == optSize12)
                lblFullName.setFont(
                        new Font("Helvetica", style, 12));
            else if(source == optSize48)
                lblFullName.setFont(
                        new Font("Helvetica", style, 48));
            else if(source == ddMessage)
            {
                String temp = (String)ddMessage.getSelectedItem();
                lblFullName.setText(temp);
            }
          }
        
    }
}
