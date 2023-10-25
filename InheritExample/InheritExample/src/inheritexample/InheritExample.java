package inheritexample;

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Sphere;

/**
 * This class is the main of the program or the driver of the program. 
 * 
 * @author speciosr
 */
public class InheritExample 
{

    /**
     * This is the driver of the program.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Rectangle myRect = new Rectangle(5, 6, 1, 45);
        
        double area;
        area = myRect.computeArea();
        System.out.println("Area is " + area);
        System.out.println(myRect);
        
        // encapulation is broken
        //myRect.length = 10;
        area = myRect.computeArea();
        System.out.println("Area is " + area);
        
        Circle myCircle = new Circle(6.4, 45, 34);
        area = myCircle.computeArea();
        System.out.println("Area is " + area);
        System.out.println(myCircle);
        
        Sphere mySphere = new Sphere(8.2, 55, 10);
        area = mySphere.computeArea();
        System.out.println("Area is " + area);
        System.out.println(mySphere);
    }
    
}
