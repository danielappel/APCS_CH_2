package labs.APCS_CH2_Lab2.Solutions;


//**********************************************************
//  Circle.java
//
//  Print the area of a circle with two different radii
//**********************************************************
 
public class Circle
{
    public static void main(String[] args)
    {
     final double PI = 3.14159;
     
     int radius = 10;
     int scaleFactor = 2;
     int scaledRadius = scaleFactor*radius;
     double area = PI * radius * radius;
     double areaScaled = PI * scaledRadius * scaledRadius;
     
     
     double circumference;
     circumference = 2 * PI * radius;
     double circumferenceScaled = 2 * PI * scaledRadius;
 
     System.out.println("The area of a circle with radius " + radius +
                        " is " + area);
                        
     System.out.println("The area of a circle with radius modified by a scale factor of " 
                        + scaleFactor + " is " + areaScaled);
     
     System.out.println("The modification to the radius results in a ratio of areas of " + areaScaled/area);
                        
     System.out.println("The circumference of a circle with radius " + radius +
                        " is " + circumference);
                        
     System.out.println("The circumference of a circle with radius scaled by " + scaleFactor +
                        " is " + circumferenceScaled);
     
     System.out.println("The ratio of scaled circumference to original circumference is " + 
                        circumferenceScaled/circumference);
                        
 
     radius = 20;
     area = PI * radius * radius;
     circumference = 2 * PI * radius;
 
     System.out.println("The area of a circle with radius " + radius +
                        " is " + area);
                        
     System.out.println("The circumference of a circle with radius " + radius +
                        " is " + circumference);
 
    }
}
