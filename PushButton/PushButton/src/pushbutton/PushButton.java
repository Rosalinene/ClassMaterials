package pushbutton;


import GUIInterface.FahrenheitPanel;
import GUIInterface.LeftRightPanel;
import GUIInterface.PushCounterPanel;
import GUIInterface.TextBoxPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author speciosr
 */
public class PushButton 
{

    private static JFrame frame;
    private static PushCounterPanel panel1;  
    private static LeftRightPanel panelLR;
    private static TextBoxPanel panelTxt;
    private static FahrenheitPanel panelFah;
    private static JPanel allPanels;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        frame = new JFrame("Push Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        allPanels = new JPanel();
        
        panel1 = new PushCounterPanel();
        panelLR = new LeftRightPanel();
        panelTxt = new TextBoxPanel();
        panelFah = new FahrenheitPanel();
        
        allPanels.add(panel1);
        allPanels.add(panelLR);
        allPanels.add(panelTxt);
        allPanels.add(panelFah);
        
        frame.getContentPane().add(allPanels);
               
        frame.pack();
        frame.setVisible(true);
    }//end of main
    
}
