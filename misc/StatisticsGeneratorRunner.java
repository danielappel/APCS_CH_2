package misc;


/**
 * Write a description of class StatisticsGeneratorRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatisticsGeneratorRunner
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        StatisticsGenerator stat = new StatisticsGenerator();
            System.out.println(stat);
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

    }
}
