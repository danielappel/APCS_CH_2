package book;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Write a description of class CH2_NOTES_3_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CH2_NOTES_3_3
{
    public static void stringExamples() {
        //Construct with the 'new' keyword
        
        String title = new String("I am a string object that is longer");
        
        String name = "I am a string literal";
        
        System.out.println("The string:" + title + " is " + title.length() + " long");
        System.out.println(title.charAt(title.length()-1));
        System.out.println(name.length());
        
        
    }
    
    public static void wrapperClasser() {
        //Will turn a primitive into an object
        
        //For ints
        
        Integer myValue = new Integer(5);
        
        System.out.println(myValue + 6); //should be 11 
        System.out.println(myValue.toString() + 6); //should be 56
        
        //We can still assign value to primitive from a wrapper class
        
        int myInt;
        
        myInt = myValue;  //example of auto-boxing (non-AP topic)
        
        System.out.println(myInt + 6);  //should be 11
        
        //System.out.println(myInt.toString() + 6); //will produce an error
        
        Integer myInt2;
        
        myInt2 = myValue;
        
        System.out.println(myInt2.toString());
        
        
        Double myDouble = new Double(3.0);
        
        Double myDouble2 = new Double(2.99999999999);
        
        System.out.println(myDouble.equals(myDouble2));
        
  
    }
    
    public static void scannerExamples() {
        Scanner myScanner = new Scanner(System.in);    
        
        String name;
        
        System.out.println("What is your name? ");
        name = myScanner.nextLine();
        System.out.println("Hello there " + name);
        
        System.out.println("Anyone else? ");
        String name2 = myScanner.next();  //This will only go to the first space
        System.out.println("Hello there " + name2);
        
        //We can ask for numbers
        
        String space1 = myScanner.next();
        
        //Might have to convert this to an int (String?);
        int myValue = myScanner.nextInt();
        
        String space2 = myScanner.next();
        
        double myValue2 = myScanner.nextDouble();
       
        System.out.print(myValue);
        System.out.print(" , ");
        System.out.println(myValue2);
        //The following input will make the above crash:
        //Dan Appel
        //Joe Appel
        //It will capture the space after Joe as the next int.  

    }
    
    public static void usingClassLibraries() {
       //Use the math class to perform common operations.  It has static methods
       
       System.out.println((int)Math.pow(2.0, 3.0)); //raise 2 to the 3rd power
       System.out.println(Math.sqrt(-16.0));  //should produce 4.0
       
       //We can format numbers as currency or percentages wih NumberFormat
       // import java.text.NumberFormat
       NumberFormat money = NumberFormat.getCurrencyInstance(); //Object??
       NumberFormat percent = NumberFormat.getPercentInstance(); //Object??
       
       System.out.println("Formatting $45.35 with a number: " + money.format(45.35));
       
       System.out.println("Formatting 65% with a number: " + percent.format(0.65));
    }
}
