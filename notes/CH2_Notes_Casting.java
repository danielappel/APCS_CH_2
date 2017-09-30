package notes;


/**
 * Quick notes looking at Chapter 2 of book
 */
public class CH2_Notes_Casting
{
    public static void casting() {
        int value = 4;
        double number;
        double decimal = 5.3;
        
        number = value;		//ok?
        System.out.println(number);
        
        
        //value = decimal;  //ok?
        value = (int) decimal; //explicit cast
        System.out.println(value);
        
        
        
    }
    
    public static void modFloats() {
        System.out.println("We will look at 12.9 % 3.2");
        System.out.println(2.0/3);
        System.out.println("float division of 12.9/3.2 = " + 12.9 / 3.2);
        System.out.println("Quotient = " + (int) (12.9/3.2));
        System.out.println("Quotient times 3.2 = " + 3.2*(int)(12.9/3.2));
        System.out.println("12.9 - quotient*3.2 = " + (12.9-3.2*(int)(12.9/3.2)));
        System.out.println("Mod evaluates to 12.9 % 3.2 = " + 12.9 % 3.2);
    }
}
