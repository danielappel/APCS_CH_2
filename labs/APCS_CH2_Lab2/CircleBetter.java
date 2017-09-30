package labs.APCS_CH2_Lab2;


//**********************************************************
//  Circle.java
//
//  Print the area of a circle with two different radii
//**********************************************************
 
public class CircleBetter
{
    //Class level variables (like a global variable in python)
    static final double PI = 3.14159;
    
    public static void main(String[] args)
    {
     int scalar = 2;
     int radius = 10;
     //Create a method for area: double area = PI * radius * radius;
     double area = calculateArea(radius);
     double circumference = calcCircumference(radius);
     printArea(radius, area);
     printCircumference(radius, circumference);
 
     radius = radius * scalar;
     double area2 = calculateArea(radius);
     double circumference2 = calcCircumference(radius);
     printArea(radius, area2);
     printCircumference(radius, circumference2);
     
     //Comparison
     double ratioArea = compare(area2, area);
     double ratioCircumf = compare(circumference2, circumference);
     
     printComparison(scalar, ratioArea, ratioCircumf);
     
    }
    
    public static double calculateArea(int radius) {        
        return Math.pow(radius, 2) * PI;
    }
    
    public static double calcCircumference(int radius) {
        return 2 * radius * PI;
    }
    
    public static double compare(double val1, double val2) {
        return val1 / val2;
    }
    
    public static void printArea(int radius, double area) {
         System.out.println("The area of a circle with radius " + radius +
                        " is " + area);
    }
    
    public static void printCircumference(int radius, double circ){
        System.out.println("The circumference of a circle with radius " + radius +
        " is " + circ);
    }
    
    public static void printComparison(double scalar, double area, double circ) {
        System.out.println("Circles that vary in radii by a scalar of " + scalar +
        " will result \n in a ratio of areas of " + area + " and circumferences of " +
        circ);
    }
}