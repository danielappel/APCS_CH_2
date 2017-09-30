package notes;




/**
 * Write a description of class Ch2_Notes_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ch2_Notes_EscapeSequences_DataTypes
{
    enum Days {Monday, Tuesday, Wednesday, Thursday, Friday};
    
    public static void escapeSequences() {
        System.out.println("This will print a sp\bace within a string");
        System.out.println("This will print a \nnewline");
        System.out.println("This will print a \"quote\"");
    }
    
    public static void dataTypes() {
        //Java is a STRONGLY typed language.  You can't easily overwrite data with
        // a differnt type.
        
        int x, y;  // delaring our variables
        
        //We can assign a value to these
        
        x = 3;
        y = 4;
        
        //You can do it all at once
        
        double z = 5.0;
        
        System.out.println(x + y);
        System.out.println(x + z);
        
        //Multiply two ints
        System.out.println(x * y);  //answer = 
        System.out.println(x * z);  //answer = 
        
        System.out.println(x / y);  //answer =
        System.out.println(x / z);  //answer = 
        
        //We also have to know modular arithmetic (mod thing).  Symbol is %
        System.out.print("Here are our mod examples");
        System.out.println(3 % 2);  //answer = 
        System.out.println(13 % 5);  //answer = 
        System.out.println(0.3 % 2);  //answer = 
        System.out.println(0.3 % 0.2);  //answer = 
        
        //We can declare constants.  The convention is all CAPS
        
        final int MAX_SCORE = 10;
        
    }
    
    public static void enumeratedTypes() {
        Days today;
        
        today = Days.Tuesday;
        
        System.out.println(today);
        
        
    }
}
