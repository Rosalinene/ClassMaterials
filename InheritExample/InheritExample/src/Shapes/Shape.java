package Shapes;

/**
 *
 * @author speciosr
 */
public abstract class Shape 
{
    protected int xPoint;
    protected int yPoint;

    public Shape(int xPoint, int yPoint) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }
    
    abstract public double computeArea();
    abstract public double computerPerimeter();

    @Override
    public String toString() {
        return "Shape{" + "xPoint=" + xPoint + ", yPoint=" + yPoint + '}';
    }
    
    
}
