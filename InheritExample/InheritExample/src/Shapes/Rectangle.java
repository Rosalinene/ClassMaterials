package Shapes;

import java.text.DecimalFormat;

/**
 *
 * @author speciosr
 */
public class Rectangle extends Shape 
{
    protected double width;
    protected double length;
    protected static DecimalFormat form = new DecimalFormat("0.##");

    /*
    
    */
    /**
     * Constructor 
     * 
     * @param width a double value for the width of the rectangle
     * @param length a double value for the length of the rectangle
     */
    

    public Rectangle(double width, double length, int xPoint, int yPoint) {
        super(xPoint, yPoint);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 
     * @return 
     */
    public double getLength() {
        return length;
    }

    /**
     * 
     * @param length 
     */
    public void setLength(double length) {
        this.length = length;
    }
    
    
    @Override
    public double computeArea() 
    {
        return length * width;
    }

    @Override
    public double computerPerimeter() 
    {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString() + 
           " Rectangle{" + "width=" + width + ", length=" + length + '}';
    }


    
    
}
