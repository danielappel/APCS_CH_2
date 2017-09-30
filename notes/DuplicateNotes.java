package notes;


/**
 * Write a description of class CH2_Notes_2 here.
 * 
 * Examples of concepts presented in CH2 of Lewis Loftus and Cocking (3rd Edition_
 * 
 * @author D. Appel
 * @version 2014
 */
public class DuplicateNotes

{
    enum Days {Monday, Tuesday, Wednesday};  
    
    public static void main(String[] args) {
        //Show some simple data conversions via python to show differene between strong type and weak type
    }
    
    public static void dataTypes() {
        //Java is a "strongly typed" language.  That is, you can't easily overwrite the data type
    
        //Here are our integers.  We can declare a datatype
        int x, y;
        
        //We can now set those variables to a value
        x = 3;
        y = 2;
        
        //For those interested in seeing the type of object.
        Object xType;
        xType = (Object) x;
        System.out.println("Here is the data type " + xType.getClass());
        
        //You can also do this all in one line
        int z = 4;
        
        //The "+" operator works for these as expected:
        System.out.println(x + y);
        
        //However, we can also change this by using our String data type.
        String a, b;
        a = "Hello ";
        b = " there";
        
        System.out.println(a + b);
    }
    
    public static void escapeSequences(){
        //We can also use escape sequences to get out of a string:
        System.out.println("This will print a sp\bace within a string");  //Not on AP
        
        System.out.println("This will print a \ttab between characters"); //Not on AP
        
        System.out.println("This will create a \nnewline");
        
        System.out.println("This will \rcreate a carriage return");  //not on AP
        
        System.out.println("This will \"quote\" whatever is inside of them.  Note, you need two of them");
        
        System.out.println("This will allow for a backslash, \\, whithin the text");
    }
    
    public static void  operatorPrecedence() {
        System.out.println(3 % 2);
        System.out.println(0.3 % 2);
        System.out.println(0.3 % 0.2);
        
        int result = 20 * 1 % 4 + 5;
        System.out.println("20 * 1 % 4 + 5 gives result " + result);
        
        result = (20 + 1) % 4 + 5;
        System.out.println("(20 + 1) % 4 + 5 gives result " + result);
        
        //Order of precedence: 
        // Unary + or Minus (positive or negative number)
        // *, / or % (Left to right)
        // +, - or + (string concatenation)
        // = via assignment
    }
    
    public static void dataConversions() {
        //You can change numeric data type as follows:
        //assignment conversion
        int x = 3;
        double y;
        y = x;
        System.out.println("The result from assignment conversion " + y);  //only allows for widening
        
        double z = 4.0;
        //x = z;  //will produce an error
        
        //Arithmetic Promotion
        double w = x * z;
        
        //Cating
        int r = (int) w;  //you will lose data this way
        System.out.println("This is the result from casting a double to an int " + r);
        
        
        //
    }
    
    public static  void enumeratedTypes() {
        //Will produce an error on the location of enum
        //enum Days {Monday, Tuesday, Wednesday};  
        
        Days today;
        
        today = Days.Tuesday;
        
        System.out.println(today);
    }
}
