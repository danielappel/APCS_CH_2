package book;


/**
 * Write a description of class CH2_Notes_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CH2_Notes_2
{
    enum Days {Monday, Tuesday, Wednesday, Thursday, Friday };
    
    public static void escapeSequences() {
        System.out.println("This will print a sp\bace within a string");
        
        System.out.println("This will print a \nnewline");
        
        System.out.println("This will print a \"quote\"");
    }
    
    public static void dataTypes() {
        //We have to declare our data type
        int x, y;  
        double z;
        
        //We can then assign a value to it (instantiate)        
        x = 3;
        y = 4;
        z = 5.0;
        
        System.out.println(x + y);
        System.out.println(x + z);
        
        System.out.println(x / y);
        System.out.println(x / z);
        
        //Modular Arithmetic (mod symolized with %)
        
        System.out.println(3 % 2);
        System.out.println(0.3 % 2);
        System.out.println(0.3 % 0.2);
        
        final int MAX_SCORE = 10;
       
        
   
        
    }
    
    public static void enumeratedTypes() {
        //Has to be at class level
        
        Days today;
        
        today = Days.Tuesday;
        
        System.out.println(today);
    }
    
    public static void dataConversions() {
        //You can change numeric data type as follows:
        
        //assignment conversion
        
        int x = 3;
        double y;
        
        int z;
        
        y = x;
        //z = y;  This produces an compile error
        System.out.println("From assignment conversion " + y);
        
        //Arithmetic Promotion
        
        double w = 1.9999999999;
        
        System.out.println("From arithmetic promotion " + w * x);
        
        //Via casting, datatype to be cast to goes in parentheses
        
        int r = (int) w;
        System.out.println("Via casting " + r);
        
        byte t = (byte) r;
        System.out.println("Going back to a double " + t);
    }
}
