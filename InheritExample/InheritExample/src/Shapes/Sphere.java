package Shapes;

/**
 *
 * @author speciosr
 */
public class Sphere extends Circle
{

    public Sphere(double radius, int xPoint, int yPoint) {
        super(radius, xPoint, yPoint);
    }
    
    @Override
    public double computeArea()
    {
        return 4 * super.computeArea();
    }

    @Override
    public String toString() 
    {
        String msg = "";
        
        msg = "Sphere Class \n";
        msg += "Circle Class radius " + super.radius + "\n";
        msg += "Shape Class x point " + xPoint + " y point " + yPoint + "\n";
        
        return msg;
    }
    
    
}
