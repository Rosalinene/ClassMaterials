
package GUIInterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author speciosr
 */
public class FahrenheitPanel extends JPanel
{
    private JLabel lblInput, lblOutput, lblResult;
    private JTextField txtFahrenheit;

    public FahrenheitPanel() 
    {
        lblInput = new JLabel("Enter Fahrenheit temperture: ");
        lblOutput = new JLabel("Tempture in Celsius: ");
        lblResult = new JLabel("----");
        
        this.txtFahrenheit = new JTextField(5);
        this.txtFahrenheit.addActionListener(new TempListener());
        
        this.add(lblInput);
        this.add(this.txtFahrenheit);
        this.add(this.lblOutput);
        this.add(this.lblResult);
        
        this.setPreferredSize(new Dimension(300, 75));
        this.setBackground(Color.YELLOW);
    }
    
    private class TempListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            int fah, celsius;
            String txtFah;

            txtFah = txtFahrenheit.getText();
            
            fah = Integer.parseInt(txtFah);

            celsius = (fah - 32) * 5/9;
            lblResult.setText(Integer.toString(celsius));
        }
        
    }
    
}
