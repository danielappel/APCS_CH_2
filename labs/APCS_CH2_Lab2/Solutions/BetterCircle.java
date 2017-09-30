package labs.APCS_CH2_Lab2.Solutions;


//**********************************************************
//  Circle.java
//
//  Print the area of a circle with two different radii
//**********************************************************
 
public class BetterCircle
{
    static final double PI = 3.14159;
    
    public static void main(String[] args)
    {
        int radius = 10;
        int scalar = 2;
        
        double area = calculateArea(radius);
        double circ = calculateCirc(radius);
        printArea(area, radius);
        printCirc(circ, radius);
        
        double area2 = calculateArea(scalar * radius);
        double circ2 = calculateCirc(scalar * radius);
        printArea(area2, radius * scalar);
        printCirc(circ2, radius * scalar);
        
        compareArea(area, area2, scalar);
        compareCirc(circ, circ2, scalar);

    }
    
    public static double calculateArea(int radius) {
        return Math.pow(radius, 2) * PI;
    }
    
    public static double calculateCirc(int radius) {
        return 2 * radius * PI;
    }
    
    public static void printArea(double area, int radius) {
        System.out.println("A radius of " + radius + " gives an area of " + area);
    }
    
    public static void printCirc(double circ, int radius) {
        System.out.println("A radius of " + radius + " gives a circumference of " + circ);
    }
    
    
    public static void compareArea(double area, double area2, int scalar) {
        System.out.println("Multplying a radius by a scalar of " + scalar +
         " changes the areas by a factor of " + (area2/area));
    }
    
    public static void compareCirc(double circ, double circ2, int scalar) {
        System.out.println("Multplying a radius by a scalar of " + scalar +
         " changes the circumferences by a factor of " + (circ2/circ));
    }
}
