package Shapes;

/**
 *
 * @author speciosr
 */
public class Circle extends Shape
{
    protected double radius;

    public Circle(double radius, int xPoint, int yPoint) {
        super(xPoint, yPoint);
        this.radius = radius;
    }
    
    
    @Override
    public double computeArea() 
    {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + " Circle{" + "radius=" + radius + '}';
    }

    
    @Override
    public double computerPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
