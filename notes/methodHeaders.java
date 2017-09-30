package notes;


/**
 * Write a description of class methodHeaders here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class methodHeaders
{
    private static int x;
    private static String s;

    public static void main(String[] args) {
        x = 4;
        double y = 3.0;
        calculateAverage(x, y);
    }

    public static int calculateAverage(int x, int y)
    {
        // put your code here
        return (x + y)/2;
    }
    
    public static double calculateAverage(int x, double y)
    {
        // put your code here
        return (x + y)/2;
    }
}
