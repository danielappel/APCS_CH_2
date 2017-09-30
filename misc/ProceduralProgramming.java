package misc;

/**
 * This is a demonstration of procudural programming
 *
 * @author Stanford AP Workshop
 * @version July, 2013
 */
public class ProceduralProgramming
{
    // instance variables (fields) normally go here,
    // but there are none when using all static methods

    /**
     * Constructor for objects of class TestClass normally go here,
     * but there are none when using all static methods.  This is what makes it PROCEDURAL vs. OOP
     */

    /**
     * Static methods can be called using the class name or
     * from anywhere within the class in which they are defined
     *
     * @param  val1  first of two values to be averaged
     * @param  val2  second of two values to be averaged
     * @return       the average of val1 and val2
     */
    public static double mean(double val1, double val2)
    {
        return (val1 + val2) / 2.0;
    }
    
     public static double sumOfSquares(double val1, double val2)
    {
        return (val1*val1 + val2*val2);
    }
    
    public static double magnitude(double val1, double val2)
    {
        return Math.sqrt(sumOfSquares(val1,val2));
    }
    
    public static void main(String[] args)
    {
        double x = 3.0;
        double y = 4.0;
        
        System.out.println("The mean of " + x + " and " + y + " is " + mean(x, y) );
        System.out.println("The sum of squares of " + x + " and " + y + " is " + sumOfSquares(x, y) );
        System.out.println("The magnitude " + x + " and " + y + " is " + magnitude(x, y) );
    }
}


