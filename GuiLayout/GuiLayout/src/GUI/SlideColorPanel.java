package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SlideColorPanel extends JPanel
{
    private JPanel controls, colorPanel;
    private JSlider rSlider, gSlider, bSlider;
    private JLabel rLabel, gLabel, bLabel;
    
    public SlideColorPanel()
    {
        rSlider = new JSlider(
                JSlider.HORIZONTAL, 
                0, 255, 0);
        rSlider.setMajorTickSpacing(50);
        rSlider.setMinorTickSpacing(10);
        rSlider.setPaintTicks(true);
        rSlider.setPaintLabels(true);
        rSlider.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        gSlider = new JSlider(
                JSlider.HORIZONTAL, 
                0, 255, 0);
        gSlider.setMajorTickSpacing(50);
        gSlider.setMinorTickSpacing(10);
        gSlider.setPaintTicks(true);
        gSlider.setPaintLabels(true);
        gSlider.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        bSlider = new JSlider(
                JSlider.HORIZONTAL, 
                0, 255, 0);
        bSlider.setMajorTickSpacing(50);
        bSlider.setMinorTickSpacing(10);
        bSlider.setPaintTicks(true);
        bSlider.setPaintLabels(true);
        bSlider.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        SliderListener listener = new SliderListener();
        rSlider.addChangeListener(listener);
        gSlider.addChangeListener(listener);
        bSlider.addChangeListener(listener);
        
        rLabel = new JLabel("Red: 0");
        rLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        gLabel = new JLabel("Green: 0");
        gLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        bLabel = new JLabel("Blue: 0");
        bLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        controls = new JPanel();
        BoxLayout layout = new BoxLayout(controls, 
                        BoxLayout.Y_AXIS);
        controls.setLayout(layout);
        controls.add(rLabel);
        controls.add(rSlider);
        controls.add(Box.createRigidArea(new Dimension(0, 20)));
        controls.add(gLabel);
        controls.add(gSlider);
        controls.add(Box.createRigidArea(new Dimension(0, 20)));
        controls.add(bLabel);
        controls.add(bSlider);        
        
        colorPanel  = new JPanel();
        colorPanel.setPreferredSize(new Dimension(100,100));
        colorPanel.setBackground(new Color(0,0,0));
        
        this.add(controls);
        this.add(colorPanel);
        
    }
            
    private class SliderListener implements ChangeListener
    {
        private int red, green, blue;
        
        @Override
        public void stateChanged(ChangeEvent e) 
        {
            red = rSlider.getValue();
            green = gSlider.getValue();
            blue = bSlider.getValue();
            
            rLabel.setText("Red: " + red);
            gLabel.setText("Green: " + green);
            bLabel.setText("Blue: " + blue);
            
            colorPanel.setBackground(new Color(red, green, blue));
        }
        
    }
    
}
