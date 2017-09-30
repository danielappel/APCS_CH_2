package misc;

/**
 * This is a demonstration of object oriented programming
 *
 * @author Stanford AP Workshop
 * @version July, 2013
 */
public class StatisticsGenerator
{
    // instance variables (fields) are declared here, but not defined
    private double val1;
    private double val2;

    /**
     * Constructor for objects of class StatisticsGenerator
     */
    public StatisticsGenerator()
    {
        // initialise instance variables
        this.val1 = 3;
        this.val2 = 4;
        
    }
    
    /*
     * Second constructor of class StatisticsGenerator
     */
    public StatisticsGenerator(double input1, double input2)
    {
        //initialise instance variables
        this.val1 = input1;
        this.val2 = input2;
        
    }
    
    public double getFirstField()
    {
        return val1;
    }
    
    public double getSecondField()
    {
        return val2;
    }
    
    /**
     * mean calculates and returns the arithmetic mean of the instance fields
     *
     * @return  the arithmetic mean of instance fields val1 and val2
     */
    public double mean()
    {
        // put your code here
        return (val1 + val2) / 2.0;
    }
    
    /**
     * sum of squares calculates the sum of squares
     *
     * @return  the sum of squares of instance fields val1 and val2
     */
    public double sumOfSquares()
    {
        // put your code here
        return Math.pow(val1,2)+ Math.pow(val2,2);
    }
    
    public double magnitude()
    {
        // put your code here
        return Math.sqrt(this.sumOfSquares());
    }
    
    
    
    public static void main(String[] args)  //this is STATIC as it doesn't act on val1 and val2 which are the instance variables
    {
        /*  This code can be uncommented and run OR you can run through the StatisticsGeneratorRunner class
         * StatisticsGenerator stat = new StatisticsGenerator();
        System.out.println("The mean of " + stat.getFirstField() + " and " +
                                            stat.getSecondField() + " is " + stat.mean() );
                                            
        System.out.println("The sum of squares of " + stat.getFirstField() + " and " +
                                            stat.getSecondField() + " is " + stat.sumOfSquares() );
        
        System.out.println("The magnitude of " + stat.getFirstField() + " and " +
                                            stat.getSecondField() + " is " + stat.magnitude() );
        
        //created with different constructor
        StatisticsGenerator stat2 = new StatisticsGenerator(10.0, 11.0);
         System.out.println("The mean of " + stat2.getFirstField() + " and " +
                                            stat2.getSecondField() + " is " + stat2.mean() );
                                            
        System.out.println("The sum of squares of " + stat2.getFirstField() + " and " +
                                            stat2.getSecondField() + " is " + stat2.sumOfSquares() );
        
        System.out.println("The magnitude of " + stat2.getFirstField() + " and " +
                                            stat2.getSecondField() + " is " + stat2.magnitude() );
         */
    }
}


